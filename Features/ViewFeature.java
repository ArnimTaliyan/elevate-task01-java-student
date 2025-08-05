//View feature to view students in list

package Features;

import java.util.List;
import java.util.Scanner;
import Models.Student;

public class ViewFeature implements Feature {
    @Override
    public void execute(Scanner input, List<Student> studentList) {
        System.out.println("------ View Students ------");

        //Check if list is not empty
        if (studentList.isEmpty()) {
            System.out.println("No students found.\n");
            return;
        }

        //Iterating through list to retrieve elements
        for (Student student : studentList) {
            System.out.println("ID: " + student.getId());
            System.out.println("Name: " + student.getName());
            System.out.println("Marks: " + student.getMarks());
            System.out.println("----------------------------");
        }

        System.out.println();
    }
}