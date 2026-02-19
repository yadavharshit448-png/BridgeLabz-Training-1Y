package com.school.util;

import com.school.data.Student;

public class Analyzer {
    public double calculateAverage(Student s) {
        int[] marks = s.getMarks();
        int sum = 0;
        for (int m : marks) {
            sum += m;
        }
        return (double) sum / marks.length;
    }

    public String findGrade(double average) {
        if (average >= 90) return "A";
        if (average >= 80) return "B";
        if (average >= 70) return "C";
        if (average >= 60) return "D";
        return "F";
    }
}
