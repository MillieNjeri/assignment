/*This is a program designed to help the user perform basic arithmetic operation like addittion, subtraction, multiplication and division.*/

//Importing scanner from java util
import java.util.Scanner;

//Create a class
public class Calculator {

    // Main method
    public static void main(String[] args) {

        // Creating an object of scanner class
        Scanner scanner = new Scanner(System.in);

        // Request the user for the first number
        System.out.println("Please enter the first number:");

        // Getting the first number
        double number1 = scanner.nextDouble();

        // Request the user to enter the desired arithmetic operator to be used
        System.out.println("Please enter the arithmetic operator:");

        // getting the operator
        char operator = scanner.next().charAt(0);

        // Request the user for the second number
        System.out.println("Please enter the second number:");

        // getting the second number
        double number2 = scanner.nextDouble();

        // Close scanner to prevent leakage
        scanner.close();

        double answer;

        // The calculation is performed depending on the users input
        switch (operator) {

            // If the user uses the subtraction operator

            case '-':
                answer = number1 - number2;
                // The output will be
                System.out.println("The answer is:" + number1 + " - " + number2 + " = " + answer);
                break;

            // If the user uses the divison operator
            case '/':
                answer = number1 / number2;
                // The output will be
                System.out.println("The answer is:" + number1 + " / " + number2 + " = " + answer);
                break;

            // If the user uses the multiplication operator
            case '*':
                answer = number1 * number2;
                // The output will be as follows
                System.out.println("The answer is:" + number1 + " * " + number2 + " = " + answer);
                break;

            // If the user uses the addittion operator
            case '+':
                answer = number1 + number2;
                // The output will be
                System.out.println("The answer is:" + number1 + " + " + number2 + " = " + answer);
                break;

            // If the user enters any other operator apart from +,-,/,*
            default:

                // It will be an invalid entry
                System.out.println("This is an invalid entry");
        }

    }
}