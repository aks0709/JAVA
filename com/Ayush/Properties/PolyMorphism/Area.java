package com.Ayush.Properties.PolyMorphism;

public class Area
{
    public static int area(int side){
        return side*side;
    }
    public static int area(int l,int b){
        return l*b;
    }

    public static void main(String[] args) {
        System.out.println("Area of square is "+area(4));
        System.out.println("Area of rectangle is "+area(4,5));
        // this is method overloading as there are two methods with same name area,JAVA at compile time determine which method to run
    }
}
