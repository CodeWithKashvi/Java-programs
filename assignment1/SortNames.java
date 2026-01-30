import java.util.Scanner;
import java.util.Arrays;

class ComplexDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students (max 10): ");
        int n = sc.nextInt();
        sc.nextLine();  

        String[] nameOfStudents = new String[n];

        // Reading names
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            nameOfStudents[i] = sc.nextLine();
        }

        // Sorting names
        Arrays.sort(nameOfStudents);

        // Display sorted names
        System.out.println("\nSorted list of names:");
        for (int i = 0; i < n; i++) {
            System.out.println(nameOfStudents[i]);
        }
    }
}
