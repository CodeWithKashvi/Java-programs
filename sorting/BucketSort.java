package sorting;
import java.util.Scanner;

public class BucketSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int max = a[0];
        for (int i = 1; i < n; i++)
            if (a[i] > max)
                max = a[i];

        int[] bucket = new int[max + 1];

        for (int i = 0; i < n; i++)
            bucket[a[i]]++;

        int k = 0;
        for (int i = 0; i <= max; i++)
            while (bucket[i] > 0) {
                a[k++] = i;
                bucket[i]--;
            }

        for (int x : a)
            System.out.print(x + " ");
    }
}
