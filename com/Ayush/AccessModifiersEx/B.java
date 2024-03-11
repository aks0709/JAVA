package com.Ayush.AccessModifiersEx;

public class B {
    public static void main(String[] args) {
        A obj=new A(12,"AYUSH",41,96);
        //gives error
        //int a=obj.id;  //we are not able to use private members outside the class
        //whereas we are able to use other members in different class of same package
        String n=obj.name;
        int b=obj.marks;
        int c= obj.rollNo;
    }
}
