import java.util.Arrays;
import java.util.Scanner;

public class NilaiMahasiswa14 {

    static Scanner sc = new Scanner(System.in);

    static void isianArray(int[] nilaiMhs) {
        System.out.println();

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai ke-"+(i+1)+": ");
            nilaiMhs[i] = sc.nextInt();
        }
    }

    static void tampilArray(int[] nilaiMhs) {
        System.out.println();
        System.out.println("Nilai mahasiswa:");
        System.out.println(Arrays.toString(nilaiMhs));
    }

    static int hitTot(int[] nilaiMhs) {
        int total = 0;
        
        for (int nilai : nilaiMhs) {
            total += nilai;
        }

        return total;
    }

    public static void main(String[] args) {
        int N = 0, total;

        System.out.print("Masukkan jumlah mahasiswa: ");
        N = sc.nextInt();

        int nilaiMhs[] = new int[N];

        isianArray(nilaiMhs);
        
        tampilArray(nilaiMhs);

        total = hitTot(nilaiMhs);
        
        System.out.println("\nTotal nilai = " + total);
        
        sc.close();
    }
}
