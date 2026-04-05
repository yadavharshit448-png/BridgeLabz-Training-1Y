package com.gla.wrapperclasses;

import java.util.ArrayList;
import java.util.List;

/**
 * Scenario 5. Sensor Data Logger
 * Accepts primitive and wrapper inputs, showing auto-boxing and auto-unboxing.
 */
public class S5_SensorDataLogger {
    private List<Double> storage = new ArrayList<>();

    // Accepts primitive double (is auto-boxed to Double when placed in storage)
    public void logData(double primitiveData) {
        storage.add(primitiveData); // auto-boxing: double to Double
    }

    // Accepts Double wrapper object
    public void logData(Double wrapperData) {
        if (wrapperData != null) {
            storage.add(wrapperData);
        }
    }
    
    // Returns primitive double (auto-unboxed from storage)
    public double getLatestReading() {
        if (!storage.isEmpty()) {
            return storage.get(storage.size() - 1); // auto-unboxing: Double to double
        }
        return 0.0;
    }

    public static void main(String[] args) {
        S5_SensorDataLogger logger = new S5_SensorDataLogger();
        logger.logData(25.5); // method accepts primitive
        logger.logData(Double.valueOf(26.2)); // method accepts wrapper object
        
        System.out.println("Storage contents: " + logger.storage);
        System.out.println("Latest reading: " + logger.getLatestReading());
    }
}
