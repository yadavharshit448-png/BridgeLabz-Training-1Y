package com.gla.collections;

import java.util.PriorityQueue;

public class HospitalTriage {
    static class Patient implements Comparable<Patient> {
        String name;
        int severity;

        Patient(String n, int s) {
            this.name = n;
            this.severity = s;
        }

        @Override
        public int compareTo(Patient other) {
            return Integer.compare(other.severity, this.severity); // Higher severity first
        }
        
        public String toString() { return name + "(" + severity + ")"; }
    }

    public static void main(String[] args) {
        PriorityQueue<Patient> pq = new PriorityQueue<>();
        pq.add(new Patient("John", 3));
        pq.add(new Patient("Alice", 5));
        pq.add(new Patient("Bob", 2));

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
