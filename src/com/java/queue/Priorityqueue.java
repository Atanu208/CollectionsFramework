package com.java.queue;

import java.util.*;

public class Priorityqueue {
    public static void main(String[] args) {
// *************************************** Create a PriorityQueue ****************************************

//      By default, it is a min-heap (smallest element at the top).
//      The PriorityQueue does not maintain a sorted order for all elements in its internal storage.
//      Instead, it maintains the heap property, which ensures that the smallest element is always at the root (head).
        PriorityQueue<Integer> pq=new PriorityQueue<>();

//      To create a max-heap,
//      1.You can use the built-in comparator for reversing the natural order, using Comparator.reverseOrder()
        PriorityQueue<Integer> maxHeap1=new PriorityQueue<>(Comparator.reverseOrder());
//      2.Using Lambda Expression, this is the simplest and most common approach.
        PriorityQueue<Integer> maxHeap2=new PriorityQueue<>((a,b)-> b-a);

// *************************************** Add Elements ****************************************

        // Method - add(E e) or offer(E e)  || Adds an element to the queue.
        pq.add(10);
        pq.offer(20);
        pq.add(5);
        System.out.println(pq); // Output: [5, 20, 10]

// *************************************** Remove and Access Elements ****************************************
        // Method - poll() || Retrieves and removes the head (smallest/largest element).
        System.out.println(pq.poll());  // Output: 5

        // Method - peek() || Retrieves the head without removing it.
        System.out.println(pq.peek());  // Output: 10

        // Method - remove(Object o) || Removes a specific element.
        pq.remove(20); // Output: true
        System.out.println(pq); // Output: [10]

// *************************************** Check Size and Emptiness ****************************************

        // Method - size() || Returns the number of elements in the queue.
        System.out.println(pq.size()); // Output: 1

        // Method - isEmpty() || Checks if the queue is empty.
        System.out.println(pq.isEmpty()); // Output: false

// *************************************** Bulk Operations ****************************************

        // Method - addAll(Collection<? extends E> c) || Adds all elements from a collection.
        List<Integer> list= Arrays.asList(34,45,30);
        pq.addAll(list);
        System.out.println(pq); // PriorityQueue: [10, 30, 45, 34]

// ***************************************  Iterating Through the PriorityQueue ****************************************

       // Iteration doesn't guarantee the order.
        for (int num:pq) {
            System.out.println(num);
        }

// ***************************************  Iterating Through the PriorityQueue ****************************************
       // Create a PriorityQueue with a custom order.
        PriorityQueue<String> pq2=new PriorityQueue<>((a,b)-> b.length() -a.length());
        pq2.add("Apple");
        pq2.add("Banana");
        pq2.add("Kiwi");
        System.out.println(pq2); // Output: [Banana, Apple, Kiwi]
    }
}
