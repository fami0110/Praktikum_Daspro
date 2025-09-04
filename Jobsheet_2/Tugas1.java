import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int gaji_pokok, jumlah_anak, tunjangan_anak;

        double potongan_simpanan = 0.05,
            jml_tunjangan,
            jml_potongan,
            gaji_bersih;

        // input nilai
        System.out.print("Masukkan gaji pokok: ");
        gaji_pokok = sc.nextInt();
        System.out.print("Masukkan jumlah anak: ");
        jumlah_anak = sc.nextInt();
        System.out.print("Masukkan tunjangan anak (per bulan): ");
        tunjangan_anak = sc.nextInt();

        // Hitung jumlah tunjangan
        jml_tunjangan = jumlah_anak * tunjangan_anak;

        // Hitung potongan simpanan
        jml_potongan = gaji_pokok * potongan_simpanan;

        // Hitung gaji bersih
        gaji_bersih = gaji_pokok + jml_tunjangan - jml_potongan;

        // Cetak hasil
        System.out.println(String.format("Jumlah tunjangan: Rp %.0f", jml_tunjangan));
        System.out.println(String.format("Jumlah potongan: Rp %.0f", jml_potongan));
        System.out.println(String.format("Gaji bersih: Rp %.0f", gaji_bersih));
    }
}