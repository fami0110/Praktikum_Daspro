import java.util.Scanner;

public class BioskopWithScanner14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        int baris, kolom, menu;
        String nama;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("> ");
            menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                while (true) {
                    System.out.print("\nMasukkan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();
        
                    if (baris > 0 && baris <= 4 && kolom > 0 && kolom <= 2) {
                        if (penonton[baris-1][kolom-1] == null) {
                            penonton[baris-1][kolom-1] = nama;
                            System.out.println("\nData berhasil di-inputkan!");
                            break;
                        } else {
                            System.out.println("\nKursi sudah terisi oleh penonton lainnya!");
                            System.out.println("Silahkan coba lagi!");
                        }
                    } else {
                        System.out.println("\nKursi tidak tersedia!");
                        break;
                    }
                }
            } else if (menu == 2) {
                System.out.println();
                for (String[] barisPenonton : penonton) {
                    System.out.printf(
                        "%-10s  %s \n", 
                        (barisPenonton[0] != null) ? barisPenonton[0] : "***",
                        (barisPenonton[1] != null) ? barisPenonton[1] : "***"
                    );
                }
            } else if (menu == 3) {
                System.out.println("\nKeluar dari program...");
                break;
            } else {
                System.out.println("\nInput tidak valid. Coba lagi!");
            }

        }

        sc.close();
    }
}
