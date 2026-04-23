package com.gla.stream_api;

import java.util.List;

public class ExpiringMemberships {
    static class Member {
        String name;
        int daysToExpiry;
        Member(String n, int exp) { name = n; daysToExpiry = exp; }
        public String toString() { return name + " (Expires in " + daysToExpiry + " days)"; }
    }

    public static void main(String[] args) {
        List<Member> members = List.of(
            new Member("Alice", 10),
            new Member("Bob", 45),
            new Member("Charlie", 25),
            new Member("Dave", 5)
        );

        System.out.println("Memberships expiring within 30 days:");
        members.stream()
               .filter(m -> m.daysToExpiry <= 30)
               .forEach(System.out::println);
    }
}
