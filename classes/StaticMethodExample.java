package classes;

public class StaticMethodExample {
    public static void main(String[] args) {
        // Calling the static method directly using the class name
        int result1 = MathUtils.add(5, 3);
        System.out.println("Result 1: " + result1);

        // Creating an object of the class
        MathUtils mathUtils = new MathUtils();
        // Calling the static method using the object (not recommended)
        int result2 = mathUtils.subtract(10, 7);
        System.out.println("Result 2: " + result2);
    }
}

class MathUtils {
    // Static method
    public static int add(int a, int b) {
        return a + b;
    }

    // Instance method
    public int subtract(int a, int b) {
        return a - b;
    }
}
