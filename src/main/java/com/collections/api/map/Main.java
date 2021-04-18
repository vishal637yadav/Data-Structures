package com.collections.api.map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main Method !");
        Map<String, Integer> map = new HashMap<>();
        map.put("Give",2);
        map.put("Java",4);
        System.out.println(map.get("Python"));
        System.out.println(map.get("Java"));
        printMap(map);

    }

    public static void printMap(Map<String, Integer> map){

        System.out.println("printMap -Iterating Hashmap...");
        for(Map.Entry<String,Integer> m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }
}
