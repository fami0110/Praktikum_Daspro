import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        double total = 0, rata2;
        int jmlMahasiswa, tertinggi = 0, terendah = 100;
        
        System.out.print("Masukkan jumlah mahasiswa : ");
        jmlMahasiswa = sc.nextInt();

        int nilaiMhs[] = new int[jmlMahasiswa];

        for (int i = 0; i < jmlMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();

            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            }

            if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }

            total += nilaiMhs[i];
        }

        System.out.println();
        System.out.println("===============================");
        System.out.println();
        
        rata2 = total/jmlMahasiswa;
        System.out.println("Nilai rata-rata : "+ rata2);
        System.out.println("Nilai tertinggi : "+ tertinggi);
        System.out.println("Nilai terendah : "+ terendah);
        
        System.out.println();
        
        for (int i = 0; i < jmlMahasiswa; i++) {
            System.out.println("Nilai mahasiswa ke-"+(i+1)+" : " + nilaiMhs[i]);
        }

        

        sc.close();
    }
}
