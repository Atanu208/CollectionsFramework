package com.java.set;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet=new TreeSet<>();

 // *************************************** Basic Methods ****************************************

        // Method - add(E e) || Adds the specified element to the set if it is not already present.
        treeSet.add(22);
        treeSet.add(35);
        treeSet.add(46);
        treeSet.add(35); // Duplicate, won't be added
        System.out.println(treeSet); // Output: [22, 35, 46]

        // Method - remove(Object o) || Removes the specified element from the set.
        treeSet.remove(35);
        System.out.println(treeSet); // Output: [22, 46]

        // Method - contains(Object o) || Checks if the set contains the specified element.
        System.out.println(treeSet.contains(22)); // Output: true
        System.out.println(treeSet.contains(47)); // Output: false

        // Method - size() || Returns the number of elements in the set.
        System.out.println(treeSet.size()); // Output: 2

        // Method - isEmpty() || Checks if the set is empty.
        System.out.println(treeSet.isEmpty()); // Output: false

 // *************************************** Navigational Methods ****************************************

        // Method - first() || Returns the first (lowest) element in the set.
        System.out.println(treeSet.first()); // Output: 5

        // Method - last() || Returns the first (lowest) element in the set.
        System.out.println(treeSet.last()); // Output: 46

        // Method - ceiling(E e) || Returns the smallest element greater than or equal to the given element.
        System.out.println(treeSet.ceiling(20)); // Output: 22

        // Method - floor(E e) || Returns the largest element less than or equal to the given element.
        System.out.println(treeSet.floor(50)); // Output: 46

        // Method - higher(E e) || Returns the smallest element strictly greater than the given element.
        System.out.println(treeSet.higher(10)); // Output: 22

        // Method - lower(E e) || Returns the largest element strictly less than the given element.
        System.out.println(treeSet.lower(50)); // Output: 46

// *************************************** Range and Subset Methods ****************************************

        // Method - subSet(E fromElement, E toElement) || Returns a view of the portion of the set within the given range.
        System.out.println(treeSet.subSet(10,30)); // Output: [22]

        // Method - headSet(E toElement) || Returns a view of the portion of the set less than the given element.
        System.out.println(treeSet.headSet(50)); // Output: [22, 46]

        // Method - tailSet(E fromElement) || Returns a view of the portion of the set greater than or equal to the given element.
        System.out.println(treeSet.tailSet(45)); // Output: [46]

// *************************************** Iteration ****************************************

        // Method - iterator() || Returns an iterator over the elements in ascending order.
        Iterator<Integer> iterator=treeSet.iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next()); // Output: 22
                                                //          46

        // Method - descendingIterator() || Returns an iterator over the elements in descending order.
        Iterator<Integer> descendingItr=treeSet.descendingIterator();
        while (descendingItr.hasNext())
        {
            System.out.println(descendingItr.next()); // Output: 46
        }                                             //         22

        // Method - pollFirst() || Retrieves and removes the first (lowest) element.
        System.out.println(treeSet.pollFirst()); // Output: 22

        // Method - pollLast() || Retrieves and removes the last (highest) element.
        System.out.println(treeSet.pollLast()); // Output: 46

        // Method - clear()|| Removes all elements from the set.
        treeSet.clear();
        System.out.println(treeSet); // Output: []

    }
}
