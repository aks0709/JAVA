package com.Ayush.Collection.SetInterface;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Hashset {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("One");
        Iterator<String> i=set.iterator();
        while(i.hasNext())
        {
            System.out.print(i.next()+" ");
        }
        System.out.println();
        LinkedHashSet<Integer> s=new LinkedHashSet<>();
        s.add(23);
        s.add(26);
        s.add(22);
        s.add(24);
        s.add(23);
        System.out.println(s);
    }
}
