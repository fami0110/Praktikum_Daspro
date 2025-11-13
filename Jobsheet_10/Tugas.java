import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int data[][] = new int[10][6];
        double total;
        int tmp;

        for (int i = 0; i < 10; i++) {
            System.out.println("\nInput data responden ke-" + (i+1));

            for (int j = 0; j < 6; j++) {
                System.out.printf("| Pertanyaan ke-%d : ", (j+1));
                tmp = sc.nextInt();
                data[i][j] = tmp;
            }
        }

        System.out.println("\n========= Hasil Survey ========="); 
        
        System.out.println();

        for (int i = 0; i < 10; i++) {
            total = 0;
            
            for (int j = 0; j < 6; j++) {
                total += data[i][j];
            }

            System.out.printf("Rata-rata responden ke-%d: %.2f\n", (i+1), (total/6));
        }

        System.out.println();

        for (int j = 0; j < 6; j++) {
            total = 0;

            for (int i = 0; i < 10; i++) {
                total += data[i][j];
            }

            System.out.printf("Rata-rata pertanyaan ke-%d: %.2f\n", (j+1), (total/10));
        }

        System.out.println();

        total = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                total += data[i][j];
            }
        }

        System.out.printf("Rata-rata keseluruhan : %.2f\n", (total/(10*6)));

        sc.close();
    }
}
