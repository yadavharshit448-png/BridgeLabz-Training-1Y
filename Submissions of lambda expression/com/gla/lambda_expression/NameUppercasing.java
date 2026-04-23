package com.gla.lambda_expression;

import java.util.List;
import java.util.stream.Collectors;

public class NameUppercasing {
    public static void main(String[] args) {
        List<String> names = List.of("Alice Johnson", "Bob Smith", "Charlie Brown");
        
        System.out.println("Names in Uppercase:");
        names.stream()
             .map(String::toUpperCase)
             .forEach(System.out::println);
    }
}
