// Aim: Calculate cost of plastic sheet and box where 3D inherits from 2D.

import java.util.Scanner;

class TwoD {
    double length, width;

    void input() {
        Scanner sc = new Scanner(System.in);
        length = sc.nextDouble();
        width = sc.nextDouble();
    }

    double cost() {
        return length * width * 40;
    }
}

class ThreeD extends TwoD {
    double height;

    void input3D() {
        input();
        Scanner sc = new Scanner(System.in);
        height = sc.nextDouble();
    }

    double cost() {
        return length * width * height * 60;
    }
}

public class Plastic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        if (choice == 1) {
            TwoD s = new TwoD();
            s.input();
            System.out.println("Cost: " + s.cost());
        } else {
            ThreeD b = new ThreeD();
            b.input3D();
            System.out.println("Cost: " + b.cost());
        }
    }
}
