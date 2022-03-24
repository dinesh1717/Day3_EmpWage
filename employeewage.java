package Day3.EmpWage;
// UC-2 Daily Employees Wage
import java.util.Random;

public class employeewage {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME_HOUR = 4;
    static final int IS_FULL_TIME = 2;
    static final int IS_PART_TIME = 1;

    public static void main(String[] args) {
        // Taking random function from java lib,
        Random random = new Random();
        // Taking random number 2 because of 0 for the absent and 1 for the present,
        int empPresent = random.nextInt(3);

        int empWage = 0;

        if(empPresent == 1) {
            //Part time Hour calculation
            empWage = WAGE_PER_HOUR * PART_TIME_HOUR;
            System.out.println("Employees Wage"+empWage);
        } else if(empPresent == 2) {
            //Full time Hour calculation
            empWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
            System.out.println("Employees Wage"+empWage);
        }
        else
            System.out.println("Employees Wage"+empWage);

    }
}


