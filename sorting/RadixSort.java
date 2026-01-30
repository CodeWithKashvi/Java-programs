package sorting;
import java.util.Scanner;

public class RadixSort {

    static int getMax(int[] a, int n) {
        int max = a[0];
        for (int i = 1; i < n; i++)
            if (a[i] > max)
                max = a[i];
        return max;
    }

    static void countSort(int[] a, int n, int exp) {
        int[] output = new int[n];
        int[] count = new int[10];

        for (int i = 0; i < n; i++)
            count[(a[i] / exp) % 10]++;

        for (int i = 1; i < 10; i++)
            count[i] += count[i - 1];

        for (int i = n - 1; i >= 0; i--) {
            output[count[(a[i] / exp) % 10] - 1] = a[i];
            count[(a[i] / exp) % 10]--;
        }

        for (int i = 0; i < n; i++)
            a[i] = output[i];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int max = getMax(a, n);

        for (int exp = 1; max / exp > 0; exp *= 10)
            countSort(a, n, exp);

        for (int x : a)
            System.out.print(x + " ");
    }
}
