import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        // Deklarasi variabel
        Scanner sc = new Scanner(System.in);
        int hargaKotor = 0, totalTiketTerjual = 0;
        double diskon = 0, totalBayar = 0, totalPenjualanBersih = 0;

        // Input jumlah pelanggan
        System.out.print("Masukkan total pelanggan hari ini: ");
        int jumlahPelanggan = sc.nextInt();

        int i = 0;

        while (i < jumlahPelanggan) {
            System.out.println("\n--- Pelanggan ke-" + (i + 1) + " ---");
            System.out.print("Masukkan jumlah tiket yang dibeli: ");
            int jumlahTiket = sc.nextInt();

            // Validasi input
            if (jumlahTiket < 0) {
                System.out.println("❌ Jumlah tiket tidak valid. Silakan masukkan ulang.");
                continue;
            }

            hargaKotor = jumlahTiket * 50000;

            // Hitung Diskon
            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }

            // Hitung total harga setelah diskon
            totalBayar = (double) hargaKotor - ((double) hargaKotor * diskon);

            // Update total keseluruhan
            totalTiketTerjual += jumlahTiket;
            totalPenjualanBersih += totalBayar;

            System.out.printf("Harga Kotor: Rp %d\n", hargaKotor);
            System.out.printf("Diskon: %.0f%%\n", (diskon * 100));
            System.out.printf("Total Bayar: Rp %.0f\n", totalBayar);

            // Update counter
            i++;
        }

        // Tampilkan hasil akhir
        System.out.println("\n====== LAPORAN PENJUALAN ======");
        System.out.println("Total Tiket Terjual: " + totalTiketTerjual + " tiket");
        System.out.printf("Pendapatan Bersih: Rp %.2f%n", totalPenjualanBersih);
        System.out.println("=================================");

        sc.close();
    }
}