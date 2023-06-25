package basic;
import java.math.BigInteger;
import java.math.BigDecimal;

public class OtherDataTypesExample {
    public static void main(String[] args) {
        // String
        String myString = "Hello, World!";
        System.out.println("String: " + myString);

        // BigInteger
        BigInteger bigInteger = new BigInteger("12345678901234567890");
        System.out.println("BigInteger: " + bigInteger);

        // BigDecimal
        BigDecimal bigDecimal = new BigDecimal("3.14159265358979323846");
        System.out.println("BigDecimal: " + bigDecimal);

        // Array
        int[] myArray = {1, 2, 3, 4, 5};
        System.out.println("Array: " + myArray);

        // Enum
        Season season = Season.SUMMER;
        System.out.println("Enum: " + season);

        // Class
        Class<?> stringClass = String.class;
        System.out.println("Class: " + stringClass);

        // Interface
        MyInterface myInterface = new MyClass();
        myInterface.interfaceMethod();

        // null
        String nullString = null;
        System.out.println("Null String: " + nullString);
    }

    interface MyInterface {
        void interfaceMethod();
    }

    static class MyClass implements MyInterface {
        public void interfaceMethod() {
            System.out.println("Interface method implementation");
        }
    }

    enum Season {
        SPRING, SUMMER, AUTUMN, WINTER
    }
}
