package Day2;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choice;

        System.out.println("Choose an option:");
        System.out.println("1. Add Student");
        System.out.println("1. Add Student");
        System.out.println("2. View Student");
        System.out.println("3. Delete Student");
        System.out.println("4. Update Student");
        System.out.print("Your choice: ");

        while (!input.hasNextInt()) {
            System.out.print("Invalid input! Please enter a valid number: ");
            input.next(); // clear the invalid input
        }
        choice = input.nextInt();

        Feature feature = null;

        switch (choice) {
            case 1 -> feature = new AddFeature();
            case 2 -> feature = new ViewFeature();
            case 3 -> feature = new DeleteFeature();
            case 4-> feature = new UpdateFeature();
            default -> System.out.println("Invalid choice");
        }

        input.close();
    }
}