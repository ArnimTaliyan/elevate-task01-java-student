//Interface to implement features

package Features;

import java.util.List;
import java.util.Scanner;
import Models.Student;

public interface Feature {
    void execute(Scanner input, List<Student> studentList);
}