package com.Ayush.Interface.ExtendingInterface2;

public interface B {
    default void meet(){
        System.out.println("meet B");
    }
    default void fun(){
        System.out.println("Hi I am B");
    }
    void greet();
}
