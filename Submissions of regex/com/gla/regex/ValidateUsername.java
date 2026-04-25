package com.gla.regex;

import java.util.regex.Pattern;

public class ValidateUsername {
    public static void main(String[] args) {
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,14}$";
        System.out.println("user_123: " + Pattern.matches(regex, "user_123"));
        System.out.println("123user: " + Pattern.matches(regex, "123user"));
        System.out.println("us: " + Pattern.matches(regex, "us"));
    }
}
