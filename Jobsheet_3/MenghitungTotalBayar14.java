import java.util.Scanner;

public class MenghitungTotalBayar14 {
    public static void main(String[] args) {
        double harga;
        double potongan, jml_bayar, diskon = 0.15;
        Scanner sc = new Scanner(System.in);

        System.out.print("harga: ");
        harga = sc.nextInt();
        sc.close();

        potongan = harga * diskon;
        jml_bayar = harga - potongan;

        System.out.println(String.format("Potongan: %.2f", potongan));
        System.out.println(String.format("Jumlah Bayar: %.2f", jml_bayar));
    }
}
