import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        int gajiPokok;
        double bonus, totGaji;
        int tunTransp = 600000, tunjMkn = 400000;
        Scanner sc = new Scanner(System.in);

        System.out.print("Gaji pokok: ");
        gajiPokok = sc.nextInt();
        sc.close();

        bonus = gajiPokok * 0.05;
        totGaji = gajiPokok + tunTransp + tunjMkn + bonus - (gajiPokok * 0.1);

        System.out.println("Bonus bulanan Anda adalah Rp. " + bonus);
        System.out.println("Gaji yang diterima adalah Rp. " + (int) totGaji);
    }
}