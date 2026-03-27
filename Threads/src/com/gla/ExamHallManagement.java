package com.gla;

class ExamActivity implements Runnable {
    private String activityName;
    private int startDelaySeconds;
    private int durationSeconds;

    public ExamActivity(String name, int delay, int duration) {
        this.activityName = name;
        this.startDelaySeconds = delay;
        this.durationSeconds = duration;
    }

    @Override
    public void run() {
        Thread current = Thread.currentThread();
        System.out.println("[State: " + current.getState() + "] " + activityName + " thread started (Priority: " + current.getPriority() + "). Waiting " + startDelaySeconds + "s to begin...");
        
        try {
            Thread.sleep(startDelaySeconds * 1000L);
            System.out.println("-> " + activityName + " is now ACTIVE.");
            Thread.sleep(durationSeconds * 1000L);
            System.out.println("-> " + activityName + " has COMPLETED.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ExamHallManagement {
    public static void main(String[] args) {
        Thread entry = new Thread(new ExamActivity("Student Entry Monitoring", 0, 15));
        Thread qPaper = new Thread(new ExamActivity("Question Paper Distribution", 5, 2));
        Thread attendance = new Thread(new ExamActivity("Attendance Marking", 10, 3));
        Thread collection = new Thread(new ExamActivity("Answer Sheet Collection", 15, 4));

        qPaper.setPriority(10);
        attendance.setPriority(8);
        collection.setPriority(7);
        entry.setPriority(5);

        System.out.println("Entry Thread State Before Start: " + entry.getState());

        entry.start();
        qPaper.start();
        attendance.start();
        collection.start();

        System.out.println("Entry Thread State After Start: " + entry.getState());
    }
}
