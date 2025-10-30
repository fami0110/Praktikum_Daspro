import java.util.Scanner;

public class Persegi14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("n = ");
        n = sc.nextInt();

        if (n >= 3) {
            String spaces = Integer.toString(n).replaceAll(".", " ");;

            System.out.println();
    
            for (int i = 1; i <= n; i++) {
                System.out.print(n + " ");
                for (int j = 1; j <= n-2; j++) {
                    System.out.print(
                        (i == 1 || i == n) ? n + " " : spaces + " "
                    );
                }
                System.out.print(n + " \n");
            }
        } else {
            System.out.println("\nNilai n minimal 3!");
        }
        
        sc.close();
    }
}
