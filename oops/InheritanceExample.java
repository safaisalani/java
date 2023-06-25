package oops;

class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void drive() {
        System.out.println("Driving the " + brand);
    }
}

class Car extends Vehicle {
    private int numDoors;

    public Car(String brand, int numDoors) {
        super(brand);
        this.numDoors = numDoors;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Number of Doors: " + numDoors);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 4);
        car.displayDetails(); // Accessing method from Car class
        car.drive(); // Accessing method from Vehicle class
    }
}
