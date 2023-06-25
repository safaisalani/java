package basic;
public class TypeConversionExample {
    public static void main(String[] args) {
        // Type Casting
        // Implicit Casting (Widening Conversion)
        int numInt = 10;
        double numDouble = numInt; // Implicitly cast int to double
        System.out.println("Implicit Casting: " + numDouble);

        // Explicit Casting (Narrowing Conversion)
        double doubleNum = 3.14;
        int intNum = (int) doubleNum; // Explicitly cast double to int
        System.out.println("Explicit Casting: " + intNum);

        // String to Numeric Conversion
        String strNum = "12345";
        int convertedNum = Integer.parseInt(strNum);
        System.out.println("Converted Numeric Value: " + convertedNum);

        // Numeric to String Conversion
        int number = 42;
        String strNumber = String.valueOf(number);
        System.out.println("Converted String Value: " + strNumber);

        // Character to String Conversion
        char character = 'A';
        String strCharacter = Character.toString(character);
        System.out.println("Converted Character Value: " + strCharacter);
    }
}
