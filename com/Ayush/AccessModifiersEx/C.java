package com.Ayush.AccessModifiersEx;

public class C extends A{
    public C(int id, String name, int rollNo, int marks) {
        super(id, name, rollNo, marks);
    }

    public static void main(String[] args) {
        C obj=new C(12,"AD",41,67);
       //int a=obj.id;  //subclass can't have access of private members in same package
        String n=obj.name;
        int b=obj.marks;
        int c= obj.rollNo;
    }
}
