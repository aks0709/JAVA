package com.Ayush.Collection;

import java.util.*;

public class ListInterface {
    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<>();
        List<String> l2=new LinkedList<>();
        List<String> l3=new Vector<>();
        //on LHS we can have parent and on RHS we have child

        //lets discuss about vector
        Vector<Integer> v1=new Vector<>();
        v1.add(41);
        v1.add(44);
        v1.add(46);
        v1.add(43);
        v1.add(42);
        v1.add(45);
        System.out.println(v1);
    }
}
