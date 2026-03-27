package com.gla;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

class SupportTicket extends Thread {
    private String ticketId;
    private String ticketType;

    public SupportTicket(String id, String type, int priority) {
        this.ticketId = id;
        this.ticketType = type;
        this.setPriority(priority);
    }

    public String getTicketType() { return ticketType; }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName() + " started processing " + ticketId + " [" + ticketType + "] (Priority: " + getPriority() + ")");
        
        Random rand = new Random();
        int sleepTime = rand.nextInt(5) + 1; // 1 to 5 seconds
        
        try {
            Thread.sleep(sleepTime * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        long endTime = System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName() + " completed " + ticketId + " [" + ticketType + "] in " + (endTime - startTime) + "ms.");
    }
}

public class CustomerSupportSystem {
    public static void main(String[] args) {
        List<SupportTicket> queue = new ArrayList<>();
        
        // Critical Bug(10), Feature Request(4), General Query(2), Feedback(1)
        queue.add(new SupportTicket("TKT001", "Critical Bug", 10));
        queue.add(new SupportTicket("TKT002", "Feature Request", 4));
        queue.add(new SupportTicket("TKT003", "General Query", 2));
        queue.add(new SupportTicket("TKT004", "Feedback", 1));
        queue.add(new SupportTicket("TKT005", "Critical Bug", 10));
        queue.add(new SupportTicket("TKT006", "Feature Request", 4));
        queue.add(new SupportTicket("TKT007", "General Query", 2));
        queue.add(new SupportTicket("TKT008", "Critical Bug", 10));
        queue.add(new SupportTicket("TKT009", "Feedback", 1));
        queue.add(new SupportTicket("TKT010", "Feature Request", 4));

        // Start all tickets
        for (SupportTicket t : queue) {
            t.setName("Agent-" + t.getName().split("-")[1]); // Cleaner thread name
            t.start();
        }
    }
}
