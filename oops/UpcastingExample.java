package oops;

class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("The dog barks");
    }

    public void fetch() {
        System.out.println("The dog fetches the ball");
    }
}

public class UpcastingExample {
    public static void main(String[] args) {
        Animal animal = new Dog(); // Upcasting

        animal.makeSound(); // Calls the overridden method in Dog class
        // animal.fetch(); // Error: Cannot access fetch() method as it is not part of Animal class
    }
}
