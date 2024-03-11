package com.Ayush.Collection.CollectionsClass;

import java.util.Collections;
import java.util.Vector;

public class CollectionS {
    public static void main(String[] args) {
        Vector<Integer> v=new Vector<>();
        v.add(13);
        v.add(36);
        v.add(23);
        v.add(34);
        System.out.println(v);
        Collections.sort(v);
        System.out.println(v);//after sorting
        Collections.binarySearch(v,23);
        Collections.reverse(v);
        System.out.println(v);
        System.out.println(Collections.max(v));
        System.out.println(Collections.min(v));
        Collections.swap(v,2,3);
        System.out.println(v);
    }
}
