import java.util.Scanner;

public class Segitiga14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alas, tinggi;
        float luas;

        System.out.print("Masukkan Alas: ");
        alas = sc.nextInt();
        System.out.print("Masukkan Tinggi: ");
        tinggi = sc.nextInt();

        luas = alas * tinggi / 2;
        System.out.println("Luas segitiga: " + luas);
    }
}