package OopConcepts;
// Aim: Create Rectangle class with length and breadth and 
// print area and perimeter using constructor.

import java.util.Scanner;

class Rectangle {
    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    void calculate() {
        System.out.println("Area: " + (length * breadth));
        System.out.println("Perimeter: " + (2 * (length + breadth)));
    }
}

public class RectDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l = sc.nextDouble();
        double b = sc.nextDouble();

        Rectangle r = new Rectangle(l, b);
        r.calculate();
    }
}
