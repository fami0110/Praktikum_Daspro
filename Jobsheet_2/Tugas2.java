import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lebar_tanah,
            panjang_tanah,
            diameter_kolam_1,
            panjang_kolam_2;

        double luas_tanah, 
            luas_kolam_1, 
            luas_kolam_2, 
            luas_taman_rumput;

        // Input nilai
        System.out.print("Masukkan lebar tanah\t\t: ");
        lebar_tanah = sc.nextInt();
        System.out.print("Masukkan panjang tanah\t\t: ");
        panjang_tanah = sc.nextInt();
        System.out.print("Masukkan diameter kolam 1\t: ");
        diameter_kolam_1 = sc.nextInt();
        System.out.print("Masukkan panjang kolam 2\t: ");
        panjang_kolam_2 = sc.nextInt();

        // Hitung luas tanah
        luas_tanah = panjang_tanah * lebar_tanah;

        // Hitung luas kolam 1
        luas_kolam_1 = 2 * (Math.PI * Math.pow(diameter_kolam_1/2, 2));

        // Hitung luas kolam 2
        luas_kolam_2 = Math.pow(panjang_kolam_2, 2);

        // Hitung luas taman rumput
        luas_taman_rumput = luas_tanah - luas_kolam_1 - luas_kolam_2;

        // Cetak Hasil
        System.out.println(String.format("\nLuas tanah\t\t: %.0f m²", luas_tanah));
        System.out.println(String.format("Luas kolam 1\t\t: %.2f m²", luas_kolam_1));
        System.out.println(String.format("Luas kolam 2\t\t: %.0f m²", luas_kolam_2));
        System.out.println(String.format("Luas taman rumput\t: %.2f m²", luas_taman_rumput));
    }
}