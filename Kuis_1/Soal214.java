// Nama  : Masando Fami Ramadhan
// NIM   : 254107060011
// Kelas : SIB 1B

import java.util.Scanner;

public class Soal214 {

    public static void main(String[] args) {
        int harga_barang, jumlah_unit;
        float diskon;
        double subtotal, total_kotor, total_bersih;

        Scanner sc = new Scanner(System.in);

        System.out.print("Harga Barang   : ");
        harga_barang = sc.nextInt();

        System.out.print("Jumlah Unit    : ");
        jumlah_unit = sc.nextInt();

        System.out.print("Diskon (%)     : ");
        diskon = sc.nextInt();

        sc.close();

        // Menghitung subtotal
        subtotal = harga_barang * jumlah_unit;
        System.out.println(String.format("\nSubtotal       : Rp %.0f", subtotal));
        
        // Potongan harga (diskon x%)
        total_kotor = subtotal - (subtotal * (diskon/100));
        System.out.println(String.format("Diskon         : Rp %.0f", (subtotal * (diskon/100))));
        
        // Biaya ongkir tetap
        total_kotor += 20000;
        System.out.println("Ongkir         : Rp 20000");
        
        // Biaya asuransi (1%)
        total_kotor += subtotal * 0.01;
        System.out.println(String.format("Biaya Asuransi  : Rp %.0f", (subtotal * 0.01)));
        System.out.println(String.format("Total Kotor    : Rp %.0f", total_kotor));
        
        // Hitung tambahan PPN dari total kotor
        total_bersih = total_kotor + (total_kotor * 0.11);
        System.out.println(String.format("PPN            : Rp %.0f", (total_kotor * 0.11)));
        System.out.println(String.format("Total bersih   : Rp %.0f", total_bersih));
    }
}