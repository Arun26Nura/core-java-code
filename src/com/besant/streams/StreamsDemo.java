package com.besant.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {
    public static void main(String[] args) {
        List<Students> studentsList= StudentDatabase.getStudentDetails();

        List<Integer> integers=List.of(1,8,4,5,6);
        integers.stream().sorted().forEach(System.out::println);


        integers.stream().filter(number -> number%2!=0).collect(Collectors.toList());
        // Filter Only the Female Student List
       var femaleStudentList= studentsList.stream() // Stream<Students>
                .filter(students -> students.getGender()
                        .equalsIgnoreCase("Female"))
                .collect(Collectors.toSet());

        // Filter only the male students
        var maleStudentList= studentsList.stream() // Stream<Students>
                .filter(students -> students.getGender()
                        .equalsIgnoreCase("Male")) // Stream<Students>
                .collect(Collectors.toList());

        // Sort the students based on the name descending
        studentsList.stream().sorted(Comparator.comparing(Students::getName).reversed())
                .forEach(System.out::println);

        //All Match
        var allMatch= studentsList.stream()
                .allMatch(students -> students.getGender()
                        .equalsIgnoreCase("Female"));
        System.out.println("ALL "+ allMatch);

        // Any Match
        var anyMatch= studentsList.stream()
                .anyMatch(students -> students.getGender()
                        .equalsIgnoreCase("Male"));
        System.out.println("ANY "+ anyMatch);
        // No Match
        var noneMatch= studentsList.stream()
                .noneMatch(students -> students.getGender()
                        .equalsIgnoreCase("Male"));
        System.out.println("NONE "+ noneMatch);

        // Map method
        studentsList.stream()
                .filter(students -> students.getGender()
                        .equalsIgnoreCase("Female"))
                .sorted(Comparator.comparing(Students::getName))
                .map(students -> students.getCourse())
                .forEach(System.out::println);





    }
}
