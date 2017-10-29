package com.maghi711.javase8.lambda;

import java.util.*;

public class ThirdLambdaUsingComparator {

    public static void main(String[] args) {
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o2.length(), o1.length());
            }
        };

        List<String> list = Arrays.asList("***", "**", "****", "*****", "*");
        Collections.sort(list, comparator);
        for (String s: list) {
            System.out.println("s = " + s);
        }

        Comparator<String> lambdaComparator =
                null;
        try {
            lambdaComparator = (String o1, String o2) -> Integer.compare(o1.length(), o2.length());
        } catch (Exception e) {
            e.printStackTrace();
        }
        Collections.sort(list, lambdaComparator);
        for (String s: list) {
            System.out.println("s = " + s);
        }
    }
}
