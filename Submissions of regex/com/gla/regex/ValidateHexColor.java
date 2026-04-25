package com.gla.regex;

import java.util.regex.Pattern;

public class ValidateHexColor {
    public static void main(String[] args) {
        String regex = "^#([A-Fa-f0-9]{6})$";
        System.out.println("#FFA500: " + Pattern.matches(regex, "#FFA500"));
        System.out.println("#ff4500: " + Pattern.matches(regex, "#ff4500"));
        System.out.println("#123: " + Pattern.matches(regex, "#123"));
    }
}
