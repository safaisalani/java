package basic;
public class PrimitiveDataTypesExample {
    public static void main(String[] args) {
        // byte (1 byte)
        byte myByte = 10;
        System.out.println("Byte: " + myByte + " (Size: " + Byte.BYTES + " byte)");

        // short (2 bytes)
        short myShort = 1000;
        System.out.println("Short: " + myShort + " (Size: " + Short.BYTES + " bytes)");

        // int (4 bytes)
        int myInt = 100000;
        System.out.println("Int: " + myInt + " (Size: " + Integer.BYTES + " bytes)");

        // long (8 bytes)
        long myLong = 1000000000L;
        System.out.println("Long: " + myLong + " (Size: " + Long.BYTES + " bytes)");

        // float (4 bytes)
        float myFloat = 3.14f;
        System.out.println("Float: " + myFloat + " (Size: " + Float.BYTES + " bytes)");

        // double (8 bytes)
        double myDouble = 3.14159;
        System.out.println("Double: " + myDouble + " (Size: " + Double.BYTES + " bytes)");

        // boolean (1 byte)
        boolean myBoolean = true;
        System.out.println("Boolean: " + myBoolean + " (Size: 1 byte)");

        // char (2 bytes)
        char myChar = 'A';
        System.out.println("Char: " + myChar + " (Size: " + Character.BYTES + " bytes)");
    }
}
