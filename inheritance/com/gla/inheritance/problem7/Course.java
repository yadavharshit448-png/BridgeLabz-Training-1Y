package com.gla.inheritance.problem7;

public class Course {
    private String courseName;
    private int duration; // in hours

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " hours");
    }
}
