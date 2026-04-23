package com.gla.lambda_expression;

import java.util.List;
import java.util.function.Predicate;

public class NotificationFiltering {
    public static void main(String[] args) {
        List<String> alerts = List.of(
            "INFO: Patient routine check",
            "URGENT: Heart rate abnormal",
            "INFO: Shift change",
            "URGENT: BP dropping"
        );

        Predicate<String> isUrgent = alert -> alert.startsWith("URGENT");

        System.out.println("Showing only urgent alerts:");
        alerts.forEach(alert -> {
            if (isUrgent.test(alert)) {
                System.out.println(alert);
            }
        });
    }
}
