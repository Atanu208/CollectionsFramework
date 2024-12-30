package com.java.map;

import java.util.TreeMap;

public class Treemap {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm=new TreeMap<>();

        // Method - put(key, value) || inserts a key-value pair into the map or updates the value if the key exists.
        tm.put(1,"A");
        tm.put(2,"B");
        tm.put(3,"C");
        System.out.println(tm); // output : {1=A, 2=B, 3=C}

        // Method - get(key) || Returns the value associated with the key, or null if the key doesn't exist.
        System.out.println(tm.get(1)); // output : A
        System.out.println(tm.get(6)); // output : null

        // Method - remove(key) || Removes the key-value pair for the specified key.
        tm.remove(1);
        System.out.println(tm); // output : {2=B, 3=C}

        // Method - containsKey(key) || Checks if the map contains the specified key.
        System.out.println(tm.containsKey(2)); // Output: true

        // Method - containsValue(value) || Checks if the map contains the specified value.
        System.out.println(tm.containsValue("B")); // Output: true

        // Method - size() || Returns the number of key-value pairs in the map.
        System.out.println(tm.size()); // Output: 2

        // Method - isEmpty() || Checks if the map is empty.
        System.out.println(tm.isEmpty()); // Output: false

        // Method - firstKey() || Returns the smallest key in the map.
        tm.put(4,"D");
        tm.put(5,"E");
        tm.put(6,"F");
        System.out.println(tm.firstKey()); // Output: 2

        // Method -  lastKey() || Returns the largest key in the map.
        System.out.println(tm.lastKey()); // Output: 6

        // Method -  floorKey(key) || Returns the largest key ≤ given key, or null if none.p.
        System.out.println(tm.floorKey(11)); // Output: 6

        // Method -  ceilingKey(key) || Returns the smallest key ≥ given key, or null if none.
        System.out.println(tm.ceilingKey(1)); // Output: 2

        // Method - higherKey(key) || Returns the smallest key > given key, or null if none.
        System.out.println(tm.higherKey(2)); // Output: 3

        // Method - lowerKey(key) || Returns the largest key < given key, or null if none.
        System.out.println(tm.lowerKey(5)); // Output: 4

        System.out.println(tm); // output : {2=B, 3=C, 4=D, 5=E, 6=F}

        // Method - keySet() || Returns a Set of all keys in sorted order.
        System.out.println(tm.keySet()); // output : [2, 3, 4, 5, 6]

        // Method - values() || Returns a Collection of all values in order of keys
        System.out.println(tm.values()); // output : [B, C, D, E, F]

        // Method -  entrySet() || Returns a Set of all key-value pairs as Map.Entry objects.
        for(var entry : tm.entrySet())
        {
            System.out.println(entry.getKey()+" = "+entry.getValue());  //output: 2 = B
        }                                                               //        3 = C
                                                                        //        4 = D
                                                                        //        5 = E
                                                                        //        6 = F
        // Method - subMap(fromKey, toKey) || Returns a view of the map for keys in the range [fromKey, toKey).
        System.out.println(tm.subMap(2,4)); //output : {2=B, 3=C}

        // Method - headMap(toKey) || Returns a view of the map for keys < toKey.
        System.out.println(tm.headMap(6)); //output : {{2=B, 3=C, 4=D, 5=E}

        // Method - tailMap(fromKey) || Returns a view of the map for keys ≥ fromKey.
        System.out.println(tm.tailMap(5)); //output : {5=E, 6=F}

    }
}
