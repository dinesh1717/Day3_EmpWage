package Day3.EmpWage;
// UC-2 Daily Employees Wage
import java.util.Random;

public class employeewage {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;

    public static void main(String[] args) {
        // Taking random function from java lib,
        Random random = new Random();
        // Taking random number 2 because of 0 for the absent and 1 for the present,
        int empPresent = random.nextInt(2);

        int empWage = 0;

        if(empPresent == 0) {
            System.out.println("Employees Is Absent");
        }
        else {
            empWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
            System.out.println("Employees is Present");
        }
        System.out.println("Employees Wage is" + empWage);
    }
}

