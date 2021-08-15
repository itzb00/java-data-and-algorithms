package org.example;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<String,String> names = new TreeMap<>();
        names.put("zorro","some guy wearing a cape");
        names.put("superman","guy from krypton, son of kar-el");
        names.put("batman","is joker his brother?");
        names.put("hulk","very nice guy");
        names.put("wonderwoman","she has an invisible plane");
        System.out.println(names);
        Set<Integer> nums = new TreeSet<>();
        nums.add(100);
        nums.add(50);
        nums.add(123);
        nums.add(5);
        nums.add(25);
        System.out.println(nums);
    }
}
