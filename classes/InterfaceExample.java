package classes;

// Interface
interface Shape {
    void draw(); // Abstract method
    double calculateArea(); // Abstract method
}

// Implementing class 1
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Implementing class 2
class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        circle.draw();
        double circleArea = circle.calculateArea();
        System.out.println("Circle area: " + circleArea);

        Rectangle rectangle = new Rectangle(4.0, 6.0);
        rectangle.draw();
        double rectangleArea = rectangle.calculateArea();
        System.out.println("Rectangle area: " + rectangleArea);
    }
}
