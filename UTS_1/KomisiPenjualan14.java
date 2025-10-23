import java.util.Scanner;

public class KomisiPenjualan14 {
    public static void main(String[] args) {
        // Deklarasi variabel
        Scanner sc = new Scanner(System.in);
        int omzet, rating, bonus = 0;
        double presentase, komisi, total_komisi;
        String sertifikasi;

        // Input nilai
        System.out.print("Omzet (Rp)            = ");
        omzet = sc.nextInt();
        System.out.print("Rating (1-100)        = ");
        rating = sc.nextInt();
        sc.nextLine();
        System.out.print("Sertfikasi (ya/tidak) = ");
        sertifikasi = sc.nextLine();

        // Validasi nilai
        if (omzet < 0) {
            System.out.println("Input omzet salah, coba lagi!");
            System.exit(1);
        } else if (rating < 1 || rating > 100) {
            System.out.println("Input rating salah, coba lagi!");
            System.exit(1);
        }

        // Pemilihan berdasarkan input untuk menentukan presentase dan bonus
        if (rating >= 70) {
            if (omzet < 50_000_000) {
                presentase = 0.01;
            } else if (omzet < 100_000_000) {
                presentase = 0.02;
            } else {
                presentase = 0.03;
            }

            if (rating >= 90) {
                presentase += 0.01;
            }

            if (sertifikasi.equalsIgnoreCase("ya")) {
                bonus = 500_000;
            }
        } else {
            presentase = 0;
        }

        // Hitung komisi dan total komisi
        komisi = (omzet * presentase);
        total_komisi = komisi + bonus;

        // Cetak hasil perhitungan
        System.out.println("\n======== HASIL PERHITUNGAN KOMISI PENJUALAN ========");
        System.out.printf("Presentase Akhir    = %.0f%%\n", presentase*100);
        System.out.printf("Jumlah Komisi       = RP %.0f\n", komisi);
        System.out.printf("Bonus Sertifikasi   = RP %d\n", bonus);
        System.out.printf("Total Komisi        = RP %.0f\n", total_komisi);

        sc.close();
    }
}
