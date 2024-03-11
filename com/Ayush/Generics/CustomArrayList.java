package com.Ayush.Generics;

import java.util.Arrays;

public class CustomArrayList {
    private int []data;
    private static int DEFAULT_SIZE=5;
    private int size=0;

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }
    public void add(int num){
        if(isFULL()) {
            Resize();
        }
        data[size++]=num;
    }

    private void Resize() {
        int temp[]=new int[data.length*2];
        //copy current item in new array
        for(int i=0;i< data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }
    public int remove(){
        int removedItem=data[--size];
        return removedItem;
    }

    public int get(int index){
        return data[index];
    }
    public int size(){
        return size;
    }

    public void set(int index,int num){
        data[index]=num;
    }

    private boolean isFULL() {
    return size==data.length;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomArrayList list=new CustomArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(70);
        list.add(80);
        list.add(60);
        System.out.println(list);
        System.out.println(list.remove());
        System.out.println(list.remove());
        System.out.println(list);
        list.add(45);
        System.out.println(list);
    }
}
