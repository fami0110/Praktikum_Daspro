import java.util.Scanner;

public class SistemPenjualan14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jml_cabang, jml_pelanggan, item_terjual;
        int tot_pelanggan = 0, tot_item_terjual = 0;

        System.out.print("Jumlah cabang: ");
        jml_cabang = sc.nextInt();

        System.out.println("====== Input Penjualan per Cabang ======");

        for (int i = 1; i <= jml_cabang; i++) {
            System.out.printf("\n--- Cabang %d ---\n", i);

            System.out.print("Jumlah pelanggan: ");
            jml_pelanggan = sc.nextInt();
            
            item_terjual = 0;
            for (int j = 1; j <= jml_pelanggan; j++) {
                System.err.printf("- Pelanggan %d memesan berapa item? ", j);
                item_terjual += sc.nextInt();
            }

            System.out.printf("Cabang %d:\n", i);
            System.out.printf("- Pelanggan    : %d\n", jml_pelanggan);
            System.out.printf("- Item Terjual : %d\n", item_terjual);

            tot_pelanggan += jml_pelanggan;
            tot_item_terjual += item_terjual;
        }

        System.out.println("\nTotal seluruh cabang:");
        System.out.printf("- Pelanggan    : %d\n", tot_item_terjual);
        System.out.printf("- Item Terjual : %d\n", tot_pelanggan);

        sc.close();
    }
}