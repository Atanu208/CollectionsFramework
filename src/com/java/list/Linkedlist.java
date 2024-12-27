package com.java.list;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
//*************************************** Basic Operations *********************************************
        // Method - add(E e) || Adds an element to the end of the list.
        list.add("Apple");
        list.add("Banana");
        System.out.println(list); // Output: [Apple, Banana]

        // Method - add(int index, E element) || Adds an element at a specified position.
        list.add(1, "Mango");
        System.out.println(list); // Output: [Apple, Mango, Banana]

        // Method - get(int index) || Returns the element at the specified index.
        System.out.println(list.get(1)); // Output: Mango

        // Method - set(int index, E element) || Replaces the element at the specified index.
        list.set(1, "Orange");
        System.out.println(list); // Output: [Apple, Orange, Banana]

        // Method - remove(int index) || Removes the element at the specified index.
        list.remove(1);
        System.out.println(list); // Output: [Apple, Banana]

        // Method - remove(Object o) || Removes the first occurrence of the specified element.
        list.remove("Apple");
        System.out.println(list); // Output: [Banana]

        // Method - clear() || Removes all elements from the list.
        list.clear();
        System.out.println(list); // Output: []

//************************************ Deque Operations (Head and Tail) *****************************************

        // Method - addFirst(E e) || Adds an element at the beginning of the list.
        list.addFirst("Grapes");
        System.out.println(list); // Output: [Grapes]

        // Method - addLast(E e) || Adds an element at the end of the list.
        list.addLast("Pineapple");
        System.out.println(list); // Output: [Grapes, Pineapple]

        // Method - getFirst() || Returns the first element without removing it.
        System.out.println(list.getFirst()); // Output: Grapes

        // Method - getLast() || Returns the last element without removing it.
        System.out.println(list.getLast()); // Output: Pineapple

        // Method - removeFirst() || Removes and returns the first element.
        System.out.println(list.removeFirst()); // Output: Grapes
        System.out.println(list); // Output: [Pineapple]

        // Method - removeLast() || Removes and returns the last element.
        System.out.println(list.removeLast()); // Output: Pineapple
        System.out.println(list); // Output: []

//********************************** Search Operations ***************************************
        // Method - contains(Object o) || Checks if the list contains a specific element.
        list.add("Apple");
        list.add("Banana");
        System.out.println(list.contains("Banana")); // Output: true

        // Method - indexOf(Object o) || Returns the index of the first occurrence of the specified element.
        System.out.println(list.indexOf("Banana")); // Output: 1

        // Method - lastIndexOf(Object o) || Returns the index of the last occurrence of the specified element.
        System.out.println(list.lastIndexOf("Apple")); // Output: 2

// *************************************** Queue Operations *************************************************

        // Method - offer(E e) || Adds an element at the end of the list (alternative to add).
        list.offer("Orange");
        System.out.println(list); // Output: [Apple, Banana, Orange]

        // Method - poll() || Removes and returns the first element (or null if the list is empty).
        System.out.println(list.poll()); // Output: Apple
        System.out.println(list); // Output: [Banana, Orange]

        // Method - peek() || Returns the first element without removing it (or null if the list is empty).
        System.out.println(list.peek());  // Output: Banana

// ************************* Utility Methods **************************

        // Method - size() || Returns the number of elements in the list.
        System.out.println(list.size());

        // Method - isEmpty() || Checks if the list is empty.
        System.out.println(list.isEmpty());

        // Method - toArray() || Converts the list to an array.
        Object[] array=list.toArray();
        for (Object item: array) {
            System.out.println(item);   // Output:
        }                               // Banana
                                        // Orange

        // Method - forEach(Consumer<? super E> action) || Performs the given action for each element.
        list.forEach(System.out::println);  // Output:
                                            // Banana
                                            // Orange

// ************************************ Advanced Operations *********************************

        // Method - clone() || Creates a shallow copy of the list.
        LinkedList<String> cloneList = (LinkedList<String>) list.clone();
        System.out.println(cloneList); // Output: [Banana, Orange]

        // Method - descendingIterator() || Returns an iterator to traverse the list in reverse order.
        Iterator<String> it=list.descendingIterator();
        while (it.hasNext())
        {
            System.out.println(it.next());  // Output:
        }                                   // Orange
                                            // Banana
    }
}
