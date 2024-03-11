package com.Ayush.Generics;

import java.util.Arrays;

public class CustomGerenericArrayList<T> {
    private Object[] data;
    private static int DEFAULT_SIZE=5;
    private int size=0;

    public CustomGerenericArrayList() {
        data = new Object[DEFAULT_SIZE];
    }
    public void add(T num){
        if(isFULL()) {
            Resize();
        }
        data[size++]=num;
    }

    private void Resize() {
        Object temp[]=new Object[data.length*2];
        //copy current item in new array
        for(int i=0;i< data.length;i++){
            temp[i]=data[i];  //no need of casting as we are assigning Object type to a Object type
        }
        data=temp;
    }
    public T remove(){
        //here we need type casting as we are assigning more restricting one to less restricting one
        // data[] of type Object which is on top of every class,
        T removedItem=(T)data[--size];
        return removedItem;
    }


    public T get(int index){
        return (T)data[index];
    }
    public int size(){
        return size;
    }

    public void set(int index,T num){
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
        CustomGerenericArrayList<Integer> list1=new CustomGerenericArrayList<>();
        list1.add(34);
        list1.add(54);
        list1.add(43);
        list1.add(32);
        list1.add(36);
        list1.add(41);
        System.out.println(list1);

        CustomGerenericArrayList<String> list2=new CustomGerenericArrayList<>();
        list2.add("AYUSH");
        list2.add("MAYUR");
        list2.add("XYZ");
        list2.add("AYUSH");
        list2.add("MAYUR");
        list2.add("XYZ");
        System.out.println(list2);


    }
}
