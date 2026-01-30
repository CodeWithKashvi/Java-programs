package mathstud;
import java.util.Scanner;

public class EvenFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0, b = 1, sum = 0;

        while (a <= n) {
            if (a % 2 == 0)
                sum += a;

            int c = a + b;
            a = b;
            b = c;
        }

        System.out.println("Even Sum = " + sum);
    }
}
