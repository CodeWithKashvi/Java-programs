//1. Aim of the program -Write a program to print your name, roll no, section and branch in separate lines. Input: Mention Name,Roll no,Section and branch Output: Display Name Display Roll No Display Section Display Branch
import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name, roll no, section and branch:");

        String name = sc.nextLine();
        int rollno = sc.nextInt();
        int section = sc.nextInt();
        sc.nextLine(); // consume leftover newline
        String branch = sc.nextLine();

        System.out.println("Name is: " + name);
        System.out.println("Roll No is: " + rollno);
        System.out.println("Section is: " + section);
        System.out.println("Branch is: " + branch);

        sc.close();
    }
}
