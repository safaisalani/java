package basic;

public class ThisKeywordExample {
    private String name;

    public ThisKeywordExample(String name) {
        // Using 'this' keyword to refer to the instance variable
        this.name = name;
    }

    public void printName() {
        // Using 'this' keyword to refer to the instance method
        System.out.println("Name: " + this.getName());
    }

    public String getName() {
        // Using 'this' keyword to refer to the instance variable
        return this.name;
    }

    public static void main(String[] args) {
        // Creating an object of ThisKeywordExample class
        ThisKeywordExample example = new ThisKeywordExample("John Doe");

        // Calling the printName method
        example.printName();
    }
}
