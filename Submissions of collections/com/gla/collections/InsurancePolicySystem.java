package com.gla.collections;

import java.util.*;

public class InsurancePolicySystem {
    static class Policy implements Comparable<Policy> {
        String id, name, type;
        int expDays;
        
        Policy(String id, String n, int exp, String t) {
            this.id = id; name = n; expDays = exp; type = t;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Policy)) return false;
            Policy policy = (Policy) o;
            return id.equals(policy.id);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }

        @Override
        public int compareTo(Policy o) {
            return Integer.compare(this.expDays, o.expDays);
        }
        
        public String toString() {
            return id + "/" + name + "/" + expDays;
        }
    }

    public static void main(String[] args) {
        HashSet<Policy> hashSet = new HashSet<>();
        LinkedHashSet<Policy> linkedSet = new LinkedHashSet<>();
        TreeSet<Policy> treeSet = new TreeSet<>();
        
        Policy p1 = new Policy("P1", "Alice", 10, "Auto");
        Policy p2 = new Policy("P2", "Bob", 40, "Health");
        Policy p3 = new Policy("P3", "Charlie", 5, "Auto");

        List.of(hashSet, linkedSet, treeSet).forEach(s -> {
            s.add(p1); s.add(p2); s.add(p3);
        });

        System.out.println("Expiring soon (<=30):");
        for (Policy p : treeSet) {
            if (p.expDays <= 30) System.out.println(p);
        }
    }
}
