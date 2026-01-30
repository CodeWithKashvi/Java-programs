package sorting;
import java.util.Scanner;

public class QueueArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] q = new int[size];
        int front = 0, rear = -1;

        q[++rear] = sc.nextInt(); // enqueue
        System.out.println("Dequeued: " + q[front++]);
    }
}
