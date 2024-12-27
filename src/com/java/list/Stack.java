package com.java.list;

import java.util.Iterator;

public class Stack {
    public static void main(String[] args) {
        java.util.Stack<String> stack=new java.util.Stack<>();

// *************************************** Basic Stack Operations *********************************************

        // Method - push(E item) || Adds an item to the top of the stack.
        stack.add("Apple");
        stack.add("Banana");
        System.out.println(stack); // Output: [Apple, Banana]

        // Method - pop() || Removes and returns the item at the top of the stack. Throws EmptyStackException if the stack is empty.
        System.out.println(stack.pop()); // Output: Banana
        System.out.println(stack); // Output: [Apple]

        // Method - peek() || Returns the item at the top of the stack without removing it. Throws EmptyStackException if the stack is empty.
        System.out.println(stack.peek()); // Output: Apple
        System.out.println(stack); // Output: [Apple]

        // Method - empty() || Checks if the stack is empty.
        System.out.println(stack.isEmpty()); // Output: false

// *************************************** Searching ****************************************

        // Method - search(Object o) || Returns the 1-based position of the element from the top of the stack. Returns -1 if the element is not found.
        stack.push("Banana");
        stack.push("Cherry");
        System.out.println(stack.search("Cherry")); // Output: 2
        System.out.println(stack.search("Banana")); // Output: -1

// *************************************** Iteration ****************************************

        // Method - iterator() || Returns an iterator to traverse the stack.
        for (String i:stack) {
            System.out.println(i); // Output:
                                   // Apple
                                   // Banana
                                   // Cherry
        }

        // Method - forEach(Consumer<? super E> action) || Performs the given action for each element in the stack.
        stack.forEach(System.out::println); // Output:
                                            // Apple
                                            // Banana
                                            // Cherry

// *********** Vector Inherited Methods(Since Stack extends Vector, it inherits all its methods. Here are some commonly used ones) ************************

        // Method - add(E e)|| Performs the given action for each element in the stack.
        stack.add("Mango");
        System.out.println(stack); // Output: [Apple, Banana, Cherry, Mango]

        // Method - remove(int index) || Removes the element at the specified index.
        stack.remove(2);
        System.out.println(stack); // Output: [Apple, Banana, Mango]

        // Method - get(int index) || Returns the element at the specified index.
        System.out.println(stack.get(1)); // Output: Banana

        // Method - size() || Returns the number of elements in the stack
        System.out.println(stack.size());  // Output: 3

        // Method - clear() || Removes all elements from the stack.
        stack.clear();
        System.out.println(stack); // Output: []

// *************************************** Utility Methods ****************************************

        // Method - contains(Object o) || Checks if the stack contains the specified element.
        stack.push("Apple");
        stack.push("Banana");
        System.out.println(stack.contains("Banana"));  // Output: true

        // Method - toArray() || Converts the stack to an array.
        Object[] array=stack.toArray();
        for (Object item:array) {
            System.out.println(item); // Output
        }                             // Apple
                                      // Banana
        // Method - clone() || Creates a shallow copy of the stack.
        java.util.Stack<String> clonedStack=(java.util.Stack<String>) stack.clone();
        System.out.println(clonedStack); // Output: [Apple, Banana]

    }

}
