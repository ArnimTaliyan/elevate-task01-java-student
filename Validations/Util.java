//Validating User inputs

package Day2.Validations;

import java.util.Scanner;

public class Util {

    //Validation for choice
    public static int getValidate(Scanner input, String prompt) {
        System.out.print(prompt);

        while (!input.hasNextInt()) {
            System.out.print("Invalid input! Please enter a valid number: ");
            input.next();
        }
        return input.nextInt();
    }

    //Validation to re-run or close application
    public static String getValidatedYesNo(Scanner input, String prompt) {
        System.out.print(prompt);
        String response = input.next();
        while (!response.equalsIgnoreCase("y") && !response.equalsIgnoreCase("n")) {
            System.out.print("Invalid choice. Please enter y or n: ");
            response = input.next();
        }
        return response;
    }

    //Validation for ID
    public static int getValidateID(Scanner input, String prompt) {
        System.out.print(prompt);

        while (!input.hasNextInt()) {
            System.out.print("Invalid input! Please enter a valid ID: ");
            input.next();
        }
        return input.nextInt();
    }

    // Validation for marks
    public static double getValidateMarks(Scanner input, String prompt) {
        double marks = -1;

        while (true) {
            System.out.print(prompt);
            if (input.hasNextDouble()) {
                marks = input.nextDouble();

                if (marks >= 0 && marks <= 100) {
                    break; // valid input, exit loop
                } else {
                    System.out.println("Marks should be between 0 and 100.");
                }
            } else {
                System.out.println("Invalid input! Please enter a valid decimal number.");
                input.next(); // clear invalid input
            }
        }
        return marks;
    }
}