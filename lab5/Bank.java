class Bank {
    String bankName = "SBI";

    static class InterestCalculator {

        static double calculateInterest(double p, double r, double t) {
            return (p * r * t) / 100;
        }

        void show() {
            // Cannot access non-static member directly
            System.out.println("Static nested class cannot access non-static members directly");
        }
    }

    public static void main(String[] args) {
        double si = InterestCalculator.calculateInterest(1000, 5, 2);
        System.out.println("Simple Interest = " + si);

        InterestCalculator ic = new InterestCalculator();
        ic.show();
    }
}

