package com.java.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> hashSet=new HashSet<>();

        // Method - add(E e) || Adds the specified element to the set if it is not already present.
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(2); // Duplicate, won't be added
        System.out.println(hashSet); // Output: [1, 2]

        // Method - addAll(Collection<? extends E> c || Adds all the elements in the specified collection to the set.
        HashSet<Integer> newSet=new HashSet<>(Arrays.asList(1,2,3));
        hashSet.addAll(newSet);
        System.out.println(hashSet); // Output: [1, 2, 3]

        // Method - contains(Object o) || Checks if the set contains the specified element.
        System.out.println(hashSet.contains(2)); // Output: true
        System.out.println(hashSet.contains(5)); // Output: false

        // Method -  remove(Object o) || Removes the specified element from the set if it is present.
        hashSet.remove(1);
        System.out.println(hashSet); // Output: [2, 3]

        // Method -  isEmpty() || Checks if the set is empty.
        System.out.println(hashSet.isEmpty()); // Output: false

        // Method -   size() || Returns the number of elements in the set.
        System.out.println(hashSet.size());

        // Method -   clear() || Removes all elements from the set.
        hashSet.clear();
        System.out.println(hashSet);  // Output: []

        // Method -   iterator() || Returns an iterator over the elements in the set.
        hashSet.add(9);
        hashSet.add(3);
        hashSet.add(6);
        Iterator<Integer> item=hashSet.iterator();
        while (item.hasNext())
        {
            System.out.println(item.next()); // Output: 3
        }                                    //         6
                                             //         9

        // Method - retainAll(Collection<?> c) || Retains only the elements in this set that are contained in the specified collection.
        HashSet<Integer> set1=new HashSet<>(Arrays.asList(3,6,5,1,2,3));
        hashSet.retainAll(set1);
        System.out.println(hashSet); // Output: [3, 6]

        // Method - toArray()) || Converts the set to an array.
        Object[] array=hashSet.toArray();
        for (Object i:hashSet) {
            System.out.println(i); // Output: 3
        }                          //         6

        // Method - equals(Object o) || Compares the specified object with this set for equality.
        HashSet<Integer> set2=new HashSet<>(Arrays.asList(1,2));
        HashSet<Integer> set3=new HashSet<>(Arrays.asList(1,2));
        System.out.println(set2.equals(set3)); // Output: true

        // Method - removeAll(Collection<?> c) || Removes all elements in the set that are contained in the specified collection.
        HashSet<Integer> set4=new HashSet<>(Arrays.asList(1,2,3,4));
        set4.removeAll(set2);
        System.out.println(set4); // Output: [3, 4]

    }
}
