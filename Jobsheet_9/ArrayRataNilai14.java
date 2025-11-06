import java.util.Scanner;

public class ArrayRataNilai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double totalLulus = 0, totalTidakLulus = 0;
        double rata2Lulus, rata2TidakLulus;
        int mhsLulus = 0, mhsTidakLulus = 0;
        int jmlMahasiswa;
        
        System.out.print("Masukkan jumlah mahasiswa : ");
        jmlMahasiswa = sc.nextInt();

        int nilaiMhs[] = new int[jmlMahasiswa];

        for (int i = 0; i < jmlMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < jmlMahasiswa; i++) {
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                mhsLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                mhsTidakLulus++;
            }
        }

        rata2Lulus = totalLulus/mhsLulus;
        rata2TidakLulus = totalTidakLulus/mhsTidakLulus;

        System.out.println("Rata-rata nilai lulus = " + rata2Lulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rata2TidakLulus);

        sc.close();
    }
}