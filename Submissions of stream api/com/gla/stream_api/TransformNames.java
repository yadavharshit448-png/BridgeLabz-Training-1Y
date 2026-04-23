package com.gla.stream_api;

import java.util.List;

public class TransformNames {
    public static void main(String[] args) {
        List<String> names = List.of("charlie", "alice", "bob", "eve", "dave");

        System.out.println("Names alphabetized and in uppercase:");
        names.stream()
             .map(String::toUpperCase)
             .sorted()
             .forEach(System.out::println);
    }
}
