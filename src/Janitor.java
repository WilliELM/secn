public class Janitor extends SchoolEmployee{
    boolean cleansSchool;
    public Janitor(String name, String role, int age, boolean cleansSchool) {
        super(name, role, age);
        this.cleansSchool = cleansSchool;
    }
}
