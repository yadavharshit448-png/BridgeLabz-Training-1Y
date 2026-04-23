package com.gla.stream_api;

import java.util.List;
import java.util.Comparator;

public class DoctorAvailability {
    static class Doctor {
        String name;
        String specialty;
        boolean availableOnWeekends;

        Doctor(String n, String s, boolean a) {
            name = n; specialty = s; availableOnWeekends = a;
        }
        public String toString() { return name + " - " + specialty; }
    }

    public static void main(String[] args) {
        List<Doctor> doctors = List.of(
            new Doctor("Dr. Smith", "Cardiology", true),
            new Doctor("Dr. Adams", "Neurology", false),
            new Doctor("Dr. Jane", "Pediatrics", true),
            new Doctor("Dr. House", "Cardiology", true)
        );

        System.out.println("Doctors available on weekends sorted by specialty:");
        doctors.stream()
               .filter(d -> d.availableOnWeekends)
               .sorted(Comparator.comparing(d -> d.specialty))
               .forEach(System.out::println);
    }
}
