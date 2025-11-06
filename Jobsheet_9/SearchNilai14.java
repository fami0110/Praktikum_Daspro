import java.util.Scanner;

public class SearchNilai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int key = 90;
        int hasil = -1;
        int jmlElemen;

        System.out.print("Masukkan jumlah elemen : ");
        jmlElemen = sc.nextInt();
        
        int[] arrNilai = new int[jmlElemen];
        
        for (int i = 0; i < jmlElemen; i++) {
            System.out.print("Masukkan nilai elemen ke-" + (i+1) + " : ");
            arrNilai[i] = sc.nextInt();
        }

        for (int i = 0; i < jmlElemen; i++) {
            if (key == arrNilai[i]){
                hasil = i;
                break;
            }
        }

        System.out.println();
        if (hasil >= 0) {
            System.out.println("Nilai "+key+" ketemu di indeks ke-"+hasil);
        } else {
            System.out.println("Nilai yang dicari tidak ditemukan!");
        }
        System.out.println();

        sc.close();
    }
}