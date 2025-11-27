import java.util.Arrays;

public class RekapPenjualanCafe {
    static void isiDataPenjualan(String[] namaMenu, int[][] dataPenjualan) {
        String prefilledNamaMenu[] = {"Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};
        
        int prefilledDataPenjualan[][] = {
            {20, 20, 25, 20, 10, 60, 10},
            {30, 80, 40, 10, 15, 20, 25},
            {5, 9, 20, 25, 10, 5, 45},
            {50, 8, 17, 18, 10, 30, 6},
            {15, 10, 16, 15, 10, 10, 55},
        };
        
        for (int i = 0; i < dataPenjualan.length; i++) {
            namaMenu[i] = prefilledNamaMenu[i];

            for (int j = 0; j < dataPenjualan[i].length; j++) {
                dataPenjualan[i][j] = prefilledDataPenjualan[i][j];
            }
        }

    }

    static void tampilDataPenjualan(String[] namaMenu, int[][] dataPenjualan) {
        System.out.println("\n[+] Data penjualan");
        for (int i = 0; i < dataPenjualan.length; i++) {
            System.out.printf("    %-15s: %s\n", namaMenu[i], Arrays.toString(dataPenjualan[i]));
        }
    }

    static int[] cariDataPenjualanTertinggi(String[] namaMenu, int[][] dataPenjualan) {
        int idx_menu = 0;
        int[] totalPenjualan = new int[dataPenjualan.length];

        for (int i = 0; i < dataPenjualan.length; i++) {
            for (int nilai : dataPenjualan[i]) {
                totalPenjualan[i] += nilai;
            }
        }

        for (int i = 1; i < totalPenjualan.length; i++) {
            if (totalPenjualan[i] > totalPenjualan[idx_menu]) {
                idx_menu = i;
            }
        }

        System.out.println("\n[+] Menu dengan penjualan tertinggi");
        System.out.println("    Nama  : " + namaMenu[idx_menu]);
        System.out.println("    Total : " + totalPenjualan[idx_menu]);

        return totalPenjualan;
    }

    static void rata2SetiapMenu(String[] namaMenu, int[] totalPenjualan, int hari) {
        System.out.println("\n[+] Rata-Rata Penjualan Setiap Menu");
        for (int i = 0; i < namaMenu.length; i++) {
            System.out.printf("    %-15s: %.2f\n", namaMenu[i],  (double) totalPenjualan[i]/hari);
        }
    }

    public static void main(String[] args) {
        String namaMenu[] = new String[5];
        int dataPenjualan[][] = new int[5][7];
        int totalPenjualan[] = new int[5];

        isiDataPenjualan(namaMenu, dataPenjualan);

        tampilDataPenjualan(namaMenu, dataPenjualan);

        totalPenjualan = cariDataPenjualanTertinggi(namaMenu, dataPenjualan);

        rata2SetiapMenu(namaMenu, totalPenjualan, dataPenjualan[0].length);
    }
}
