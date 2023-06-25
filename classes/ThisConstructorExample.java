package classes;

public class ThisConstructorExample {
    private String name;
    private int age;

    // Parameterized constructor
    public ThisConstructorExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Default constructor
    public ThisConstructorExample() {
        this("Unknown", 0); // Calling the parameterized constructor using this()
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        // Create an object using the default constructor
        ThisConstructorExample obj = new ThisConstructorExample();

        // Access object properties using getter methods
        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
    }
}
