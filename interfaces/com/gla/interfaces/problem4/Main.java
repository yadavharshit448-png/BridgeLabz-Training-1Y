package com.gla.interfaces.problem4;

import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // 1. Temperature Alert System (Predicate)
        Predicate<Double> isCriticalTemperature = temp -> temp > 80.0;
        double currentTemp = 85.5;
        if (isCriticalTemperature.test(currentTemp)) {
            System.out.println("ALERT: Temperature is critical! (" + currentTemp + ")");
        } else {
            System.out.println("Temperature is normal.");
        }

        // 2. String Length Checker (Function)
        Function<String, Integer> stringLength = str -> str == null ? 0 : str.length();
        String message = "Hello World";
        System.out.println("Length of '" + message + "': " + stringLength.apply(message));

        // 3. Background Job Execution (Runnable)
        Runnable task = () -> {
            System.out.println("Executing background task...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Task completed.");
        };
        new Thread(task).start();
    }
}
