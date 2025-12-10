import java.util.Scanner;

public class Test14 {
    static int rekursif(int N) {
        if (N == 0) {
            return 0;
        }
        
        return N + rekursif(N-1);
    }

    static int iteratif(int N) {
        int total = 0;

        for (int i = 1; i <= N; i++) {
            total += i;
        }

        return total;
    }

    static int fibonaci(int N) {
        if (N <= 1) {
            return N;
        }

        return fibonaci(N - 1) + fibonaci(N - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("N = ");
        int N = sc.nextInt();

        sc.close();

        System.out.println("Rekursif = " + rekursif(N));
        System.out.println("Iteratif = " + iteratif(N));
        System.out.println("Fibonaci = " + fibonaci(N));
    }
}
