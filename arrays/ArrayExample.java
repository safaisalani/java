package arrays;

public class ArrayExample {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = {5, 10, 15, 20, 25};

        // Access and modify array elements
        System.out.println("Array Length: " + numbers.length);
        System.out.println("First Element: " + numbers[0]);
        System.out.println("Third Element: " + numbers[2]);

        numbers[1] = 12; // Modifying array element

        // Loop through the array
        System.out.print("Array Elements: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Declare and initialize an array of strings
        String[] names = new String[3];
        names[0] = "John";
        names[1] = "Jane";
        names[2] = "Bob";

        // Loop through the array using a foreach loop
        System.out.print("Names: ");
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();
    }
}
