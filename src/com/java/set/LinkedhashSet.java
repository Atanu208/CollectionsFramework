package com.java.set;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedhashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet =new LinkedHashSet<>();

        // Method - add(E e) || Adds the specified element to the set if it is not already present.
        linkedHashSet.add(10);
        linkedHashSet.add(20);
        linkedHashSet.add(10); // Duplicate, won't be added
        System.out.println(linkedHashSet); // Output: [10, 20]

        // Method - addAll(Collection<? extends E> c) ||  Adds all the elements in the specified collection to the set.
        LinkedHashSet<Integer> linkedHashSet1=new LinkedHashSet<>(Arrays.asList(1,2,3));
        linkedHashSet.addAll(linkedHashSet1);
        System.out.println(linkedHashSet); // Output: [10, 20, 1, 2, 3]

        // Method - contains(Object o) || Checks if the set contains the specified element.
        System.out.println(linkedHashSet.contains(9));  // Output: false
        System.out.println(linkedHashSet.contains(10));  // Output: true

        // Method - remove(Object o) || Removes the specified element from the set if it is present.
        linkedHashSet.remove(10);
        System.out.println(linkedHashSet); // Output: [20, 1, 2, 3]

        // Method - isEmpty() || Checks if the set is empty.
        System.out.println(linkedHashSet.isEmpty()); // Output : false

        // Method - size() || Returns the number of elements in the set.
        System.out.println(linkedHashSet.size()); // Output: 4

        // Method -  clear() || Removes all elements from the set.
        linkedHashSet1.clear();
        System.out.println(linkedHashSet1); // Output: []

        // Method -  iterator() || Returns an iterator over the elements in the set.
        Iterator<Integer> iterator=linkedHashSet.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next()); // Output: 20
        }                                        //         1
                                                 //         2
                                                 //         3
        // Method -  retainAll(Collection<?> c) || Retains only the elements in this set that are contained in the specified collection.
        LinkedHashSet<Integer> linkedHashSet2=new LinkedHashSet<>(Arrays.asList(1,5,3,9));
        linkedHashSet.retainAll(linkedHashSet2);
        System.out.println(linkedHashSet); // Output: [1, 3]

        // Method - toArray() || Converts the set to an array.
        Object[] objects=linkedHashSet.toArray();
        for (Object i: objects) {
            System.out.println(i); // Output: [1, 3]
        }
        // Method - equals(Object o) || Compares the specified object with this set for equality.
        LinkedHashSet<Integer> linkedHashSet3=new LinkedHashSet<>(Arrays.asList(1,7,8));
        LinkedHashSet<Integer> linkedHashSet4=new LinkedHashSet<>(Arrays.asList(1,7,8));
        System.out.println(linkedHashSet3.equals(linkedHashSet4)); // Output: true

        // Method - removeAll(Collection<?> c) || Removes all elements in the set that are contained in the specified collection.
        LinkedHashSet<Integer> linkedHashSet5 = new LinkedHashSet<>(Arrays.asList(1, 2, 3, 4));
        LinkedHashSet<Integer> linkedHashSet6 = new LinkedHashSet<>(Arrays.asList(3, 4));
        linkedHashSet5.retainAll(linkedHashSet6);
        System.out.println(linkedHashSet5);

    }
}
