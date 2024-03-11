package com.Ayush.AccessModifiersEx;

public class A
{
    private int id;
    public String name;
    int rollNo; //don't write default keyword
    protected int marks;

    public A(int id, String name, int rollNo, int marks) {
        this.id = id;
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
    public void greetings(){
        System.out.println("HEY");
    }
    public static void main(String[] args) {
        A obj=new A(12,"Ayush",41,89);
        int a=obj.id;
        String n=obj.name;
        int b=obj.marks;
        int c= obj.rollNo;
        //we are able to access to every members of all access modiefers types within same class

    }
}

