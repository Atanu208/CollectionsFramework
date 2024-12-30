package com.java.map;

import java.util.LinkedHashMap;


public class LinkedhashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> linkedHashMap=new LinkedHashMap<>();

        // Method - put(K key, V value) || Adds a key-value pair to the map. If the key already exists, its value is updated.
        linkedHashMap.put(1,"Apple");
        linkedHashMap.put(2,"Banana");
        linkedHashMap.put(3,"Cherry");
        System.out.println(linkedHashMap); // output : {1=Apple, 2=Banana, 3=Cherry}

        // Method - get(Object key) || Retrieves the value associated with the given key. Returns null if the key is not found.
        System.out.println(linkedHashMap.get(2)); // output : Banana

        // Method - remove(Object key) || Removes the entry for the specified key.
        linkedHashMap.remove(3);
        System.out.println(linkedHashMap); // output : {1=Apple, 2=Banana}

        // Method - containsKey(Object key) || Checks if the map contains the specified key.
        System.out.println(linkedHashMap.containsKey(2)); //output : true
        System.out.println(linkedHashMap.containsKey(6)); //output : false

        // Method - containsValue(Object value) || Checks if the map contains the specified value.
        System.out.println(linkedHashMap.containsValue("Apple")); //output : true
        System.out.println(linkedHashMap.containsValue("Pineapple")); //output : false

        // Method - size() || Returns the number of key-value pairs in the map.
        System.out.println(linkedHashMap.size()); //output : 2

        // Method - isEmpty() || Checks if the map is empty.
        System.out.println(linkedHashMap.isEmpty()); // output : false

        // Method - clear() || Removes all entries from the map.
        linkedHashMap.clear();
        System.out.println(linkedHashMap); // output : {}

        linkedHashMap.put(5,"Mango");
        linkedHashMap.put(6,"Kiwi");
        linkedHashMap.put(2,"Cherry");
        linkedHashMap.put(3,"Lychee");

        // Method - keySet() || Returns a Set view of the keys.
        System.out.println(linkedHashMap.keySet()); // output : [5, 6, 2, 3]

        // Method - values() || Returns a Collection view of the values.
        System.out.println(linkedHashMap.values()); // output : [Mango, Kiwi, Cherry, Lychee]

        // Method - entrySet() || Returns a Set view of the key-value mappings.
        System.out.println(linkedHashMap.entrySet()); // output : [5=Mango, 6=Kiwi, 2=Cherry, 3=Lychee]

        // Method - replace(K key, V value) || Replaces the value for the specified key if it exists.
        linkedHashMap.replace(5,"Avocado");
        System.out.println(linkedHashMap); // output : {5=Avocado, 6=Kiwi, 2=Cherry, 3=Lychee}

        // Method - replace(K key, V oldValue, V newValue) || Replaces the value only if the old value matches.
        linkedHashMap.replace(6,"Kiwi","Blueberry");
        System.out.println(linkedHashMap); // output : {5=Avocado, 6=Blueberry, 2=Cherry, 3=Lychee}

        // Method - forEach(BiConsumer<K, V> action) || Performs the given action for each entry.
        linkedHashMap.forEach((key,value)->System.out.println(key + ": "+value));
        // output : 5: Avocado
        //          6: Blueberry
        //          2: Cherry
        //          3: Lychee

        // Method - putIfAbsent(K key, V value) || Adds the key-value pair if the key is not already present.
        linkedHashMap.putIfAbsent(1,"Banana");
        System.out.println(linkedHashMap); // output : {5=Avocado, 6=Blueberry, 2=Cherry, 3=Lychee, 1=Banana}
    }
}
