import java.util.Scanner;

public class TargetHeartRate14 {
    public static void main(String[] args) {
        // Deklarasi variabel
        Scanner sc = new Scanner(System.in);
        int usia, hr, mhr;
        double mhr_presentase;
        String kategori, saran;

        // Input usia dan detak jantung
        System.out.print("Usia     = ");
        usia = sc.nextInt();
        System.out.print("HR       = ");
        hr = sc.nextInt();

        // Validasi input
        if (usia < 10 || usia > 100 || hr < 0) {
            System.out.println("\nInput tidak valid, coba lagi!");
            System.exit(1);
        }

        // Hitung minimum detak jantung dan presentase
        mhr = 220 - usia;
        mhr_presentase = Math.round((double) hr/mhr * 100);

        // Pemilihan untuk zona denyut jantung latihan
        if (mhr_presentase > 85) {
            kategori = "Sangat Berat";
            saran = "Beresiko bagi pemula, batasi durasi.";
        } else if (mhr_presentase > 69) {
            kategori = "Kuat";
            saran = "Meningkatkan kapasitas kardiorespirasi.";
        } else if (mhr_presentase > 59) {
            kategori = "Sedang";
            saran = "Zona aerobik nyaman.";
        } else if (mhr_presentase > 49) {
            kategori = "Ringan";
            saran = "Peningkatan dasar kebugaran.";
        } else {
            kategori = "Sangat ringan";
            saran = "Pemanasan, manfaat minimal.";
        }

        // Tampilkan hasil
        System.out.println("\n=========== HASIL DENYUT JANTUNG LATIHAN ===========");
        System.out.printf("MHR      = %d\n", mhr);
        System.out.printf("%%MHR     = %.0f%%\n", mhr_presentase);
        System.out.printf("Kategori = %s\n", kategori);
        System.out.printf("\n%s", saran);
        
        sc.close();
    }
}
