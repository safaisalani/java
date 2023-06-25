package classes;

class Vehicle {
    protected final String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public final void startEngine() {
        System.out.println("Starting the engine of " + brand);
    }
}

class Car extends Vehicle {
    private final int numDoors;

    public Car(String brand, int numDoors) {
        super(brand);
        this.numDoors = numDoors;
    }

    // Cannot override the final startEngine() method in the superclass

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Number of Doors: " + numDoors);
    }
}

public class FinalExample {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 4);
        car.startEngine(); // Accessing the final method from the superclass
        car.displayDetails(); // Accessing the method from the subclass
    }
}
