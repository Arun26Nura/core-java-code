package com.besant.streams;

import java.util.ArrayList;
import java.util.List;

public class StudentDatabase {

  public static List<Students> getStudentDetails(){
      List<Students> students= new ArrayList<>();
      students.add(new Students(1,"Revathi", "Female", List.of("Java", "SQL")));
      students.add(new Students(2,"Abirami", "Female", List.of("Java", "Spring")));
     // students.add(new Students(3,"Siva Vignesh", "Male", List.of("JavaScript", "SQL")));
      return students;

  }
}
