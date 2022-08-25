package com.besant.streams;

import java.util.List;

public class Students {
    private int roll;
    private String name;
    private String gender;
    private List<String> course;

    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public List<String> getCourse() {
        return course;
    }

    public Students(int roll, String name, String gender, List<String> course) {
        this.roll = roll;
        this.name = name;
        this.gender = gender;
        this.course = course;
    }

    public Students() {
    }

    @Override
    public String toString() {
        return "Students{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", course=" + course +
                '}';
    }
}
