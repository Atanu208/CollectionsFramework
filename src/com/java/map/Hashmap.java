package com.java.map;

import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> map =new HashMap<>();

        // Method - put(K key, V value) || Inserts a key-value pair into the map. If the key already exists, its value is updated.
        map.put("Alice",1);
        map.put("Bob",2);
        map.put("Alice",3); // Updates Alice's value
        System.out.println(map); // output : {Alice=3, Bob=2}

        // Method - get(Object key) || Returns the value associated with the specified key, or null if the key does not exist.
        System.out.println(map.get("Alice")); // output : 3

        // Method - containsKey(Object key) || Checks if a particular key exists in the map.
        System.out.println(map.containsKey("Alice")); // output : true
        System.out.println(map.containsKey("Atanu")); // output : false

        // Method - containsValue(Object value) || Checks if a particular value exists in the map.
        System.out.println(map.containsValue(3)); // output : true
        System.out.println(map.containsValue(7)); // output : false

        // Method - remove(Object key) || Removes the key-value pair associated with the specified key.
        map.remove("Alice");
        System.out.println(map); // output : {Bob=2}

        // Method - keySet() || Returns a Set view of all keys in the map.
        map.put("Neo",3);
        map.put("Sam",8);
        System.out.println(map.keySet()); // output : [Bob, Neo, Sam]

        // Method - values() || Returns a Collection view of all values in the map.
        System.out.println(map.values());

        // Method - entrySet() || Returns a Set view of all key-value pairs (entries) in the map.
        System.out.println(map.entrySet()); // [Bob=2, Neo=3, Sam=8]

        // Method - size() || Returns the number of key-value pairs in the map.
        System.out.println(map.size()); // 3

        // Method - isEmpty() || Checks if the map is empty.
        System.out.println(map.isEmpty()); // output : false

        // Method - clear() || Removes all key-value pairs from the map.
        map.clear();
        System.out.println(map);
    }
}
