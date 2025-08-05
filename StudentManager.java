package Day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Day2.Features.Feature;
import Day2.MenuAndChoice.FeatureFactory;
import Day2.Models.Student;
import static Day2.MenuAndChoice.PrintMenu.printMenu;
import static Day2.Validations.Util.getValidate;
import static Day2.Validations.Util.getValidatedYesNo;

public class StudentManager {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Array List for studentList
        List<Student> studentList = new ArrayList<>();

        //Input to start program
        String start = "y";

        //Check for starting condition
        while (start.equalsIgnoreCase("y")) {

            //Print choice menu
            printMenu();

            //Take choice input and validate in Util.java
            int choice = getValidate(input, "");

            //It calls FeatureFactory.java and get appropriate feature requested
            Feature feature = FeatureFactory.getFeature(choice);

            //Checks where valid feature is returned or not
            if (feature != null) {
                feature.execute(input, studentList);
            } else {
                System.out.println("Invalid choice. Try again.");
            }

            //Take input to re-run or to stop application and validate in Util.java
            start = getValidatedYesNo(input, "Do you wish to continue? (y/n): ");
            System.out.println();
        }

        System.out.println("Thank you for using the Application!");
        input.close();
    }
}