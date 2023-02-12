public class Headmaster extends SchoolEmployee{
    boolean canFireEmployee;
    public Headmaster(String name, String role, int age, boolean canFireEmployee) {
        super(name, role, age);
        this.canFireEmployee = canFireEmployee;
    }
}
