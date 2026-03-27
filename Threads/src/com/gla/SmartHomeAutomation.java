package com.gla;

class SmartDevice implements Runnable {
    private String deviceName;
    private int intervalSeconds;

    public SmartDevice(String name, int seconds) {
        this.deviceName = name;
        this.intervalSeconds = seconds;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("[" + new java.util.Date() + "] " + deviceName + " is running cycle " + i + " (Priority: " + Thread.currentThread().getPriority() + ")");
            try {
                Thread.sleep(intervalSeconds * 1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(deviceName + " has completed its cycles.");
    }
}

public class SmartHomeAutomation {
    public static void main(String[] args) {
        Thread tempSensor = new Thread(new SmartDevice("Temperature Sensor", 5));
        Thread securityCamera = new Thread(new SmartDevice("Security Camera", 3));
        Thread lightController = new Thread(new SmartDevice("Light Controller", 4));
        Thread doorLock = new Thread(new SmartDevice("Door Lock Monitor", 6));

        securityCamera.setPriority(10);
        tempSensor.setPriority(7);
        lightController.setPriority(5);
        doorLock.setPriority(5);

        securityCamera.start();
        tempSensor.start();
        lightController.start();
        doorLock.start();
    }
}
