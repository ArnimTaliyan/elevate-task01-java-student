package Day2;

import java.util.List;
import java.util.Scanner;

public class ViewFeature implements Feature{
    @Override
    public void execute(Scanner input, List<Student> studentList) {
        System.out.println("------ View Students ------");

        if (studentList.isEmpty()) {
            System.out.println("No students found.\n");
            return;
        }

        for (Student student : studentList) {
            System.out.println("ID: " + student.getId());
            System.out.println("Name: " + student.getName());
            System.out.println("Marks: " + student.getMarks());
            System.out.println("----------------------------");
        }

        System.out.println();
    }
}