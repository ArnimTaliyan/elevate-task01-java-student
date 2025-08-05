package Day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static Day2.PrintMenu.printMenu;
import static Day2.Util.getValidate;
import static Day2.Util.getValidatedYesNo;

public class StudentManager {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Student> studentList = new ArrayList<>();

        String start = "y";

        while (start.equalsIgnoreCase("y")) {
            printMenu();
            int choice = getValidate(input, "");

            Feature feature = FeatureFactory.getFeature(choice);

            if (feature != null) {
                feature.execute(input, studentList);
            } else {
                System.out.println("Invalid choice. Try again.");
            }

            start = getValidatedYesNo(input, "Do you wish to continue? (y/n): ");
            System.out.println();
        }

        System.out.println("Thank you for using the Application!");
        input.close();
    }
}