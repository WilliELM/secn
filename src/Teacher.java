import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class Teacher extends SchoolEmployee{
    ArrayList<String> listOfStudents;

    public Teacher(String name, String role, int age, ArrayList<String> listOfStudents) {
        super(name, role, age);
        this.listOfStudents = listOfStudents;
    }


}
