package OrderByAge;

public class Person {
    private final String name;
    private final String ID;
    private final int age;

    public Person(String name, String ID, int age) {
        this.name = name;
        this.ID = ID;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public String toString() {
        return String.format("%s with ID: %s is %d years old.", getName(), getID(), getAge());
    }
}
