//1. Aim of the program -Write a program to print your name, roll no, section and branch in separate lines. Input: Mention Name,Roll no,Section and branch Output: Display Name Display Roll No Display Section Display Branch
import java.util.Scanner;

class Student {
    String name, rollno, section, branch;
    
    Student(String name, String rollno, String section, String branch) {
        this.name = name;
        this.rollno = rollno;
        this.section = section;
        this.branch = branch;
    }
    
    void display() {
        System.out.println("Name: " + name + ", Roll: " + rollno + 
                          ", Section: " + section + ", Branch: " + branch);
    }
}
class StudentDetails {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NAME");
        String name = sc.nextLine();
        System.out.println("ENTER ROLL NUM");
        String rollno = sc.nextLine();
        System.out.println("ENTER SECTION");
        String section = sc.nextLine();
        System.out.println("ENTER BRANCH");
        String branch = sc.nextLine();
        
        Student student = new Student(name, rollno, section, branch);
        student.display();
    }
}

