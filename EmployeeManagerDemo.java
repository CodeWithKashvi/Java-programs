import java.util.Scanner;

interface Employee {
    void getDetails(); 
}

interface Manager extends Employee {
    void getDeptDetails();
}

class Head implements Manager {
    private int empId;
    private String empName;
    private int deptId;
    private String deptName;

    Scanner sc = new Scanner(System.in);


    public void getDetails() {
        System.out.print("Enter employee id: ");
        empId = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter employee name: ");
        empName = sc.nextLine();
    }

    public void getDeptDetails() {
        System.out.print("Enter department id: ");
        deptId = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter department name: ");
        deptName = sc.nextLine();
    }

    public void displayDetails() {
        System.out.println("\nEmployee id - " + empId);
        System.out.println("Employee name - " + empName);
        System.out.println("Department id - " + deptId);
        System.out.println("Department name - " + deptName);
    }
}

public class EmployeeManagerDemo {
    public static void main(String[] args) {
        Head head = new Head();
        head.getDetails();
        head.getDeptDetails();
        head.displayDetails();
    }
}
