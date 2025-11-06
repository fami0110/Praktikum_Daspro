import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlPesanan, totalBiaya = 0;

        System.out.print("Masukkan jumlah pesanan = ");
        jmlPesanan = sc.nextInt();

        String namaPesanan[] = new String[jmlPesanan];
        int hargaPesanan[] = new int[jmlPesanan];

        for (int i = 0; i < jmlPesanan; i++) {
            System.out.println("\n---| Pesanan Ke-"+(i+1)+" |----------");
            
            sc.nextLine();
            System.out.print("Nama  = ");
            namaPesanan[i] = sc.nextLine();
            
            System.out.print("Harga = ");
            hargaPesanan[i] = sc.nextInt();

            totalBiaya += hargaPesanan[i];
        }

        System.out.println("\n========== Invoice Belanja ==========\n");

        System.out.printf("%-25s %-8s\n", "Nama Pesanan", "Harga");
        System.out.println("-----------------------------------");
        for (int i = 0; i < jmlPesanan; i++) {
            System.out.printf("%-25s %-8s\n", namaPesanan[i], hargaPesanan[i]);
        }
        System.out.println("-----------------------------------");
        System.out.println("\nTotal Biaya = " + totalBiaya);

        sc.close();
    }
}
