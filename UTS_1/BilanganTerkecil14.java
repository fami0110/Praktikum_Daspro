import java.util.Scanner;

public class BilanganTerkecil14 {
    public static void main(String[] args) {
        // Deklarasi variabel scanner dan angka
        Scanner sc = new Scanner(System.in);
        int angka1, angka2, angka3;

        // Input angka
        System.out.print("Masukkan angka 1: ");
        angka1 = sc.nextInt();
        System.out.print("Masukkan angka 2: ");
        angka2 = sc.nextInt();
        System.out.print("Masukkan angka 3: ");
        angka3 = sc.nextInt();

        // Pemilihan untuk menentukan bilangan terkecil
        if (angka1 < angka2 && angka1 < angka3) {
            System.out.printf("\nAngka 1 (%d) adalah yang terkecil.\n", angka1);
        } else if (angka2 < angka1 && angka2 < angka3) {
            System.out.printf("\nAngka 2 (%d) adalah yang terkecil.\n", angka2);
        } else if (angka3 < angka1 && angka3 < angka2) {
            System.out.printf("\nAngka 3 (%d) adalah yang terkecil.\n", angka3);
        } else if (angka1 == angka2 && angka1 < angka3) {
            System.out.printf("\nAngka 1 dan angka 2 (%d) adalah yang terkecil.\n", angka1);
        } else if (angka2 == angka3 && angka2 < angka1) {
            System.out.printf("\nAngka 2 dan angka 3 (%d) adalah yang terkecil.\n", angka2);
        } else if (angka1 == angka3 && angka1 < angka2) {
            System.out.printf("\nAngka 1 dan angka 3 (%d) adalah yang terkecil.\n", angka3);
        } else {
            System.out.printf("\nKetiga angka adalah yang terkecil, karena bernilai sama (%d).\n");
        }

        // Tutup scanner
        sc.close();
    }
}