//Interface to implement features

package Day2.Features;

import java.util.List;
import java.util.Scanner;
import Day2.Models.Student;

public interface Feature {
    void execute(Scanner input, List<Student> studentList);
}