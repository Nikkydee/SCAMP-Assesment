package chapter4;

import java.util.Scanner;


public class GrossPayInputValidation {
    /* While loop
    Each store employee makes $15 an hour.
    Write a program that allows a manager to enter the number of
    weekly hours worked for each employee, and calculate their pay.
    Do not allow for overtime
     */
    public static void main (String[] args) {


        //declare known vallues
        int rate = 15;
        int maxHours = 40;

        //Get unknown variables, enter the no of hrs worked for each employee
        System.out.println("How many hours did you work this week");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner. nextDouble ();


        // Validate input ,calculate their pay
        while(hoursWorked > maxHours || hoursWorked < 1){
            System.out.println ( "Invalid entry hrs must be btwn 1 and 40" );
            hoursWorked = scanner.nextDouble();
            //hours Worked i the sentinel , it prevents the loop from running indefinitely

        }
        scanner.close();
        //calculate gross
        double gross = rate * hoursWorked ;
        System.out.println ( "The Gross pay is : $" + gross );
    }

}
