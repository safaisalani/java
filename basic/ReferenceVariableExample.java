package basic;

public class ReferenceVariableExample {
    public static void main(String[] args) {
        // Declare reference variables
        String message;
        int[] numbers;

        // Assign values to reference variables
        message = "Hello, world!";
        numbers = new int[]{1, 2, 3, 4, 5};

        // Access and modify values through reference variables
        System.out.println(message);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Assigning a reference variable to another reference variable
        int[] moreNumbers = numbers;

        // Modifying the values through either reference variable
        numbers[0] = 10;
        moreNumbers[1] = 20;

        // The change is reflected in both reference variables
        System.out.println(numbers[0]);      // Output: 10
        System.out.println(moreNumbers[1]);  // Output: 20
    }
}
