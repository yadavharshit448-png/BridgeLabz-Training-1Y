package com.gla.stream_api;

import java.util.List;

public class EmailNotifications {
    public static void sendEmailNotification(String email) {
        System.out.println("Sending email to: " + email);
    }

    public static void main(String[] args) {
        List<String> emails = List.of("user1@example.com", "user2@example.com", "admin@example.com");

        System.out.println("Dispatching emails:");
        emails.forEach(email -> sendEmailNotification(email));
    }
}
