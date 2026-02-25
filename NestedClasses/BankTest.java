package NestedClasses ;

// Aim: Create a class Bank with static nested class InterestCalculator to calculate simple interest.

class Bank {
    double rate = 5.0;

    static class InterestCalculator {
        static double calculateSimpleInterest(double principal, double rate, double time) {
            return (principal * rate * time) / 100;
        }

        void show() {
            // Cannot access non-static member 'rate' directly here
            System.out.println("Static nested class cannot access non-static members directly");
        }
    }
}

public class BankTest {
    public static void main(String[] args) {
        double si = Bank.InterestCalculator.calculateSimpleInterest(10000, 5, 2);
        System.out.println("Simple Interest: " + si);

        Bank.InterestCalculator ic = new Bank.InterestCalculator();
        ic.show();
    }
}
