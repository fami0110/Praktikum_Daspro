import java.util.Scanner;

public class SistemHostpotKampus {
    public static void main(String[] args) {
        String pengguna;

        Scanner sc = new Scanner(System.in);

        System.out.print("Jenis pengguna: ");
        pengguna = sc.nextLine().toLowerCase();

        switch (pengguna) {
            case "dosen":
                System.out.println("Akses Wifi diberikan (dosen)");
                break;
            case "mahasiswa":
                System.out.print("Masukkan jumlah SKS: ");
                int sks = sc.nextInt();

                if (sks >= 12) {
                    System.out.println("Akses Wifi diberikan (mahasiswa aktif)");
                } else {
                    System.out.println("Akses ditolak, SKS kurang dari 12");
                }
                break;
            default:
                System.out.println("Akses ditolak");
                break;
        }

        sc.close();
    }
}
