import java.util.Scanner;

/*  Case Method 1
 *  
 * Nama  : Masando Fami Ramadhan
 * Kelas : SIB 1B
 * No    : 14
 * 
 */

public class CM1_14 {

    // Fungsi untuk konversi nilai angka -> nilai huruf
    public static String hitungNilaiHuruf(double nilaiAkhir) {
        String nilaiHuruf = null;
        
        if (nilaiAkhir > 100 || nilaiAkhir < 0) {
            // Untuk mencegah user menginptkan nilai yang tidak valid (diluar rentang 0 sampai 100)
            System.out.println("\nINPUT NILAI TIDAK VALID! SILAHKAN COBA LAGI.");
            System.exit(1);
        } else if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }

        return nilaiHuruf;
    }

    public static void main(String[] args) {
        // Deklarasi Variable
        Scanner sc = new Scanner(System.in);
        String nama, nim;
        int uts1, uts2, uas1, uas2, tugas1, tugas2;
        double nilaiAkhir1, nilaiAkhir2, rata_rata;
        String nilaiHuruf1, nilaiHuruf2;

        // Input data mahasiswa (opsional)
        System.out.println("======== INPUT DATA ========");
        System.out.print("Nama\t: ");
        nama = sc.nextLine();
        System.out.print("NIM\t: ");
        nim = sc.nextLine();

        // Input data nilai mata kuliah 1
        System.out.println("\n-------- Mata Kuliah 1: Algoritma dan Pemograman --------");
        System.out.print("Nilai UTS\t: ");
        uts1 = sc.nextInt();
        System.out.print("Nilai UAS\t: ");
        uas1 = sc.nextInt();
        System.out.print("Nilai Tugas\t: ");
        tugas1 = sc.nextInt();
        
        // Input data nilai mata kuliah 2
        System.out.println("\n-------- Mata Kuliah 2: Struktur Data -------------------");
        System.out.print("Nilai UTS\t: ");
        uts2 = sc.nextInt();
        System.out.print("Nilai UAS\t: ");
        uas2 = sc.nextInt();
        System.out.print("Nilai Tugas\t: ");
        tugas2 = sc.nextInt();

        sc.close();
        
        // Hitung nilai akhir tiap mata kuliah
        // Ketentuan: Nilai UTS (30%), Nilai UAS (40%), Nilai Tugas (30%)
        nilaiAkhir1 = (0.3 * uts1) + (0.4 * uas1) + (0.3 * tugas1);
        nilaiAkhir2 = (0.3 * uts2) + (0.4 * uas2) + (0.3 * tugas2);
        nilaiHuruf1 = hitungNilaiHuruf(nilaiAkhir1);
        nilaiHuruf2 = hitungNilaiHuruf(nilaiAkhir2);

        // Cetak dan format hasil penilaian akademik
        System.out.println("\n\n============================= HASIL PENILAIAN AKADEMIK =============================");
        System.out.println("Nama\t: " + nama);
        System.out.println("NIM\t: " + nim);
        
        System.out.println("\nMata Kuliah\t\tUTS\tUAS\tTugas\tNilai Akhir\tNilai Huruf\tStatus");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.printf("%s\t%d\t%d\t%d\t%.2f\t\t%s\t\t%s\n", 
            "Algoritma Pemograman", uts1, uas1, tugas1, nilaiAkhir1, nilaiHuruf1, (nilaiAkhir1 >= 60) ? "LULUS":"TIDAK LULUS");
        System.out.printf("%s\t%d\t%d\t%d\t%.2f\t\t%s\t\t%s\n", 
            "Struktur Data\t", uts2, uas2, tugas2, nilaiAkhir2, nilaiHuruf2, (nilaiAkhir1 >= 60) ? "LULUS":"TIDAK LULUS");
        
        // Hitung rata rata nilai semester
        rata_rata = (nilaiAkhir1+nilaiAkhir2)/2;
        System.out.printf("\nRata-rata Nilai Akhir\t: %.2f\n", rata_rata);
        System.out.printf("Status Semester\t\t: %s\n", (rata_rata >= 70) ? "LULUS":"TIDAK LULUS (Rata-rata dibawah 70)");
    }
}