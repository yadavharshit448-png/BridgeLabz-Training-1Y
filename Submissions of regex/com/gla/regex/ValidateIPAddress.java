package com.gla.regex;

import java.util.regex.Pattern;

public class ValidateIPAddress {
    public static void main(String[] args) {
        String regex = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
        System.out.println("192.168.1.1: " + Pattern.matches(regex, "192.168.1.1"));
        System.out.println("256.100.50.25: " + Pattern.matches(regex, "256.100.50.25"));
    }
}
