//Add feature to add student in List

package Day2.Features;

import java.util.List;
import java.util.Scanner;
import Day2.Models.Student;
import Day2.Validations.Util;

public class AddFeature implements Feature {
    @Override
    public void execute(Scanner input, List<Student> studentList) {
        System.out.println("------ Add Student ------");

        //Validate and input student ID through Util.java
        int id = Util.getValidateID(input, "Enter student ID: ");

        //Clear buffer before reading name
        input.nextLine();

        //Input name
        System.out.print("Enter student name: ");
        String name = input.nextLine();

        //Validate and input marks Util.java
        double marks = Util.getValidateMarks(input, "Enter student marks: ");

        //Create student and add to list
        Student student = new Student(id, name, marks);
        studentList.add(student);

        System.out.println("Student added successfully!\n");
    }
}