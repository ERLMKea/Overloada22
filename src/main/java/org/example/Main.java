package org.example;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void out(String s) {
        System.out.println(s);
    }

    private static void out(int i) {
        System.out.println(i);
    }

    private static void out(Integer i) {
        System.out.printf("Integer");
        System.out.println(i);
    }

    public static void main(String[] args) {

        System.out.println("Hello world!");
        out("hej");
        out(5);

        var obj = Integer.valueOf(5);
        out(obj);

        Set<Character> chars = new HashSet<>();

        for (int i = -1; i < chars.size(); i++) {
            chars.add((char) i);
        }

        out(chars.size());
    }



}