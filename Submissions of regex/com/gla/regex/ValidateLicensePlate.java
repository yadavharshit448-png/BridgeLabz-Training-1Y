package com.gla.regex;

import java.util.regex.Pattern;

public class ValidateLicensePlate {
    public static void main(String[] args) {
        String regex = "^[A-Z]{2}\\d{4}$";
        System.out.println("AB1234: " + Pattern.matches(regex, "AB1234"));
        System.out.println("A12345: " + Pattern.matches(regex, "A12345"));
    }
}
