package OopConcepts;

// Aim: Accept 10 numbers from command line and check how many of them are even and how many are odd.

public class EvenOdd {
    public static void main(String[] args) {
        int even = 0, odd = 0;

        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(args[i]);
            if (num % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
