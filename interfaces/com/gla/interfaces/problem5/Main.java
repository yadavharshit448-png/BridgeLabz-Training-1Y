package com.gla.interfaces.problem5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// 1. Password Strength Validator
interface SecurityUtils {
    static boolean checkStrength(String password) {
        return password != null && password.length() >= 8;
    }
}

// 2. Unit Conversion Tool
interface UnitConverter {
    static double kmToMiles(double km) {
        return km * 0.621371;
    }
}

// 3. Date Format Utility
interface DateUtils {
    static String formatDate(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }
}

public class Main {
    public static void main(String[] args) {
        // 1. Password Strength
        String pass = "SecurePass123";
        System.out.println("Is '" + pass + "' strong? " + SecurityUtils.checkStrength(pass));

        // 2. Unit Conversion
        double km = 100;
        System.out.println(km + " km is " + UnitConverter.kmToMiles(km) + " miles.");

        // 3. Date Format
        LocalDate today = LocalDate.now();
        System.out.println("Formatted Date: " + DateUtils.formatDate(today));
    }
}
