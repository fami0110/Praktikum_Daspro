import java.util.Scanner;

/*  Case Method 1
 *  
 * Nama  : Masando Fami Ramadhan
 * Kelas : SIB 1B
 * No    : 14
 * Link  : https://github.com/fami0110/Praktikum_Daspro/tree/main/CaseMethod_2
 * 
 */

public class CM2Beasiswa_14 {

    static Scanner sc = new Scanner(System.in);

    static int getOption() {
        System.out.println("\n===== Sistem Pembayaran Beasiswa ====");
        System.out.println("1. Tambah Data Pendaftar Beasiswa");
        System.out.println("2. Tampilkan Semua Pendaftar");
        System.out.println("3. Cari Pendaftar berdasarkan Jenis Beasiswa");
        System.out.println("4. Hitung Rata-rata IPK per Jenis Beasiswa");
        System.out.println("5. Keluar");
        System.out.print("\nPilih menu (1-5): ");
        
        int option = sc.nextInt();
        sc.nextLine();

        System.out.println();

        return option;
    }

    static boolean tambahData(
        String[] nama_mhs,
        String[] nim_mhs,
        double[] ipk_mhs,
        String[] jenisBeasiswa_mhs,
        int[] penghasilanOrtu_mhs,
        int index
    ) {
        // Deklarasi variabel temporal untuk input
        String nama, nim, jenisBeasiswa;
        double ipk;
        int penghasilanOrtu;

        // Proses input
        System.out.print("Nama Mahasiswa:\n> ");
        nama = sc.nextLine();

        System.out.print("\nNIM:\n> ");
        nim = sc.nextLine();
        
        System.out.print("\nIPK Terakhir:\n> ");
        ipk = sc.nextDouble();
        sc.nextLine();
        
        System.out.print("\nJenis Beasiswa (Reguler/Unggulan/Riset):\n> ");
        jenisBeasiswa = sc.nextLine();

        System.out.print("\nPenghasilan Ortu (Maksimal Rp 2.000.000):\n> ");
        penghasilanOrtu = sc.nextInt();
        

        // Validasi data input
        String[] validBeasiswa = {"Reguler", "Unggulan", "Riset"};
        int pilihanBeasiswa = -1;

        for (int i = 0; i < validBeasiswa.length; i++) {
            if (jenisBeasiswa.equalsIgnoreCase(validBeasiswa[i])) {
                pilihanBeasiswa = i;
                break;
            }
        }

        boolean penghasilanValid = (penghasilanOrtu >= 0 && penghasilanOrtu <= 2_000_000);
        
        boolean kuotaTersedia = (index < nama_mhs.length);

        boolean ipkValid = (ipk <= 4.0 && ipk >= 0.0);

        if ((pilihanBeasiswa != -1) && penghasilanValid && kuotaTersedia && ipkValid) {
            nama_mhs[index] = nama;
            nim_mhs[index] = nim;
            ipk_mhs[index] = ipk;
            jenisBeasiswa_mhs[index] = validBeasiswa[pilihanBeasiswa];
            penghasilanOrtu_mhs[index] = penghasilanOrtu;

            System.out.println("\nPendaftar berhasil disimpan! Total pendaftar: " + (index+1));

            return true;
        } else {
            System.out.print("\nPendaftaran dibatalkan, karena ");

            if (!kuotaTersedia) {
                System.out.print("kuota pendaftaran telah penuh!");
            } else if (!ipkValid) {
                System.out.print("IPK tidak valid!");
            } else if (!(pilihanBeasiswa != -1) && !penghasilanValid) {
                System.out.print("jenis beasiswa dan penghasilan tidak valid!");
            } else if (!(pilihanBeasiswa != -1)) {
                System.out.print("jenis beasiswa tidak valid!");
            } else if (!penghasilanValid) {
                System.out.print("penghasilan tidak valid!");
            }

            System.out.println();

            return false;
        }
    }

    static void tampilData(
        String[] nama_mhs,
        String[] nim_mhs,
        double[] ipk_mhs,
        String[] jenisBeasiswa_mhs,
        int[] penghasilanOrtu_mhs,
        int total_pendaftar
    ) {
        System.out.println("┌───────────────────────────┬──────────────┬──────┬────────────────┬──────────────────┐");
        
        System.out.printf("│ %-25s │ %-12s │ %-4s │ %-14s │ %-16s │\n", "Nama", "NIM", "IPK", "Jenis Beasiswa", "Penghasilan Ortu");

        System.out.println("├───────────────────────────┼──────────────┼──────┼────────────────┼──────────────────┤");
        
        for (int i = 0; i < total_pendaftar; i++) {
            System.out.printf("│ %-25s │ %-12s │ %-4.2f │ %-14s │ %-16s │\n", 
                nama_mhs[i], nim_mhs[i], ipk_mhs[i], jenisBeasiswa_mhs[i], String.format("Rp %,d", penghasilanOrtu_mhs[i]).replace(',', '.'));
        }

        System.out.println("└───────────────────────────┴──────────────┴──────┴────────────────┴──────────────────┘");
    }

    static void filterDanTampil(
        String[] nama_mhs,
        String[] nim_mhs,
        double[] ipk_mhs,
        String[] jenisBeasiswa_mhs,
        int[] penghasilanOrtu_mhs,
        int total_pendaftar
    ) {
        int jumlahPendaftar = nama_mhs.length;

        String[] nama_filtered = new String[jumlahPendaftar];
        String[] nim_filtered = new String[jumlahPendaftar];
        double[] ipk_filtered = new double[jumlahPendaftar];
        String[] jenisBeasiswa_filtered = new String[jumlahPendaftar];
        int[] penghasilanOrtu_filtered = new int[jumlahPendaftar];
        
        System.out.print("Masukkan jenis beasiswa: ");
        String filter = sc.nextLine();
        
        int jumlah = 0;

        for (int i = 0; i < total_pendaftar; i++) {
            if (jenisBeasiswa_mhs[i].equalsIgnoreCase(filter)) {
                nama_filtered[jumlah] = nama_mhs[i];
                nim_filtered[jumlah] = nim_mhs[i];
                ipk_filtered[jumlah] = ipk_mhs[i];
                jenisBeasiswa_filtered[jumlah] = jenisBeasiswa_mhs[i];
                penghasilanOrtu_filtered[jumlah] = penghasilanOrtu_mhs[i];

                jumlah++;
            }
        }

        System.out.println();

        tampilData(nama_filtered, nim_filtered, ipk_filtered, jenisBeasiswa_filtered, penghasilanOrtu_filtered, jumlah);
    }

    static void rataRataBeasiswa(
        double[] ipk_mhs,
        String[] jenisBeasiswa_mhs,
        int total_pendaftar
    ) {
        String[] validBeasiswa = {"Reguler", "Unggulan", "Riset"};
        int pilihanBeasiswa;

        double[][] rekapitulasi = new double[3][2];

        for (int i = 0; i < total_pendaftar; i++) {
            pilihanBeasiswa = -1;

            for (int j = 0; j < validBeasiswa.length; j++) {
                if (jenisBeasiswa_mhs[i].equalsIgnoreCase(validBeasiswa[j])) {
                    pilihanBeasiswa = j;
                    break;
                }
            }

            rekapitulasi[pilihanBeasiswa][0]++;
            rekapitulasi[pilihanBeasiswa][1] += ipk_mhs[i];
        }

        System.out.println("┌────────────────┬─────────────────┬───────────────┐");
        
        System.out.printf("│ %-14s │ %-15s │ %-13s │\n", "Jenis Beasiswa", "Total Pendaftar", "Rata-rata IPK");

        System.out.println("├────────────────┼─────────────────┼───────────────┤");

        for (int i = 0; i < rekapitulasi.length; i++) {
            System.out.printf("│ %-14s │ %-15s │ %-13s │\n", 
                validBeasiswa[i], 
                (rekapitulasi[i][0] == 0) ? 
                    "(Tidak Ada)" : String.format("%.0f", rekapitulasi[i][0]), 
                (rekapitulasi[i][0] == 0) ? 
                    "-" : String.format("%.2f", (rekapitulasi[i][1] / rekapitulasi[i][0]))
            );
        }

        System.out.println("└────────────────┴─────────────────┴───────────────┘");
    }

    public static void main(String[] args) {
        System.out.print("Masukkan jumlah kuota pendaftar: ");
        int jumlahPendaftar = sc.nextInt();
        
        sc.nextLine();
        System.out.println();

        String[] nama_mhs = new String[jumlahPendaftar];
        String[] nim_mhs = new String[jumlahPendaftar];
        double[] ipk_mhs = new double[jumlahPendaftar];
        String[] jenisBeasiswa_mhs = new String[jumlahPendaftar];
        int[] penghasilanOrtu_mhs = new int[jumlahPendaftar];
        
        int total_pendaftar = 0;
        int option;
        
        while (true) {

            option = getOption();
            
            if (option == 1) {
                if (tambahData(nama_mhs, nim_mhs, ipk_mhs, jenisBeasiswa_mhs, penghasilanOrtu_mhs, total_pendaftar))
                    total_pendaftar++;
            } else if (option == 2) {
                tampilData(nama_mhs, nim_mhs, ipk_mhs, jenisBeasiswa_mhs, penghasilanOrtu_mhs, total_pendaftar);
            } else if (option == 3) {
                filterDanTampil(nama_mhs, nim_mhs, ipk_mhs, jenisBeasiswa_mhs, penghasilanOrtu_mhs, total_pendaftar);
            } else if (option == 4) {
                rataRataBeasiswa(ipk_mhs, jenisBeasiswa_mhs, total_pendaftar);
            } else if (option == 5) {
                System.out.println("Keluar program...");
                break;
            } else {
                System.out.println("Pilihan menu tidak valid, silahkan coba lagi!");
            }
        }
    }
}