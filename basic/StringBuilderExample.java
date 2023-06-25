package basic;

public class StringBuilderExample {
    public static void main(String[] args) {
        // Create a StringBuilder object
        StringBuilder stringBuilder = new StringBuilder();

        // Append strings to the StringBuilder
        stringBuilder.append("Hello");
        stringBuilder.append(" ");
        stringBuilder.append("World!");

        // Insert a string at a specific position
        stringBuilder.insert(5, " Java");

        // Replace a portion of the string
        stringBuilder.replace(12, 17, "GPT-3");

        // Delete a portion of the string
        stringBuilder.delete(6, 10);

        // Convert the StringBuilder to a string
        String result = stringBuilder.toString();

        // Print the final result
        System.out.println(result);
    }
}
