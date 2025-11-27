import java.util.Scanner;

public class Kubus14 {
    static int hitungLuasSisi(int sisi) {
        int luas = sisi * sisi;
        return luas;
    }

    static int hitungLuasPermukaan(int sisi) {
        int luasPermukaan = hitungLuasSisi(sisi) * 6;
        return luasPermukaan;
    }
    
    static int hitungVolume(int sisi) {
        int volume = hitungLuasSisi(sisi) * sisi;
        return volume;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s, vol, LP;

        System.out.print("Masukkan panjang sisi\n> ");
        s = input.nextInt();

        System.out.println();
        
        vol = hitungVolume(s);
        System.out.println("Volume kubus adalah " + vol);
        LP = hitungLuasPermukaan(s);
        System.out.println("Luas permukaan kubus adalah " + LP);

        input.close();
    }
}
