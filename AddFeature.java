package Day2;

import java.util.List;
import java.util.Scanner;

public class AddFeature implements Feature {
    @Override
    public void execute(Scanner input, List<Student> studentList) {
        System.out.println("------ Add Student ------");

        // Validate and input student ID
        int id = Util.getValidateID(input, "Enter student ID: ");

        input.nextLine(); // Clear buffer before reading name

        // Input name
        System.out.print("Enter student name: ");
        String name = input.nextLine();

        // Validate and input marks
        double marks = Util.getValidateMarks(input, "Enter student marks: ");

        // Create student and add to list
        Student student = new Student(id, name, marks);
        studentList.add(student);

        System.out.println("Student added successfully!\n");
    }
}