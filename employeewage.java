package Day3.EmpWage;
//UC3

public class employeewage {
    public static void main(String[] args) {
        int EmpWagePerHr = 20;
        int EmpHr = 8;
        int IsFullTime = 1;
        int IsPartTime = 2;
        int Salary = 0;

        double empCheck = Math.floor(Math.random() * 10) % 3;
        if (empCheck == IsFullTime) {
            Salary = (EmpHr * EmpWagePerHr);
            System.out.println("Employee salary for full time is: " + Salary);
        } else if (empCheck == IsPartTime) {
            EmpHr = 4;
            Salary = (EmpHr * EmpWagePerHr);
            System.out.println("Employee salary for part time is: " + Salary);
        } else
            System.out.println("Employee salary for absent is :" + Salary);

    }
}
