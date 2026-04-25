package com.gla.regex;

import java.util.regex.Pattern;

public class ValidateSSN {
    public static void main(String[] args) {
        String regex = "^\\d{3}-\\d{2}-\\d{4}$";
        System.out.println("123-45-6789: " + Pattern.matches(regex, "123-45-6789"));
        System.out.println("123456789: " + Pattern.matches(regex, "123456789"));
    }
}
