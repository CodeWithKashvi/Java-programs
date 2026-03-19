package OopConcepts;
// Aim: Program to find number of objects created out of a class using static modifier.

import java.util.Scanner;

class Counter {
    static int count = 0;

    Counter() {
        count++;
    }
}

public class ObjectCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            new Counter();
        }

        System.out.println("Total number of objects created: " + Counter.count);
    }
}

