package com.gla.generics_assignment;

import java.util.ArrayList;
import java.util.List;

public class CopyList {
    public static void copyList(List<? super Number> dest, List<? extends Number> src) {
        dest.addAll(src);
    }

    public static void main(String[] args) {
        List<Number> dest = new ArrayList<>();
        List<Integer> src = List.of(1, 2, 3);
        copyList(dest, src);
        System.out.println("Copied list: " + dest);
    }
}
