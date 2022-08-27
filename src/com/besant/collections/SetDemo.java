package com.besant.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> hashSet= new HashSet<>();  // HastTable
        // Insertion Order not preserved.
        // Null allowed but only once
        // Duplicates not allowed.
        hashSet.add(1);
        hashSet.add(4);
        hashSet.add(2);
        System.out.println(hashSet);




        Set<Integer> linkedHashSet= new LinkedHashSet<>();  // LinkedList + Hashtable
        // Insertion Order preserved.
        // Null allowed but only once
        // Duplicates not allowed.
        linkedHashSet.add(1);
        linkedHashSet.add(4);
        linkedHashSet.add(2);
        System.out.println(linkedHashSet);


        Set<String> treeSet= new TreeSet<>();
        // Sorted based on the ASCII values.
        // Null not allowed
        // Duplicated not allowed.
        treeSet.add("hi");
        treeSet.add("Hi");
        treeSet.add("Add");
        treeSet.add("add");
        System.out.println(treeSet);








    }
}
