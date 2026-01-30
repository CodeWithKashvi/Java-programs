/*3. Aim of the program: Write a program to print the week day for the given day no. of
the current month using switch case statement
Input: Mention the Day no in the program
Output: Display the week day(either Sunday/Monday/Tuesday/Wednesday
/Thursday/Friday/Saturday) */

import java.util.Scanner;

public class WeekDayDecember2025 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day number of December 2025 (1–31): ");
        int day = sc.nextInt();

        if (day < 1 || day > 31) {
            System.out.println("Invalid day! December has only 1–31.");
            return;
        }

    
        int weekDay = day % 7;

        switch (weekDay) {
            case 0:  
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
       
        }

        sc.close();
    }
}
