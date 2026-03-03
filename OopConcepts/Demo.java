package OopConcepts;
// Aim: Write a class box with length, width, height and method volume(). Create object and print volume.

import java.util.Scanner;

class Box {
    double length, width, height;

    void volume() {
        System.out.println("Volume: " + (length * width * height));
    }
}

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Box b = new Box();
        b.length = sc.nextDouble();
        b.width = sc.nextDouble();
        b.height = sc.nextDouble();

        b.volume();
    }
}

