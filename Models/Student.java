//Class to implement encapsulation

package Day2.Models;

public class Student {
    private int id;
    private String name;
    private double marks;

    //Constructor to take ID, name and marks
    public Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    //Getter and Setters to retrieve and set data
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
}