/**
 *  Java program to create, update, display, and clear HashMap instance.
 */

package com.mycollections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Create an instance of HashMap.
        Map<Integer, String> myMap = new HashMap<>();

        // Adding elements to myMap.
        myMap.put(1, "one");
        myMap.put(2, "two");
        myMap.put(3, "three");
        myMap.put(4, "four");
        myMap.put(5, "five");
        myMap.put(6, "six");

        // Print myMap.
        System.out.println(myMap); // Output: {1=one, 2=two, 3=three, 4=four, 5=five, 6=six}

        // Update.
        myMap.put(7, "seven");
        myMap.put(8, "eight");

        // Creating a set with keys.
        Set<Integer> keys = myMap.keySet();

        // Print keys of myMap.
        System.out.println("Keys: " + keys);

        // Creating a collection with values.
        Collection<String> values = myMap.values(); // Output: Keys: [1, 2, 3, 4, 5, 6, 7, 8]

        // Print values of myMap.
        System.out.println("Values: " + values); // Output: Values: [one, two, three, four, five, six, seven, eight]

        // Clear.
        myMap.clear();

    }
}