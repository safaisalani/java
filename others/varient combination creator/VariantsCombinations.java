import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VariantsCombinations {
    public static void main(String[] args) {
        List<String> sizes = Arrays.asList("large", "small", "big");
        List<String> colors = Arrays.asList("red", "blue", "green");
        List<String> shapes = Arrays.asList("circle", "cube");

        List<List<String>> combinations = generateCombinations(sizes, colors, shapes);

        for (List<String> combination : combinations) {
            System.out.println(combination);
        }
    }

    private static List<List<String>> generateCombinations(List<String> sizes, List<String> colors, List<String> shapes) {
        List<List<String>> combinations = new ArrayList<>();

        for (String size : sizes) {
            for (String color : colors) {
                for (String shape : shapes) {
                    List<String> combination = Arrays.asList(size, color, shape);
                    combinations.add(combination);
                }
            }
        }

        return combinations;
    }
}
