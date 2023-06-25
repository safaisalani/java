package classes;

class OuterClass {
    private String outerMessage;

    public OuterClass(String message) {
        outerMessage = message;
    }

    // Inner class
    class InnerClass {
        public void display() {
            System.out.println("Message from InnerClass: " + outerMessage);
        }
    }
}

public class InnerClassExample {
    public static void main(String[] args) {
        OuterClass outerObj = new OuterClass("Hello");

        // Creating an instance of the inner class
        OuterClass.InnerClass innerObj = outerObj.new InnerClass();

        // Calling the method of the inner class
        innerObj.display();
    }
}
