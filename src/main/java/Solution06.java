import java.util.Scanner;
import java.util.Date;

public class Solution06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your current age? ");
        //Scan input string
        String inputOne = input.next();
        System.out.println("At what age would you like to retire? ");
        //Scan input string
        String inputTwo = input.next();
        //Convert inputOne and inputTwo to integers
        int currentAge = Integer.parseInt(inputOne);
        int retirementAge = Integer.parseInt(inputTwo);

        if (currentAge < retirementAge) {
            //how many years left until retirement
            int difference = retirementAge - currentAge;
            System.out.printf("You have %d years left until you can retire.\n", difference);
            //Get the current year
            Date d = new Date();
            int year = d.getYear();
            int currentYear = year + 1900;
            System.out.printf("It's %d, so you can retire in %d.\n", currentYear, currentYear + difference);
        } else
            System.out.println("Invalid input. Try again.");
    }
}
