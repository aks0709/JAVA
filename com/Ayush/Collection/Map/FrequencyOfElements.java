package com.Ayush.Collection.Map;

import java.util.HashMap;

public class FrequencyOfElements {
    public static void main(String[] args) {
        int arr[]={1,4,5,1,2,7,2,0,1,2,0,5,4,7,6};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i< arr.length;i++){
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        System.out.println(map);
    }
}
