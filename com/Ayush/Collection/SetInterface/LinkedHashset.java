package com.Ayush.Collection.SetInterface;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashset {
    public static void main(String[] args) {
        Set<Integer> s=new LinkedHashSet<>();
        s.add(13);
        s.add(23);
        s.add(13);
        s.add(4);
        s.add(11);
        s.add(13);
        s.add(32);
        s.add(21);
        System.out.println(s);

    }
}
