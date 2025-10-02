import java.util.Scanner;

public class Perpustakaan {
    public static void main(String[] args) {
        boolean kartuMahasiswa, isRegistered;

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Apakah membawa KTM? (true/false) ");
        kartuMahasiswa = sc.nextBoolean();
        System.out.print("Apakah sudah registrasi online? (true/false) ");
        isRegistered = sc.nextBoolean();

        if (kartuMahasiswa && isRegistered) {
            System.out.println("Silahkan masuk");
        } else {
            System.out.println("Anda dilarang masuk");
        }

        sc.close();
    }
}
