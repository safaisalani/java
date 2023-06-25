package loops;

import java.util.ArrayList;
import java.util.List;

public class ForeachLoopExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Iterating over an array using foreach loop
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }

        System.out.println();

        // Iterating over a collection using foreach loop
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
    }
}
