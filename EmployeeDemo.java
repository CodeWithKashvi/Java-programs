import java.util.Scanner;

interface Employee {
    void earnings();
    void deductions();
    void bonus();
}

class Manager implements Employee {
    protected double basic; 
    protected double da;     
    protected double hra;    
    protected double pf;     

    public Manager(double basic) {
        this.basic = basic;
    }

    public void earnings() {
        da = 0.8 * basic;   
        hra = 0.15 * basic; 
        double totalEarnings = basic + da + hra;
        System.out.println("Earnings: " + totalEarnings);
    }

    public void deductions() {
        pf = 0.12 * basic; 
        System.out.println("Deduction: " + pf);
    }

    public void bonus() {
    
    }
}

class Substaff extends Manager {

    public Substaff(double basic) {
        super(basic);
    }

    @Override
    public void bonus() {
        double bonusAmount = 0.5 * basic; 
        System.out.println("Bonus: " + bonusAmount);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        double basicSalary = sc.nextDouble();

        Substaff sb = new Substaff(basicSalary);
        sb.earnings();
        sb.deductions();
        sb.bonus();

        sc.close();
    }
}

