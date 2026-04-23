package com.gla.stream_api;

import java.util.List;

public class IoTSensorReadings {
    public static void main(String[] args) {
        List<Double> readings = List.of(22.5, 30.1, 15.0, 45.6, 28.9);
        double threshold = 30.0;

        System.out.println("Critical Sensor Readings (Above " + threshold + "):");
        readings.stream()
                .filter(r -> r > threshold)
                .forEach(r -> System.out.println("ALERT: " + r));
    }
}
