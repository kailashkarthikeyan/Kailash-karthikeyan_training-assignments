package javastream;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        // Create a Vector of integers
        Vector<Integer> numbers = new Vector<>();

        // Add elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Insert at specific index
        numbers.add(2, 25);

        // Access elements
        System.out.println("Vector elements: " + numbers);
        System.out.println("Element at index 1: " + numbers.get(1));

        // Update element
        numbers.set(0, 5);

        // Remove element
        numbers.remove(Integer.valueOf(30));

        // Iterate using for-each
        System.out.println("After modifications:");
        for (Integer n : numbers) {
            System.out.println(n);
        }

        // Vector properties
        System.out.println("Size: " + numbers.size());
        System.out.println("Capacity: " + numbers.capacity());
    }
}
