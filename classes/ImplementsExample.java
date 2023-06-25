package classes;

// Interface
interface Vehicle {
    void start();
    void stop();
}

// Implementing class 1
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
}

// Implementing class 2
class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike started");
    }

    @Override
    public void stop() {
        System.out.println("Bike stopped");
    }
}

public class ImplementsExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();

        Bike bike = new Bike();
        bike.start();
        bike.stop();
    }
}
