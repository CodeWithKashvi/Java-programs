package lab4;

abstract class Shape {
    abstract void area();   // abstract method

    void display() {
        System.out.println("Calculating Area");
    }
}

class Rectangle extends Shape {
    int l = 5, b = 4;

    void area() {
        System.out.println("Area of Rectangle = " + (l * b));
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        Shape s = new Rectangle();
        s.display();
        s.area();
    }
}
