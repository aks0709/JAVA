package com.Ayush.Collection.SetInterface;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> t=new TreeSet<>();
        t.add(45);
        t.add(41);
        t.add(44);
        t.add(34);
        t.add(41);
        t.add(35);
        t.add(7);
        //sorted set methods
        System.out.println(t.first());
        System.out.println(t.last());
        System.out.println(t.tailSet(41));
        System.out.println(t.headSet(34));
        System.out.println(t.subSet(34,45));

        //navigable set methods
        System.out.println(t.ceiling(40));
        System.out.println(t.floor(35));
        System.out.println(t.lower(46));
        System.out.println(t.higher(36));
        System.out.println(t.pollFirst());
        System.out.println(t.pollLast());
        System.out.println(t);
    }
}
