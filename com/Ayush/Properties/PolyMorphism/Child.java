package com.Ayush.Properties.PolyMorphism;

public class Child extends Parent{
   //@Override :-gives error as static methods cant be overridden
    static void fun(){
        System.out.println("Hi I am Child");
    }
}
