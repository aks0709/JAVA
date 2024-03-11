package com.Ayush.Collection;

import java.util.*;

public class Cursors {
    public static void main(String[] args) {
        Vector <Integer> v1=new Vector<>();
        v1.add(34);
        v1.add(41);
        v1.add(30);
        v1.add(45);
        v1.add(36);
        v1.add(43);
        Enumeration e=v1.elements(); //used for Legacy classes
        while (e.hasMoreElements()){
            Integer i=(Integer)e.nextElement();
            System.out.print(i+" ");
        }
        System.out.println();
        ArrayList<Integer> v2=new ArrayList<>();
        v2.add(34);
        v2.add(41);
        v2.add(30);
        v2.add(45);
        v2.add(36);
        v2.add(43);
        Iterator it=v2.iterator();
        while (it.hasNext()){
            Integer i=(Integer) it.next();
            System.out.print(i+" ");
        }
        LinkedList<Integer> v3=new LinkedList<>();
        v3.add(34);
        v3.add(41);
        v3.add(30);
        v3.add(45);
        v3.add(36);
        v3.add(43);
        System.out.println();
        ListIterator lit=v3.listIterator();
        while (lit.hasNext()){
            Integer i=(Integer) lit.next();
            if(i==41)
                lit.add(34);
            else if(i==45)
                lit.set(28);
        }
        System.out.println(v3);

    }
}
