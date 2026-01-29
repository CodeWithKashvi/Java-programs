/*
Aim of the program:
Write a program to print the corresponding grade for the given mark using if..else.
*/

package lab1;

import java.util.Scanner;

class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        if (marks >= 90)
            System.out.println("GRADE O");
        else if (marks >= 80)
            System.out.println("GRADE E");
        else if (marks >= 70)
            System.out.println("GRADE A");
        else if (marks >= 60)
            System.out.println("GRADE B");
        else if (marks >= 50)
            System.out.println("GRADE C");
        else
            System.out.println("GRADE F");

        sc.close();
    }
}
