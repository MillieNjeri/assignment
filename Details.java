/*This is a program designed to calculate the number of characters of the sur name entered by the user and current age
 determine if the users age is odd or even depending on the age number entered. */

//Import the scanner class from java util package
import java.util.Scanner;

//Create a class
public class Details {
    // Main method
    public static void main(String[] args) {
        // Creating object of scanner class
        Scanner scanner = new Scanner(System.in);

        // Request user for the sur name
        System.out.println("Please enter your surname:");

        // getting the name
        String name = scanner.nextLine();

        // Request user for the current age
        System.out.println("Please enter your current age:");

        int age = scanner.nextInt();

        // Close the scanner to prevent leakage
        scanner.close();

        // Calculating the number of characters in the name
        int numCharacters = name.length();

        // Checking if the age is odd or even
        String ageType = (age % 2 == 0) ? "Even" : "Odd";

        System.out.println("The length of your sur name is" + " " + numCharacters + " " + "and your current age is" + " "
                + ageType + " " + "number");

    }

}