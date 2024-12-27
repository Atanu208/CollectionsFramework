package com.java.list;

import java.util.Enumeration;
import java.util.Iterator;

public class Vector {
    public static void main(String[] args) {
        java.util.Vector<String> vector = new java.util.Vector<>();
//*************************************** Basic Operations *********************************************

        // Method - add(E e) || Adds an element to the end of the vector.
        vector.add("Apple");
        vector.add("Banana");
        System.out.println(vector); // Output: [Apple, Banana]

        // Method - add(int index, E element) || Adds an element at a specified index.
        vector.add(1, "Mango");
        System.out.println(vector); // Output: [Apple, Mango, Banana]

        // Method - get(int index) || Returns the element at the specified index.
        System.out.println(vector.get(1));

        // Method - set(int index, E element) || Replaces the element at the specified index.
        vector.set(1, "Orange");
        System.out.println(vector); // Output: [Apple, Orange, Banana]

        // Method - remove(int index) || Removes the element at the specified index.
        vector.remove(1);
        System.out.println(vector); // Output: [Apple, Banana]

        // Method - remove(Object o) || Removes the first occurrence of the specified element.
        vector.remove("Apple");
        System.out.println(vector); // Output: [Banana]

        // Method - clear() || Removes all elements from the vector.
        vector.clear();
        System.out.println(vector); // Output: []

//*************************************** Capacity and Size *********************************************

        // Method - size() || Returns the number of elements in the vector.
        System.out.println(vector.size()); // Output: 0

        // Method - capacity() || Returns the current capacity of the vector.
        java.util.Vector<Integer> numbers = new java.util.Vector<>(5);
        System.out.println(numbers.capacity()); // Output: 5

        // Method - ensureCapacity(int minCapacity) || Increases the capacity of the vector to ensure it can hold at least the specified number of elements.
        numbers.ensureCapacity(10);
        System.out.println(numbers.capacity()); // Output: 10

        // Method - trimToSize() || Reduces the capacity of the vector to match its size.
        numbers.trimToSize();
        System.out.println(numbers.capacity()); // Output: 0 (if empty)

        //*************************************** Iteration *********************************************

        // Method - forEach(Consumer<? super E> action) || Performs the specified action for each element.
        vector.add("Apple");
        vector.add("Banana");
        vector.forEach(System.out::println); // Output:
        // Apple
        // Banana

        // Method - iterator() || Returns an iterator for the vector.
        Iterator<String> iterator = vector.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());  // Output:
        }                                         // Apple
        //Banana

        // Method - elements() || Returns an enumeration of the elements in the vector.
        Enumeration<String> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());  // Output
        }                                                   // Apple
        // Banana

// *************************************** Searching *********************************************

        // Method - contains(Object o) || Checks if the vector contains a specific element.
        System.out.println(vector.contains("Banana")); // Output: true

        // Method - indexOf(Object o) || Returns the index of the first occurrence of the element, or -1 if not found.
        System.out.println(vector.indexOf("Banana"));

        // Method - lastIndexOf(Object o) || Returns the index of the last occurrence of the element, or -1 if not found.
        vector.add("Apple");
        System.out.println(vector.lastIndexOf("Apple"));

// *************************************** Utility Methods *********************************************

        // Method - isEmpty() || Checks if the vector is empty.
        System.out.println(vector.isEmpty()); // Output: false

        // Method - toArray() || Converts the vector to an array.
        Object[] array = vector.toArray();
        for (Object item : array) {
            System.out.println(item); // Output:
            // Apple
            // Banana
        }
        // Method - clone() || Creates a shallow copy of the vector.
        java.util.Vector<String> cloneVector = (java.util.Vector<String>) vector.clone();
        System.out.println(cloneVector);

        // Method - subList(int fromIndex, int toIndex) || Returns a portion of the vector between fromIndex (inclusive) and toIndex (exclusive).
        System.out.println(vector.subList(0, 2)); // Output: [Apple, Banana]


    }
}
