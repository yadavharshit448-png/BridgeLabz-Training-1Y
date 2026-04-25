package com.gla.regex;

import java.util.regex.Pattern;

public class ValidateCreditCard {
    public static void main(String[] args) {
        String visaRegex = "^4\\d{15}$";
        String mcRegex = "^5\\d{15}$";
        
        System.out.println("4123456789012345 (Visa): " + Pattern.matches(visaRegex, "4123456789012345"));
        System.out.println("5123456789012345 (MC): " + Pattern.matches(mcRegex, "5123456789012345"));
        System.out.println("6123456789012345 (Invalid): " + (Pattern.matches(visaRegex, "6123456789012345") || Pattern.matches(mcRegex, "6123456789012345")));
    }
}
