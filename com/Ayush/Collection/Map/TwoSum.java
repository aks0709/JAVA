package com.Ayush.Collection.Map;

import java.util.HashMap;

public class TwoSum {
    public static boolean solve(int arr[],int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],1);
        }
        for(int i=0;i<arr.length;i++){
            if(target>arr[i]&&map.containsKey(target-arr[i])){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={3,1,5,7,11,2};
        int target=7;
        int arr2[]={2,1,3};//edge case handle it not handled yet
        System.out.println(solve(arr,target));
        System.out.println(solve(arr2,2));
    }
}
