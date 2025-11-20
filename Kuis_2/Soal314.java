import java.util.Scanner;

public class Soal314 {
    public static void main(String[] args) {
        char kursi[][] = {
            {'O', 'O', 'O', 'O', 'O', 'O'},
            {'O', 'O', 'O', 'O', 'O', 'O'},
            {'O', 'O', 'O', 'O', 'O', 'O'},
            {'O', 'O', 'O', 'O', 'O', 'O'},
            {'O', 'O', 'O', 'O', 'O', 'O'},
        };

        Scanner sc = new Scanner(System.in);
        int pilihan, pilihanBaris, pilihanKolom, kursiTerisi = 0;

        System.out.println("╔══════════════════════════════╗");
        System.out.println("║ | SISTEM MANAJEMEN BIOSKOP | ║");
        System.out.println("╚══════════════════════════════╝");

        while (true) {
            System.out.println("\nPilih menu:");
            System.out.println("1. Tampilkan denah kursi");
            System.out.println("2. Pesan kursi");
            System.out.println("3. Batalkan pemesanan kursi");
            System.out.println("4. Hitung jumlah kursi kosong dan terisi");
            System.out.println("5. Keluar");

            System.out.print("\n> ");
            pilihan = sc.nextInt();

            System.out.println();

            if (pilihan == 1) {
                for (char[] baris : kursi) {
                    for (char kolom : baris) {
                        System.out.print(kolom + " ");
                    }
                    System.out.println();
                }
            } else if (pilihan == 2) {
                System.out.println("Silahkan masukkan posisi kursi yang ingin dipesan");
                
                System.out.print("Baris -> ");
                pilihanBaris = sc.nextInt();
                
                System.out.print("Kolom -> ");
                pilihanKolom = sc.nextInt();

                System.out.println();

                if (
                    (pilihanBaris > 0 && pilihanBaris <= 5) &&
                    (pilihanKolom > 0 && pilihanKolom <= 6)
                ) {
                    if (kursi[pilihanBaris-1][pilihanKolom-1] == 'O') {
                        kursi[pilihanBaris-1][pilihanKolom-1] = 'X';
                        kursiTerisi++;
                        System.out.println("Berhasil memesan kursi!");
                    } else {
                        System.out.println("Kursi sudah terisi!");
                    }
                } else {
                    System.out.println("Input tidak valid. Coba lagi!");
                }
            } else if (pilihan == 3) {
                System.out.println("Silahkan masukkan posisi kursi yang ingin dibatalkan");
                
                System.out.print("Baris -> ");
                pilihanBaris = sc.nextInt();
                
                System.out.print("Kolom -> ");
                pilihanKolom = sc.nextInt();

                System.out.println();

                if (
                    (pilihanBaris > 0 && pilihanBaris <= 5) &&
                    (pilihanKolom > 0 && pilihanKolom <= 6)
                ) {
                    if (kursi[pilihanBaris-1][pilihanKolom-1] == 'X') {
                        kursi[pilihanBaris-1][pilihanKolom-1] = 'O';
                        kursiTerisi--;
                        System.out.println("Berhasil membatalkan pesanan!");
                    } else {
                        System.out.println("Kursi memang kosong!");
                    }
                } else {
                    System.out.println("Input tidak valid. Coba lagi!");
                }
            } else if (pilihan == 4) {
                System.out.println("Jumlah kursi kosong: " + (kursi.length * kursi[0].length - kursiTerisi));
                System.out.println("Jumlah kursi terisi: " + kursiTerisi);
            } else if (pilihan == 5) {
                System.out.println("Keluar program...");
                break;
            } else {
                System.out.println("Input tidak valid. Coba lagi!");
            }
        }

        sc.close();
    }
}
