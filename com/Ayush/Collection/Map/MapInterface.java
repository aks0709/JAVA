package com.Ayush.Collection.Map;

import java.util.*;

public class MapInterface {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("JAVA",100);
        map.put("Python",50);
        map.put("C++",80);

        //LinkedHashMap
        Map<String,Integer> map2=new LinkedHashMap<>();
        map2.put("JAVA",100);
        map2.put("Python",50);
        map2.put("C++",80);

        //HashTable used for thread safe
        Map<String,Integer> map3=new Hashtable<>();
        map3.put("JAVA",100);
        map3.put("Python",50);
        map3.put("C++",80);
        //sorted map
        //navigable map
        //tree map
        System.out.println("unordered map:"+map);
        System.out.println("LinkedHashMap"+map2);
        System.out.println("HashTable"+map3);
        System.out.println(map.containsKey("JAVA"));
        System.out.println(map.containsValue(70));
        System.out.println(map.get("Python"));

        for(Map.Entry<String,Integer> entry:map2.entrySet()){
            System.out.println("KEY:- "+entry.getKey()+" VALUE:- "+entry.getValue());
        }
    }
}
