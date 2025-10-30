import java.util.Scanner;

public class JumlahKuadrat14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, jml_kuadrat, kuadrat;

        System.out.print("n = ");
        n = sc.nextInt();

        System.out.println();

        for (int i = 1; i <= n; i++) {
            jml_kuadrat = 1;

            System.out.print("n = " + i + " -> jumlah kuadrat");

            if (i > 1) {
                System.out.print(" = 1");
                for (int j = 2; j <= i; j++) {
                    kuadrat = (int) Math.pow(j, 2);
                    System.out.print(" + " + kuadrat);
                    jml_kuadrat += kuadrat;
                }
            }

            System.out.print(" = " + jml_kuadrat + "\n");
        }

        sc.close();
    }    
}
