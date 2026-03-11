package OopConcepts;

// Aim: Use constructor overloading to calculate area of rectangle using default and parameterized constructor.

import java.util.Scanner;

class Rectangle {
    double length, breadth;

    Rectangle() {
        length = 0;
        breadth = 0;
    }

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    void area() {
        System.out.println("Area: " + (length * breadth));
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rectangle r1 = new Rectangle();
        r1.area();

        double l = sc.nextDouble();
        double b = sc.nextDouble();

        Rectangle r2 = new Rectangle(l, b);
        r2.area();
    }
}
