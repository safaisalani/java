package classes;

public class AccessModifiersExample {
    public String publicVariable = "This is a public variable";

    private String privateVariable = "This is a private variable";

    protected String protectedVariable = "This is a protected variable";

    String defaultVariable = "This is a default variable";

    public void publicMethod() {
        System.out.println("This is a public method.");
    }

    private void privateMethod() {
        System.out.println("This is a private method.");
    }

    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }

    void defaultMethod() {
        System.out.println("This is a default method.");
    }

    public static void main(String[] args) {
        AccessModifiersExample example = new AccessModifiersExample();
        System.out.println(example.publicVariable); // Accessible directly
        System.out.println(example.privateVariable); // Not accessible due to private modifier
        System.out.println(example.protectedVariable); // Accessible within the same package and subclasses
        System.out.println(example.defaultVariable); // Accessible within the same package
        example.publicMethod(); // Accessible directly
        example.privateMethod(); // Not accessible due to private modifier
        example.protectedMethod(); // Accessible within the same package and subclasses
        example.defaultMethod(); // Accessible within the same package
    }
}
