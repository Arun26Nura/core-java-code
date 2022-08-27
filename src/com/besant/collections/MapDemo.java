package com.besant.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String>  studentList= new HashMap<>(); // One null is possible keys, Multiple nulls possible in values
        // No duplicates allowed in keys, but duplicates allowed in values.
        studentList.put(1,"Arun");
        studentList.put(5,"Revathi");
        System.out.println( studentList.get(5));
        studentList.remove(1);
        System.out.println(studentList.containsKey(5));
        System.out.println(studentList.containsKey(8));
        System.out.println(studentList.containsValue("Revathi"));
        System.out.println("-----------");
        System.out.println(studentList.getOrDefault(6,"Default"));
        System.out.println(studentList.getOrDefault(5,"Default"));
        studentList.replace(5,"New Name");
        System.out.println(studentList);



    }
}
