import java.util.Scanner;

public class IfCetakKRS14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();
        sc.close();

        System.out.println(uktLunas ? "Pembayaran UKT terverifikasi" : "Registrasi ditolak");
    }
}