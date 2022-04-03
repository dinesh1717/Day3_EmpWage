package Day3.EmpWage;
//UC6

public class employeewage {
    public static void main(String[] args) {
        int IS_PART_TIME = 1;
        int IS_FULL_TIME = 2;
        int EmpRatePerHr = 20;
        int Max_Salary = 100;
        int WorkingHour = 0;
        int TotalSalary = 0;
        int Salary;
        int TotalWorkingDays = 0;
        int NumofWorkingDays = 20;
        int empHrs =0;

        while (WorkingHour <= Max_Salary && TotalWorkingDays < NumofWorkingDays)
        {
            TotalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch(empCheck)
            {
                case 0:
                    empHrs = 8;
                    break;

                case 1:
                    empHrs = 4;
                    break;

                case 2:
                    empHrs = 0;
                    break;
            }
            WorkingHour += empHrs;
            System.out.println("Day#: " + TotalWorkingDays + " Emp Hr " + empHrs );
        }
        int totalEmpWage = WorkingHour * EmpRatePerHr;
        System.out.println("total Emp Wage " + totalEmpWage);

    }
}