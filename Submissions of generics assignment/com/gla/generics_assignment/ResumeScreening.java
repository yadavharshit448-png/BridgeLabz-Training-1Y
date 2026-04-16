package com.gla.generics_assignment;

import java.util.ArrayList;
import java.util.List;

public class ResumeScreening {
    static abstract class JobRole {}
    static class SoftwareEngineer extends JobRole { public String toString() { return "Software Engineer"; } }

    static class Resume<T extends JobRole> {
        T role;
        Resume(T role) { this.role = role; }
        public String toString() { return "Resume for " + role.toString(); }
    }

    public static void screenResumes(List<? extends Resume<?>> resumes) {
        for (Resume<?> res : resumes) {
            System.out.println("Screening " + res);
        }
    }

    public static void main(String[] args) {
        List<Resume<SoftwareEngineer>> list = new ArrayList<>();
        list.add(new Resume<>(new SoftwareEngineer()));
        screenResumes(list);
    }
}
