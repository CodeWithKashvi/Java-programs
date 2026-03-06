package OopConcepts;
// Aim: Input and display details of n students and display name of student having lowest cgpa.

import java.util.Scanner;

class Student {
    int roll;
    String name;
    double cgpa;
}

public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Student[] s = new Student[n];
        double min = Double.MAX_VALUE;
        String minName = "";

        for (int i = 0; i < n; i++) {
            s[i] = new Student();
            s[i].roll = sc.nextInt();
            sc.nextLine();
            s[i].name = sc.nextLine();
            s[i].cgpa = sc.nextDouble();

            if (s[i].cgpa < min) {
                min = s[i].cgpa;
                minName = s[i].name;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(s[i].roll + " " + s[i].name + " " + s[i].cgpa);
        }

        System.out.println("Student with lowest CGPA: " + minName);
    }
}
