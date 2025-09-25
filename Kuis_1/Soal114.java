// Nama  : Masando Fami Ramadhan
// NIM   : 254107060011
// Kelas : SIB 1B

import java.util.Scanner;

public class Soal114 {

    public static void main(String[] args) {
        int gaji_pokok, tun_transport, tun_makan, gaji_kotor;
        float potongan;
        double gaji_bersih;

        Scanner sc = new Scanner(System.in);

        System.out.print("Gaji pokok          : ");
        gaji_pokok = sc.nextInt();

        System.out.print("Tunjangan Transport : ");
        tun_transport = sc.nextInt();

        System.out.print("Tunjangan Makan     : ");
        tun_makan = sc.nextInt();

        System.out.print("Potongan (%)        : ");
        potongan = sc.nextInt();

        sc.close();

        gaji_kotor = gaji_pokok + tun_makan + tun_transport;
        gaji_bersih = gaji_kotor - (gaji_kotor * (potongan/100));

        System.out.println(String.format("\nGaji Kotor  : Rp %.0f", (double) gaji_kotor));
        System.out.println(String.format("Potongan    : Rp %.0f", gaji_kotor - gaji_bersih));
        System.out.println(String.format("Gaji bersih : Rp %.0f", gaji_bersih));
    }
}