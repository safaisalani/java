package classes;

interface Greeting {
    void greet();
}

public class AnonymousClassExample {
    public static void main(String[] args) {
        // Creating an instance of the Greeting interface using an anonymous class
        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello, anonymous class!");
            }
        };

        // Invoking the greet() method of the anonymous class instance
        greeting.greet();
    }
}
