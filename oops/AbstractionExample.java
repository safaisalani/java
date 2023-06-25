package oops;

// Abstract class
abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    // Abstract method
    public abstract double calculateArea();

    // Concrete method
    public void display() {
        System.out.println("Shape color: " + color);
    }
}

// Interface
interface Drawable {
    void draw();
}

// Concrete class implementing the abstract class and interface
class Circle extends Shape implements Drawable {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 5.0);
        circle.display();
        circle.draw();

        double area = circle.calculateArea();
        System.out.println("Circle area: " + area);
    }
}
