package basic;
public class DataTypesExampleSize {
    public static void main(String[] args) {
        // byte
        System.out.println("Byte Range: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("Byte Size: " + Byte.SIZE + " bits");

        // short
        System.out.println("Short Range: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("Short Size: " + Short.SIZE + " bits");

        // int
        System.out.println("Int Range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("Int Size: " + Integer.SIZE + " bits");

        // long
        System.out.println("Long Range: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println("Long Size: " + Long.SIZE + " bits");

        // float
        System.out.println("Float Range: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("Float Size: " + Float.SIZE + " bits");

        // double
        System.out.println("Double Range: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        System.out.println("Double Size: " + Double.SIZE + " bits");

        // char
        System.out.println("Char Range: " + (int) Character.MIN_VALUE + " to " + (int) Character.MAX_VALUE);
        System.out.println("Char Size: " + Character.SIZE + " bits");

        // boolean
        System.out.println("Boolean Range: " + Boolean.FALSE + " to " + Boolean.TRUE);
        // Booleans do not have a specific size since they are represented as a single bit
    }
}
