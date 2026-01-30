package sorting;
import java.util.Scanner;

public class StackAllOps {
    int[] stack;
    int top = -1;
    int size;

    StackAllOps(int size) {
        this.size = size;
        stack = new int[size];
    }

    void push(int x) {
        if (top == size - 1)
            System.out.println("Stack Overflow");
        else
            stack[++top] = x;
    }

    void pop() {
        if (top == -1)
            System.out.println("Stack Underflow");
        else
            System.out.println("Popped: " + stack[top--]);
    }

    void peek() {
        if (top == -1)
            System.out.println("Stack Empty");
        else
            System.out.println("Top: " + stack[top]);
    }

    void display() {
        for (int i = top; i >= 0; i--)
            System.out.print(stack[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackAllOps s = new StackAllOps(sc.nextInt());

        s.push(sc.nextInt());
        s.push(sc.nextInt());
        s.peek();
        s.pop();
        s.display();
    }
}
