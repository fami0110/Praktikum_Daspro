// Nama  : Masando Fami Ramadhan
// NIM   : 254107060011
// Kelas : SIB 1B

import java.util.Scanner;

public class Soal114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jml_elemen, jml_ganjil = 0, jml_genap = 0;

        System.out.print("Masukkan jumlah elemen array: ");
        jml_elemen = sc.nextInt();
        
        int bilangan[] = new int[jml_elemen];

        System.out.println("=============================");
        
        for (int i = 0; i < bilangan.length; i++) {
            System.out.print("Masukkan nilai elemen ke-"+(i+1)+": ");
            bilangan[i] = sc.nextInt();

            if (bilangan[i] % 2 == 0) {
                jml_genap++;
            } else {
                jml_ganjil++;
            }
        }
        
        System.out.println("=============================");

        System.out.println("Jumlah semua elemen: " + bilangan.length);
        System.out.println("Jumlah elemen ganjil: " + jml_ganjil);
        System.out.println("Jumlah elemen genap: " + jml_genap);

        sc.close();
    }
}
