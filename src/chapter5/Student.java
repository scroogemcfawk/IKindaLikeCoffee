package chapter5;

public class Student extends Person {
    private String major = "unknown";

    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    @Override
    public String getDescription() {
        return "a student majoring in " + this.major;
    }

    @Override
    public String toString() {
        return super.toString() + "[major=" + this.major + "]";
    }
}
