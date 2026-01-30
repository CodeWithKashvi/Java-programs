package lab5;

import Marketing.sales;

public class MainApp {

    public static void main(String[] args) {

        int empid = 123;
        String name = "Amit";
        double basic = 1000;

        sales s = new sales(empid, name);

        double earning = s.earnings(basic);
        double ta = s.tallowance(earning);
        double total = earning + ta;

        System.out.println("The emp id of the employee is " + s.getEmpid());
        System.out.println("The total earning is " + total);
    }
}
