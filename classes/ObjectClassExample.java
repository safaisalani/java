package classes;

import java.util.Objects;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person otherPerson = (Person) obj;
        return name.equals(otherPerson.name) && age == otherPerson.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}

public class ObjectClassExample {
    public static void main(String[] args) {
        Person person1 = new Person("John Doe", 30);
        Person person2 = new Person("John Doe", 30);
        Person person3 = new Person("Jane Smith", 25);

        // equals() method example
        System.out.println("person1 equals person2: " + person1.equals(person2));
        System.out.println("person1 equals person3: " + person1.equals(person3));

        // hashCode() method example
        System.out.println("person1 hashCode: " + person1.hashCode());
        System.out.println("person2 hashCode: " + person2.hashCode());
        System.out.println("person3 hashCode: " + person3.hashCode());

        // toString() method example
        System.out.println("person1: " + person1);
        System.out.println("person2: " + person2);
        System.out.println("person3: " + person3);
    }
}
