package com.java.list.concepts;

import java.util.ArrayList;
import java.util.List;

public class ListofListsofIntegers {
    public static void main(String[] args) {
//        List<List<Integer>> is a Java generic type that represents a list of lists of integers.
        List<List<Integer>> listOfInteger=new ArrayList<>();
        /*
       Outer List (List<List<Integer>>):
            This is the main list that holds multiple inner lists.
            Each element of this list is itself a List<Integer>.

       Inner List (List<Integer>):
            Each inner list is a list of integers.
            It contains individual integers as elements.
        */
        List<Integer> list1=new ArrayList<>();
        list1.add(23);
        list1.add(35);

        List<Integer> list2=new ArrayList<>();
        list2.add(53);
        list2.add(95);

        listOfInteger.add(list1);
        listOfInteger.add(list2);
        System.out.println(listOfInteger); // output : [[23, 35], [53, 95]]

    }
}
