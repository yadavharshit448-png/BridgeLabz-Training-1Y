package com.gla.regex;

public class ReplaceMultipleSpaces {
    public static void main(String[] args) {
        String text = "This  is    an   example   with  multiple   spaces.";
        String replaced = text.replaceAll("\\s+", " ");
        System.out.println(replaced);
    }
}
