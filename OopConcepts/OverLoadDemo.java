package OopConcepts;
// Aim: Overload subtract method with different parameters and display result.

class Subtract {
    int subtract(int a, int b) {
        return a - b;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    int subtract(int a, int b, int c) {
        return a - b - c;
    }
}

public class OverLoadDemo {
    public static void main(String[] args) {
        Subtract s = new Subtract();

        System.out.println(s.subtract(10, 5));
        System.out.println(s.subtract(10.5, 5.5));
        System.out.println(s.subtract(20, 5, 3));
    }
}

