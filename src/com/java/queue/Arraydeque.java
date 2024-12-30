package com.java.queue;

import java.util.ArrayDeque;

public class Arraydeque {
    public static void main(String[] args) {

// *************************************** Add Elements ****************************************

        // Method - addFirst(E e) || Adds an element at the front of the deque.
        ArrayDeque<Integer> deque=new ArrayDeque<>();
        deque.addFirst(10);
        deque.addFirst(20);
        System.out.println(deque); // Output: [20, 10]

        // Method - addLast(E e) || Adds an element at the end of the deque.
        deque.addLast(30);
        deque.addLast(40);
        System.out.println(deque); // Output: [20, 10, 30, 40]

        // Method - offerFirst(E e) || Inserts an element at the front of the deque and returns true.
        deque.offerFirst(10);
        deque.offerFirst(20);
        System.out.println(deque); // Output: [20, 10, 20, 10, 30, 40]

        // Method - offerLast(E e) || Inserts an element at the end of the deque and returns true.
        deque.offerLast(65);
        deque.offerLast(86);
        System.out.println(deque); // Output: [20, 10, 20, 10, 30, 40, 65, 86]

// *************************************** Remove Elements ****************************************
        // Method - removeFirst() || Removes and returns the first element.
        deque.removeFirst(); // Output: 20
        System.out.println(deque); // [10, 20, 10, 30, 40, 65, 86]

        // Method - removeLast() || Removes and returns the last element.
        deque.removeLast(); // Output: 86
        System.out.println(deque); // Output: [10, 20, 10, 30, 40, 65]

        // Method - pollFirst() || Removes and returns the first element, or null if the deque is empty.
        System.out.println(deque.pollFirst()); // Output: 10

        // Method - pollLast() || Removes and returns the last element, or null if the deque is empty.
        System.out.println(deque.pollLast()); // Output: 65

// *************************************** Access Elements ****************************************
        // Method - getFirst() || Retrieves the first element without removing it. Throws NoSuchElementException if empty.
        System.out.println(deque.getFirst()); // Output: 20

        // Method - getLast() || Retrieves the last element without removing it. Throws NoSuchElementException if empty.
        System.out.println(deque.getLast()); // Output: 40

        // Method - peekFirst() || Retrieves the first element without removing it, or null if the deque is empty.
        System.out.println(deque.peekFirst()); // Output: 20

        // Method - peekLast() || Retrieves the last element without removing it, or null if the deque is empty.
        System.out.println(deque.peekLast()); // Output: 40

        // *************************************** Other Methods ****************************************
        // Method - isEmpty() || Checks if the deque is empty.
        System.out.println(deque.isEmpty());

        // Method - size() || Returns the number of elements in the deque.
        System.out.println(deque.size());

        // Method - contains(Object o) || Checks if the deque contains the specified element.
        System.out.println(deque.contains(48)); // Output: false
        System.out.println(deque.contains(30)); // Output: true

        // Method - clear() || Removes all elements from the deque.
        deque.clear();
        System.out.println(deque);

    }
}
