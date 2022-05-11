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
        if (this.getClass() != otherObj.getClass()) return false;
        Person other = (Person) otherObj;
        return name.equals(other.name);
    }


}
