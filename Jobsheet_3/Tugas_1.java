import java.util.Scanner;

public class Tugas_1 {
    public static void main(String[] args) {
        int harga_motor, uang_muka, sisa_bayar;
        byte periode_cicilan;
        double cicilan_per_bulan, bunga_per_bulan, jml_cicilan_per_bulan;
        float bunga = 0.01f;

        Scanner sc = new Scanner(System.in);

        System.out.print("Harga Motor: ");
        harga_motor = sc.nextInt();
        System.out.print("Uang Muka: ");
        uang_muka = sc.nextInt();
        System.out.print("Periode (bulan): ");
        periode_cicilan = sc.nextByte();
        
        sc.close();

        sisa_bayar = harga_motor - uang_muka;
        cicilan_per_bulan = sisa_bayar / periode_cicilan;
        bunga_per_bulan = sisa_bayar * bunga;
        jml_cicilan_per_bulan = cicilan_per_bulan + bunga_per_bulan;

        System.out.println(String.format("\nCicilan yang harus dibayar per bulan: Rp %.0f", jml_cicilan_per_bulan));
    }
}