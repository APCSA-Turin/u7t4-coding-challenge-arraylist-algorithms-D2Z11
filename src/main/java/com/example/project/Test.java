package com.example.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("hello", "my", "best", "friend", "whats", "up"));
        ArrayList<String> expected = new ArrayList<String>(Arrays.asList("hello", "my", "best", "friend", "whats", "up", "HELLO","MY", "BEST", "FRIEND", "WHATS", "UP"));
        list = Main.duplicateUpperEnd(list);
        System.out.println(list + " expected: " + expected);
    }
}
