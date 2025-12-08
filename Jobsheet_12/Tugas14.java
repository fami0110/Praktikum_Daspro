import java.util.Scanner;

public class Tugas14 {
    static Scanner sc = new Scanner(System.in);

    static int totalNilaiRekursif(int N, int currentTotal) {
        System.out.print("Masukkan angka ke-" + N + ": ");
        int angka = sc.nextInt();

        if (N == 1) {
            return angka;
        } else {
            return angka + totalNilaiRekursif(N-1, currentTotal);
        }
    }

    static int totalNilaiIteratif(int N, int currentTotal) {
        for (int i = N; i >= 1; i--) {
            System.out.print("Masukkan angka ke-" + N + ": ");
            int angka = sc.nextInt();

            currentTotal += angka;
        }

        return currentTotal;
    }

    public static void main(String[] args) {
        int N, total = 0;

        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        N = sc.nextInt();

        System.out.println("\n========= FUNGSI REKURSIF =========");
        total = totalNilaiRekursif(N, 0);
        System.out.println("Total dari "+ N +" angka yang dimasukkan adalah: " + total);
        
        System.out.println("\n========= FUNGSI ITERATIF =========");
        total = totalNilaiIteratif(N, 0);
        System.out.println("Total dari "+ N +" angka yang dimasukkan adalah: " + total);

        sc.close();
    }    
}
