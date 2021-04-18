package com.collections.api.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is main!!");
        Set<Integer> set = new HashSet<>();
        System.out.println("set :->"+set);
        set.add(12);
        set.add(3);
        System.out.println("set :->"+set);
        System.out.println("set.contains(3) :->"+set.contains(3));
        System.out.println("set.contains(13) :->"+set.contains(13));

    }
}
