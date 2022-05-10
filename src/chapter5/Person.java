package chapter5;

public abstract class Person {
    String name = "unknown";

    public Person() {}

    public Person(String name) {
        this.name = name;
    }

    public abstract String getDescription();

    public final String getName() {
        return this.name;
    }


}
