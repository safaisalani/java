package classes;

class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

public class DynamicDispatchExample {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Dog();
        Animal animal3 = new Cat();

        animal1.makeSound(); // Invokes makeSound() method of Animal class
        animal2.makeSound(); // Invokes makeSound() method of Dog class
        animal3.makeSound(); // Invokes makeSound() method of Cat class

        // Calling makeSound() using a method parameter
        performSound(animal1);
        performSound(animal2);
        performSound(animal3);
    }

    public static void performSound(Animal animal) {
        animal.makeSound(); // Invokes the appropriate makeSound() method based on the actual type of the object
    }
}
