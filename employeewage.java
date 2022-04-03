package Day3.EmpWage;
//UC5

public class employeewage {
    public static void main(String[] args) {

        int IsFullTime = 2;
        int IsPartTime = 1;
        int PerHourSalary = 20;
        int workingHour = 0;
        int totalSalary = 0;
        int Salary;

        for (int day = 1; day <= 20; day++) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 2;
            switch (empCheck) {

                case 0:
                    workingHour = 8;
                    break;

                case 1:
                    workingHour = 4;
                    break;

                case 2:
                    workingHour = 0;
                    break;
            }
            Salary = workingHour * PerHourSalary;
            totalSalary = totalSalary + Salary;

        }
        System.out.println("Employee has earned total salary in a month is: " + totalSalary);

    }
}