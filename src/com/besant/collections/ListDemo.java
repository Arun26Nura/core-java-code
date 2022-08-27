package com.besant.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        // List - Null and Duplicates allowed
        List<Integer> arrayList=new LinkedList<>();
        arrayList.add(1);
        arrayList.add(1,4);
        arrayList.add(0,9);
        arrayList.add(null);
        arrayList.remove(0);
        arrayList.addAll(arrayList);
        System.out.println(arrayList);
        System.out.println(arrayList.contains(4));
        System.out.println(arrayList.get(2));
        System.out.println(arrayList.indexOf(1)); // first position
        System.out.println(arrayList.lastIndexOf(1));
        // arrayList.removeAll(arrayList);

        // System.out.println(arrayList);

        // Iterator - while
        Iterator<Integer> iterator= arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // looping - for , while
        for(int i=0; i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }

        // for-each loop
        for(Integer integer:arrayList){
            System.out.println(integer);
        }

        // for-each method



        // Streams



    }
}
