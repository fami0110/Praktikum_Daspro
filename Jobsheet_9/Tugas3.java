import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        String key;
        int hasil = -1;

        System.out.print("Masukkan nama menu yang ingin dicari!\n> ");
        key = sc.nextLine();

        for (int i = 0; i < menu.length; i++) {
            if (key.equalsIgnoreCase(menu[i])){
                hasil = i;
                break;
            }
        }

        if (hasil >= 0) {
            System.out.println("\nMenu tersedia!");
        } else {
            System.out.println("\nMenu yang dicari tidak ada di dalam menu!");
        }

        sc.close();
    }
}
