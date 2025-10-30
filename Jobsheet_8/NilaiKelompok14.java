import java.util.Scanner;

public class NilaiKelompok14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        double maxRata = 0;
        int kelompokTerbaik = 0;

        while (i <= 6) {
            System.out.println("Kelompok " + i);
            int totalNilai = 0;
            for (int j = 1; j <= 5; j++) {
                System.out.print("  Nilai dari kelompok penilai " + j + ": ");
                int nilai = sc.nextInt();
                totalNilai += nilai;
            }
            double rataNilai = totalNilai / 5.0;
            System.out.println("Rata-rata nilai kelompok " + i + ": " + rataNilai);

            // Tentukan kelompok terbaik
            if (rataNilai > maxRata) {
                maxRata = rataNilai;
                kelompokTerbaik = i;
            }

            i++;
        }

        System.out.println("\nKelompok dengan rata-rata tertinggi adalah Kelompok " + kelompokTerbaik + " dengan nilai " + maxRata);
        sc.close();
    }
}
