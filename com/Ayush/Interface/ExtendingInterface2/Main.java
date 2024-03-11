package com.Ayush.Interface.ExtendingInterface2;

public class Main {
    public static void main(String[] args) {
        C c=new C();
        c.fun();
        D d=new D();
        d.fun();
        d.greet();
        c.greet();
        A.fun2();
    }
}
