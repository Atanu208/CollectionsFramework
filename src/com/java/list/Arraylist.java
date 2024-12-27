package com.java.list;
import java.util.ArrayList;
        //(1) for add/get
        //O(n) for remove
public class Arraylist {
    public static void main(String[] args) {
        // Method - add(E e) || Adds an element to the end of the list
        ArrayList<String> list=new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        System.out.println(list); // Output: [Apple, Banana]

        // Method - add(int index, E element) || Adds an element at a specified index.
        list.add(1,"Mango");
        System.out.println(list);  // Output: [Apple, Mango, Banana]

        // Method - get(int index) || Returns the element at the specified index.
        System.out.println(list.get(1)); // Output: Mango

        // Method - set(int index, E element) || Replaces the element at the specified index.
        list.set(1,"Orange");
        System.out.println(list); // Output: [Apple, Orange, Banana]

        // Method - remove(int index) || Removes the element at the specified index.
        list.remove(2);
        System.out.println(list); // Output: [Apple, Orange]

        // Method - remove(Object o) || Removes the first occurrence of the specified element.
        list.remove("Apple");
        System.out.println(list);  // Output: [Orange]

        // Method - size() || Returns the number of elements in the list.
        System.out.println(list.size()); // Output: 1

        // Method - contains(Object o) || Checks if the list contains a specific element.
        System.out.println(list.contains("Orange")); // Output: true

        // Method - indexOf(Object o) || Returns the index of the first occurrence of the element, or -1 if not found.
        System.out.println(list.indexOf("Orange"));

        // Method - isEmpty() || Checks if the list is empty.
        System.out.println(list.isEmpty());  // Output: false

        // Method - clear() || Removes all elements from the list.
        list.clear();
        System.out.println(list);  // Output: []

        // Method - addAll(Collection<? extends E> c) || Adds all elements of another collection.
        ArrayList<String> anotherList=new ArrayList<>();
        anotherList.add("Graphs");
        anotherList.add("PineApple");
        list.addAll(anotherList);
        System.out.println(list); // Output: [Grapes, Pineapple]

        // Method - subList(int fromIndex, int toIndex) || Returns a portion of the list between fromIndex (inclusive) and toIndex (exclusive).
        System.out.println(list.subList(0,1)); // Output: [Grapes]

        // Method - toArray() || Converts the list to an array.
        Object[] array=list.toArray();
        for (Object item:array) {
            System.out.println(item);  // Output: Grapes
        }                              //         Pineapple

        // Method - forEach(Consumer<? super E> action) || Performs the given action for each element in the list.
        list.forEach(System.out::println);  // Output: Grapes
    }                                       //         Pineapple
}
