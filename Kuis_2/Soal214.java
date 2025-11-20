import java.util.Scanner;

public class Soal214 {
    public static void main(String[] args) {
        String nama[] = {"Pensil", "Pulpen", "Buku", "Penghapus", "Penggaris"};
        int harga[] = {2000, 3000, 5000, 1500, 2500};

        Scanner sc = new Scanner(System.in);
        String key;
        int foundIndex = -1;

        System.out.println("Daftar Barang dan Harga\n");
        System.out.printf("%-10s | %-8s\n", "Barang", "Harga");
        for (int i = 0; i < harga.length; i++) {
            System.out.println("-----------+-------");
            System.out.printf("%-10s | %-8s\n", nama[i], harga[i]);
        }

        System.out.print("\nMasukkan nama barang yang ingin dicari\n> ");
        key = sc.nextLine();
        sc.close();

        for (int i = 0; i < harga.length; i++) {
            if (nama[i].equalsIgnoreCase(key)) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex > -1) {
            System.out.println("\nHarga barang: Rp " + harga[foundIndex]);
        } else {
            System.out.println("\nBarang tidak tersedia!");
        }

    }
}
