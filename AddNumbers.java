package chapter4;

import java.util.Scanner;

/*
Do while loop
*write a program' that allows a user to add two no
*sums no up and user shld b able to repeat the action
until they indicate they r donr
 */
public class AddNumbers {

    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        boolean again;
        do{
            System.out.println("Enter the first number");
            double num1 = scanner.nextDouble();

            System.out.println("Enter the  second number");
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;
            System.out.println("The sum is " + sum);

            System.out.println("Would you like to start all over True or false");
            again = scanner.nextBoolean();
        }while(again);

        scanner.close();
    }
}
