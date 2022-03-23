package Day3.EmpWage;
import java.util.Random;
//employee attendance

public class employeewage {
    public static void main(String[] args) {
        Random random = new Random();
        // Taking random number 2 because of 0 for the absent and 1 for the present,
        int empPresent = random.nextInt(2);

        if(empPresent == 0) {
            System.out.println("Employees Is Absent");
        }
        else {
            System.out.println("Employees is Present");
        }
    }
}
