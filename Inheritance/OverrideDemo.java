// Aim: Override disp() method in subclass Person and display details of three persons.

import java.util.Scanner;

class Account {
    int acc_no;
    double balance;

    void input() {
        Scanner sc = new Scanner(System.in);
        acc_no = sc.nextInt();
        balance = sc.nextDouble();
    }

    void disp() {
        System.out.println(acc_no + " " + balance);
    }
}

class Person extends Account {
    String name;
    String aadhar_no;

    void input() {
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        aadhar_no = sc.nextLine();
        acc_no = sc.nextInt();
        balance = sc.nextDouble();
    }

    void disp() {
        System.out.println(name + " " + aadhar_no + " " + acc_no + " " + balance);
    }
}

public class OverrideDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person[] p = new Person[3];

        for (int i = 0; i < 3; i++) {
            p[i] = new Person();
            p[i].input();
        }

        for (int i = 0; i < 3; i++) {
            p[i].disp();
        }
    }
}
