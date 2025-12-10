package javastream;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        // TreeMap with Integer keys and String values
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(3, "Three");
        map.put(1, "One");
        map.put(4, "Four");
        map.put(2, "Two");

        // By default: ascending order of keys
        System.out.println("Ascending order:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key = " + entry.getKey()
                    + ", Value = " + entry.getValue());
        }

        // Descending order using descendingMap()
        System.out.println("\nDescending order (by key):");
        for (Map.Entry<Integer, String> entry : map.descendingMap().entrySet()) {
            System.out.println("Key = " + entry.getKey()
                    + ", Value = " + entry.getValue());
        }
    }
}

