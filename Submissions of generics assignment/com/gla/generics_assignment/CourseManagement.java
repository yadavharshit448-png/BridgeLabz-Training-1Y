package com.gla.generics_assignment;

import java.util.ArrayList;
import java.util.List;

public class CourseManagement {
    static abstract class CourseType {}
    static class ExamCourse extends CourseType { public String toString() { return "Exam Course"; } }
    
    static class Course<T extends CourseType> {
        T type;
        Course(T t) { this.type = t; }
        public String toString() { return "Course: " + type.toString(); }
    }

    public static void displayCourses(List<? extends Course<?>> courses) {
        for(Course<?> c : courses) System.out.println(c);
    }

    public static void main(String[] args) {
        List<Course<ExamCourse>> courses = new ArrayList<>();
        courses.add(new Course<>(new ExamCourse()));
        displayCourses(courses);
    }
}
