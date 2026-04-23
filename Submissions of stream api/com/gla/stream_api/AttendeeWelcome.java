package com.gla.stream_api;

import java.util.List;

public class AttendeeWelcome {
    public static void main(String[] args) {
        List<String> attendees = List.of("John", "Sarah", "Mike", "Emma");

        System.out.println("Welcome Messages:");
        attendees.forEach(name -> System.out.println("Welcome to the event, " + name + "!"));
    }
}
