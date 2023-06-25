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

public class DownCastingExample {
    public static void main(String[] args) {
        Animal animal = new Dog(); // Upcasting

        animal.makeSound(); // Calls the overridden method in Dog class

        // Downcasting
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.fetch(); // Accessing the fetch() method of Dog class
        }
    }
}
