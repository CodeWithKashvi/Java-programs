import java.util.Scanner;

class Rectangle {

    double length;
    double breadth;

    // Method to read values using Scanner passed from main
    void read(Scanner sc) {
        System.out.print("Enter length: ");
        length = sc.nextDouble();
        System.out.print("Enter breadth: ");
        breadth = sc.nextDouble();
    }

    void calculateArea() {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    void calculatePerimeter() {
        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }
}

public class RectangleDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // single Scanner object

        Rectangle r = new Rectangle();

        r.read(sc);
        r.calculateArea();
        r.calculatePerimeter();
    }
}
