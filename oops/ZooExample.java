package oops;
import java.util.ArrayList;
import java.util.List;

// Animal class (Superclass)
class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }
}

// Subclass inheriting from Animal
class Lion extends Animal {
    public Lion(String name) {
        super(name);
    }

    public void roar() {
        System.out.println("Roar! " + super.getName() + " is roaring.");
    }
}

// Interface defining the behavior of a Flyable object
interface Flyable {
    void fly();
}

// Bird class implementing Flyable interface
class Bird extends Animal implements Flyable {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(super.getName() + " is flying.");
    }
}

// Main class
public class ZooExample {
    public static void main(String[] args) {
        // Encapsulation and inheritance
        Lion lion = new Lion("Simba");
        lion.eat();
        lion.roar();

        Bird bird = new Bird("Sparrow");
        bird.eat();
        bird.fly();

        // Polymorphism
        Animal animal1 = new Lion("Leo");
        Animal animal2 = new Bird("Eagle");

        animal1.eat(); // Lion's eat method
        animal2.eat(); // Bird's eat method

        // Association
        Zoo zoo = new Zoo();
        zoo.addAnimal(lion);
        zoo.addAnimal(bird);
        zoo.displayAnimals();
    }
}

// Zoo class demonstrating association
class Zoo {
    private List<Animal> animals;

    public Zoo() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void displayAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal.getName());
        }
    }
}
