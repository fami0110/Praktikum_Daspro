import java.util.Scanner;

public class Tugas_2 {
    public static void main(String[] args) {
        double total_bensin, biaya_bensin;
        int harga_bensin = 10000;
        float jarak_tempuh, km_per_liter = 2.0f;

        Scanner sc = new Scanner(System.in);

        System.out.print("Jarak tempuh (km): ");
        jarak_tempuh = sc.nextFloat();
        sc.close();

        total_bensin = jarak_tempuh / km_per_liter;
        biaya_bensin = total_bensin * harga_bensin;

        System.out.println(String.format("Biaya bensin: Rp %.0f", biaya_bensin));
    }
}