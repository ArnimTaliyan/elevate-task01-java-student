//Update feature tu update existing student ID, name and marks

package Features;

import java.util.List;
import java.util.Scanner;
import Models.Student;
import Validations.Util;

public class UpdateFeature implements Feature{
    @Override
    public void execute(Scanner input, List<Student> studentList) {
        System.out.println("------ Update Student ------");

        //Validate Student ID through Util.java
        int idToUpdate = Util.getValidateID(input, "Enter student ID to update: ");

        boolean found = false;

        for (Student student : studentList) {
            if (student.getId() == idToUpdate) {

                //Clear buffer
                input.nextLine();

                //Validate and Update student ID through Util.java
                int newId = Util.getValidateID(input, "Enter new student ID: ");
                student.setId(newId);

                //Clear buffer before reading name
                input.nextLine();

                //Update name
                System.out.print("Enter new student name: ");
                String newName = input.nextLine();
                student.setName(newName);

                //Validate and Update student marks through Util.java
                double newMarks = Util.getValidateMarks(input, "Enter new student marks: ");
                student.setMarks(newMarks);

                System.out.println("Student details updated successfully!\n");
                found = true;
                break;
            }
        }

        //Checks if targeted ID is in list
        if (!found) {
            System.out.println("Student with ID " + idToUpdate + " not found.\n");
        }
    }
}
