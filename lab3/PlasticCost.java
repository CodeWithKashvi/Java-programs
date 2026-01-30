import java.util.Scanner;

class plastic2D {

    double length;
    double breadth;

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
}

class plastic3D extends plastic2D {

    double height;

    void read(Scanner sc) {
        System.out.print("Enter height: ");
        height = sc.nextDouble();
    }

    void calculateVolume() {
        double volume = length * breadth * height;
        System.out.println("Volume of Rectangle: " + volume);
    }
}

public class PlasticCost{

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("1. 2D Plastic Sheet");
            System.out.println("2. 3D Plastic Box");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            if (ch == 1) {
                plastic2D r = new plastic2D();  
                r.read(sc);
                r.calculateArea();

            } else {
                plastic3D s = new plastic3D();  
                s.read(sc);
                s.calculateVolume();
            }

            plastic2D r = new plastic2D();
            plastic3D s = new plastic3D();

            r.read(sc);
            r.calculateArea();
            s.calculateVolume();
        }
    }
