package oops;

public class EncapsulationExample {
    public static void main(String[] args) {
        // Create an object of the Employee class
        Employee employee = new Employee();

        // Set values using public setter methods
        employee.setName("John Doe");
        employee.setAge(30);
        employee.setSalary(5000.0);

        // Get values using public getter methods
        String name = employee.getName();
        int age = employee.getAge();
        double salary = employee.getSalary();

        // Print employee details
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + salary);
    }
}

class Employee {
    private String name;
    private int age;
    private double salary;

    // Public getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    // Public setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
