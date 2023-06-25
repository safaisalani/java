package loops;

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListIteratorExample {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println("Name: " + name);
        }
    }
}
