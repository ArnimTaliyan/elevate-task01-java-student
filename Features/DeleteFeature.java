//Delete feature to deleted student with associated ID

package Day2.Features;

import java.util.List;
import java.util.Scanner;
import Day2.Models.Student;
import Day2.Validations.Util;

public class DeleteFeature implements Feature {
    @Override
    public void execute(Scanner input, List<Student> studentList) {
        System.out.println("------ Delete Student ------");

        //Validate Student ID through Util.java
        int idToDelete = Util.getValidateID(input, "Enter student ID to delete: ");

        boolean removed = false;

        //Iterating through list to find targeted ID to remove
        for (Student student : studentList) {
            if (student.getId() == idToDelete) {
                studentList.remove(student);
                removed = true;
                System.out.println("Student with ID " + idToDelete + " deleted successfully!\n");
                break;
            }
        }

        //Check if targeted ID is in list or not
        if (!removed) {
            System.out.println("Student with ID " + idToDelete + " not found.\n");
        }
    }
}