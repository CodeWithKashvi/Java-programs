import java.util.Scanner;

abstract class Student {
    int rollNo;
    long regNo;

    void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter roll no: ");
        rollNo = sc.nextInt();
        System.out.print("Enter reg no: ");
        regNo = sc.nextLong();
        sc.close();
    }
    abstract void course();
}

class Kiitian extends Student {
    void course() {
        System.out.println("course-cse");
    }
    void display() {
        System.out.println("Rollno - " + rollNo);
        System.out.println("Registration no - " + regNo);
            course();
    }
}

public class Abstractstudent1Demo {
    public static void main(String[] args) {
        Kiitian k = new Kiitian();
        k.getInput();
            k.display();
        }
    }




