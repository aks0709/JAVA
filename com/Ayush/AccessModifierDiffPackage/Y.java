package com.Ayush.AccessModifierDiffPackage;
import com.Ayush.AccessModifiersEx.A;
public class Y {
    //no subclass different package
    public static void main(String[] args) {
        A obj=new A(13,"AYUSH",78,89);
        obj.greetings();
        String v=obj.name;

        //not able to access

        /*int a=obj.id;
        int b=obj.rollNo;
        int c=obj.marks;*/

    }
}
