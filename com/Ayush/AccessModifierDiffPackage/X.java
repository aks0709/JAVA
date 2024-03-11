package com.Ayush.AccessModifierDiffPackage;

import com.Ayush.AccessModifiersEx.A;

public class X extends A{
    public X(int id, String name, int rollNo, int marks) {
        super(id, name, rollNo, marks);
    }

    public static void main(String[] args) {
        X obj=new X(12,"AKS",45,65);
        //int a=obj.id;//private member
        String n=obj.name;
        int b=obj.marks;
        //int c= obj.rollNo; //default ,cant be accessed in subclass of different package
    }
}
