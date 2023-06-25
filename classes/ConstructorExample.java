package classes;

public class ConstructorExample {
    private String name;
    private int age;

    // Parameterized constructor
    public ConstructorExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Default constructor
    public ConstructorExample() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        // Create objects using different constructors
        ConstructorExample obj1 = new ConstructorExample("John Doe", 30);
        ConstructorExample obj2 = new ConstructorExample();

        // Access object properties using getter methods
        System.out.println("Object 1 - Name: " + obj1.getName() + ", Age: " + obj1.getAge());
        System.out.println("Object 2 - Name: " + obj2.getName() + ", Age: " + obj2.getAge());
    }
}
