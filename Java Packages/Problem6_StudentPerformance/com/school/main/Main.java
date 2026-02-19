package com.school.main;

import com.school.data.*;
import com.school.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Problem 6b: Student Performance Analyzer");

        int[] marks = {85, 92, 78};
        Student student = new Student("Eve", marks);

        Analyzer analyzer = new Analyzer();
        double avg = analyzer.calculateAverage(student);
        String grade = analyzer.findGrade(avg);

        System.out.println(student.toString());
        System.out.println("\nAverage: " + avg);
        System.out.println("Grade: " + grade);
    }
}
