import java.util.Scanner;

public class MenghitungLuasPersegiPanjang14 {
    public static void main(String[] args) {
        int panjang, lebar, luas;
        Scanner sc = new Scanner(System.in);

        System.out.print("panjang: ");
        panjang = sc.nextInt();
        System.out.print("lebar: ");
        lebar = sc.nextInt();
        sc.close();
        
        luas = panjang * lebar;

        System.out.println("luas: " + luas);
    }
}
