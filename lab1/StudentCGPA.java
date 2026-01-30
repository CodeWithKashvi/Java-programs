import java.util.Scanner;

class Student {
    int roll;
    String name;
    float cgpa;
}

public class StudentCGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] s = new Student[n];

        for (int i = 0; i < n; i++) {
            s[i] = new Student();

            System.out.println("\nEnter details of student " + (i + 1));
            System.out.print("Roll No: ");
            s[i].roll = sc.nextInt();

            sc.nextLine(); // clear buffer
            System.out.print("Name: ");
            s[i].name = sc.nextLine();

            System.out.print("CGPA: ");
            s[i].cgpa = sc.nextFloat();
        }

        System.out.println("\nStudent Details:");
        for (int i = 0; i < n; i++) {
            System.out.println(
                "Roll: " + s[i].roll +
                ", Name: " + s[i].name +
                ", CGPA: " + s[i].cgpa
            );
        }

        int minIndex = 0;
        for (int i = 1; i < n; i++) {
            if (s[i].cgpa < s[minIndex].cgpa) {
                minIndex = i;
            }
        }

        System.out.println(
            "\nStudent with lowest CGPA: " + s[minIndex].name
        );
    }
}
