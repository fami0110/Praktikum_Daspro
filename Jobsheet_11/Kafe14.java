import java.util.Scanner;

public class Kafe14 {

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!\n");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!\n");
        }

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Anda mendapatkan diskon 50% dari kode promo!");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Anda mendapatkan diskon 30% dari kode promo!");
        } else {
            System.out.println("Kode promo (" + kodePromo + ") yang Anda masukkan tidak valid!");
        }
        
        System.out.println("\n====== MENU RESTO KAFE ======");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===============================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {

        if (pilihanMenu < 1 || pilihanMenu > 6) {
            System.out.println("[!] Nomor menu tidak valid. Mohon masukkan angka 1 sampai 6.");
            return 0;
        }

        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        if (kodePromo.equals("DISKON50")) {
            hargaTotal *= (1.0 - 0.5);
        } else if (kodePromo.equals("DISKON30")) {
            hargaTotal *= (1.0 - 0.3);
        }
        
        return hargaTotal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kodePromo = "DISKON50";
        String tambahLagi = null;
        
        int totalKeseluruhanBayar = 0, i = 1; 
        
        Menu("Sando", false, kodePromo); 

        do {
            System.out.println("\n=========== PESANAN "+ (i++) +" ===========");

            System.out.print("Masukkan nomor menu (1-6): ");
            int pilihanMenu = sc.nextInt();

            System.out.print("Masukkan jumlah item: ");
            int banyakItem = sc.nextInt();
            
            int subTotal = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);
            totalKeseluruhanBayar += subTotal;
            
            System.out.println("Subtotal pesanan ini: Rp" + subTotal);
            
            sc.nextLine();
            System.out.print("Apakah Anda ingin memesan menu lain? (y/t): ");
            tambahLagi = sc.nextLine();
            
        } while (tambahLagi.equalsIgnoreCase("y"));
        
        System.out.println("\n=========== INVOICE ===========");
        System.out.println("Total harga pesanan Anda: Rp" + totalKeseluruhanBayar);
        
        sc.close();
    }
}