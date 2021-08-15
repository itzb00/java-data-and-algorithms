package org.example;

import java.util.*;

public class HashMapReview {
    public static void main(String[] args) {
        Map<String,String> students = new HashMap<>();
        students.put("a","aaron");
        students.put("b","bob");
        students.put("c","cole");
        students.put("d","derek");
        students.put("a","alex");
        System.out.println(students.get("a"));
        System.out.println(students.containsKey("z"));
        System.out.println(students.remove("a"));
        //Set<String> keys = students.keySet();
        for (String key: students.keySet()) {
            System.out.println( key + " " + students.get(key));
        }
        System.out.println(students.size());
    }
}
