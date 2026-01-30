package Marketing;

import General.employee;

public class sales extends employee {

    public sales(int empid, String ename) {
        super(empid, ename);
    }

    public double tallowance(double totalEarning) {
        return 0.05 * totalEarning;
    }
}
