package com.Ayush.StaticExample;

public class InitializationBlock {
    static int a=4;
    static int b;
    static {
        System.out.println("HEY I am INSIDE STATIC BLOCK");
        b=a*5;
    }

    public static void main(String[] args) {
        InitializationBlock obj=new InitializationBlock();
        System.out.println(obj.a+" "+obj.b);
        obj.b+=3;
        System.out.println(obj.a+" "+obj.b);
        System.out.println(obj.a+" "+obj.b); //initialisation block only runs once

    }
}
