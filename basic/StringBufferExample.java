package basic;

public class StringBufferExample {
    public static void main(String[] args) {
        // Create a StringBuffer object
        StringBuffer stringBuffer = new StringBuffer();

        // Append strings to the StringBuffer
        stringBuffer.append("Hello");
        stringBuffer.append(" ");
        stringBuffer.append("World!");

        // Insert a string at a specific position
        stringBuffer.insert(5, " Java");

        // Replace a portion of the string
        stringBuffer.replace(12, 17, "GPT-3");

        // Delete a portion of the string
        stringBuffer.delete(6, 10);

        // Convert the StringBuffer to a string
        String result = stringBuffer.toString();

        // Print the final result
        System.out.println(result);
    }
}
