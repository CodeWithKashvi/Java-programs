package sorting;
import java.util.Scanner;

public class QueueAllOps {
    int[] q;
    int front = 0, rear = -1, size;

    QueueAllOps(int size) {
        this.size = size;
        q = new int[size];
    }

    void enqueue(int x) {
        if (rear == size - 1)
            System.out.println("Queue Full");
        else
            q[++rear] = x;
    }

    void dequeue() {
        if (front > rear)
            System.out.println("Queue Empty");
        else
            System.out.println("Deleted: " + q[front++]);
    }

    void peek() {
        if (front > rear)
            System.out.println("Queue Empty");
        else
            System.out.println("Front: " + q[front]);
    }

    void display() {
        for (int i = front; i <= rear; i++)
            System.out.print(q[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueAllOps q = new QueueAllOps(sc.nextInt());

        q.enqueue(sc.nextInt());
        q.enqueue(sc.nextInt());
        q.peek();
        q.dequeue();
        q.display();
    }
}

