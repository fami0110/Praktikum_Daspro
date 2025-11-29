import java.util.Scanner;

public class NilaiMhs {
    static void isiNilai(String[] namaMhs, int[][] dataNilai) {
        Scanner sc = new Scanner(System.in);

        
        for (int i = 0; i < dataNilai.length; i++) {
            System.out.print("\n[+] Nama Mahasiswa ke-" + (i+1) + ": ");
            namaMhs[i] = sc.nextLine();
            
            for (int j = 0; j < dataNilai[0].length; j++) {
                System.out.print("    Nilai Matkul ke-"+ (i+1) + ": ");
                dataNilai[i][j] = sc.nextInt();
            }

            sc.nextLine();
        }

        sc.close();
    }

    static double[] hitungRata(int[][] dataNilai) {
        int jmlMhs = dataNilai.length;
        int jmlMatkul = dataNilai[0].length;
        double[] rataNilai = new double[jmlMhs];

        for (int i = 0; i < dataNilai.length; i++) {
            for (int j = 0; j < dataNilai[0].length; j++) {
                rataNilai[i] += dataNilai[i][j];
            }
        }

        for (int i = 0; i < rataNilai.length; i++) {
            rataNilai[i] /= jmlMatkul;
        }
        
        return rataNilai;
    }

    static boolean[] statusLulus(double[] rataNilai) {
        boolean[] statusMhs = new boolean[rataNilai.length];

        for (int i = 0; i < rataNilai.length; i++) {
            statusMhs[i] = (rataNilai[i] >= 60);
        }

        return statusMhs;
    }

    static void displayRekap(String[] namaMhs, double[] rataNilai, boolean[] statusMhs) {
        System.out.println("\n============ REKAP NILAI MAHASISWA ============");
        
        for (int i = 0; i < rataNilai.length; i++) {
            System.out.printf("\n%d. %s\n", (i+1), namaMhs[i]);
            System.out.printf("    Rata-rata : %.2f\n", rataNilai[i]);
            System.out.printf("    Status    : %s\n", (statusMhs[i] ? "LULUS" : "TIDAK LULUS"));
        }
    }
    

    public static void main(String[] args) {
        String[] namaMhs = new String[3];
        int[][] dataNilai = new int[3][3];

        isiNilai(namaMhs, dataNilai);

        double[] rataNilai = hitungRata(dataNilai);
        
        boolean[] statusMhs = statusLulus(rataNilai);

        displayRekap(namaMhs, rataNilai, statusMhs);
    }
}
