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

    public boolean equals(Object otherObj) {
        if (this == otherObj) return true;
        if (otherObj == null) return false;
        // Pattern variable
        if (!(otherObj instanceof Person other)) return false;
        return name.equals(other.name);
    }


}
