import java.util.Arrays;
import java.util.Scanner;

public class RekapPenjualanCafe {

    static Scanner sc = new Scanner(System.in);

    static void isiDataPenjualan(String[] namaMenu, int[][] dataPenjualan) {        

        for (int i = 0; i < dataPenjualan.length; i++) {

            sc.nextLine();
            System.out.print("\nNama Menu Ke-"+(i+1)+": ");
            namaMenu[i] = sc.nextLine();

            for (int j = 0; j < dataPenjualan[i].length; j++) {
                System.out.print("Hari Ke-"+(j+1)+": ");
                dataPenjualan[i][j] = sc.nextInt();
            }
        }
    }

    static void tampilDataPenjualan(String[] namaMenu, int[][] dataPenjualan) {
        System.out.println("\n[+] Data penjualan");
        
        for (int i = 0; i < dataPenjualan.length; i++) {
            System.out.printf("    %-15s: %s\n", namaMenu[i], Arrays.toString(dataPenjualan[i]));
        }
    }

    static void cariDataPenjualanTertinggi(String[] namaMenu, int[][] dataPenjualan) {
        int[] totalPenjualan = new int[dataPenjualan.length];
        
        for (int i = 0; i < dataPenjualan.length; i++) {
            for (int nilai : dataPenjualan[i]) {
                totalPenjualan[i] += nilai;
            }
        }
        
        int idx_menu = 0;

        for (int i = 1; i < totalPenjualan.length; i++) {
            if (totalPenjualan[i] > totalPenjualan[idx_menu]) {
                idx_menu = i;
            }
        }

        System.out.println("\n[+] Menu dengan penjualan tertinggi");
        System.out.println("    Nama  : " + namaMenu[idx_menu]);
        System.out.println("    Total : " + totalPenjualan[idx_menu]);
    }

    static void rata2SetiapMenu(String[] namaMenu, int[][] dataPenjualan) {
        int[] totalPenjualan = new int[dataPenjualan.length];
        
        for (int i = 0; i < dataPenjualan.length; i++) {
            for (int nilai : dataPenjualan[i]) {
                totalPenjualan[i] += nilai;
            }
        }
        
        int jmlHariPenjualan = dataPenjualan[0].length;
        System.out.println("\n[+] Rata-Rata Penjualan Setiap Menu");

        for (int i = 0; i < namaMenu.length; i++) {
            System.out.printf("    %-15s: %.2f\n", namaMenu[i],  (double) totalPenjualan[i]/jmlHariPenjualan);
        }
    }

    public static void main(String[] args) {
        int jmlMenu, jmlHariPenjualan;
        
        System.out.print("Jumlah Menu           : ");
        jmlMenu = sc.nextInt();

        System.out.print("Jumlah Hari Penjualan : ");
        jmlHariPenjualan = sc.nextInt();

        String namaMenu[] = new String[jmlMenu];
        int dataPenjualan[][] = new int[jmlMenu][jmlHariPenjualan];

        isiDataPenjualan(namaMenu, dataPenjualan);

        tampilDataPenjualan(namaMenu, dataPenjualan);

        cariDataPenjualanTertinggi(namaMenu, dataPenjualan);

        rata2SetiapMenu(namaMenu, dataPenjualan);

        sc.close();
    }
}
