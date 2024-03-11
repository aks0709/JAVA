package com.Ayush.Properties.PolyMorphism;

public class MAIN {
    public static void main(String[] args) {
        Shapes shape=new Shapes();
        Circle circle=new Circle();
        Square sq=new Square();
        shape.area();
        circle.area();
        sq.area2();
        //the area method is represented in many manner that is what we call polymorphism

        Shapes c=new Circle();
        c.area();
        //we already learn the fact that we only have access to the methods and variables  described in parent class,see line 13.
        //but which area method will be running is decided by object ,as we are making object of class Circle
        //and we override the  area method  so area method of class circle will be running
        Shapes sq2=new Square();
        sq2.area();//as in Square class we didnt override the method area so ,area method of class Shapes i.e, parent class
        //will be running

        Parent child=new Child();
        child.fun();
    }
}
