package Day3.EmpWage;
import java.util.Scanner;
//UC1

public class employeewage {
    public static void main(String[] args)
    {

        System.out.println("Enter numbers of hours worked");
        Scanner scan = new Scanner(System.in);
        double totalHoursWorked = scan.nextInt();
        double standardWages = 20;
        int standardHours = 8;
        double totalWage;
        if (totalHoursWorked > 8) {
            totalWage = (standardHours * totalHoursWorked) + (totalHoursWorked - standardHours);
        } else if (totalHoursWorked < 8) {
            totalWage = standardWages * totalHoursWorked;
        } else {
            totalWage = standardWages * standardHours;
        }
        System.out.println("MY total wages of full day is:" + totalWage);

    }
}

