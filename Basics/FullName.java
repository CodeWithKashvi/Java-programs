// Aim: Take first name and last name from user and print full name

import java.util.Scanner;
public class FullName{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstName = sc.nextLine();

        System.out.println("Enter last name: ");
        String lastName = sc.nextLine();

        System.out.println(firstName + " " + lastName);
        sc.close();
    }
}
