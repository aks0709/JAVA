package com.Ayush.AbstractDemo;

public class Main {
    public static void main(String[] args) {
        Car1 c=new Car1(190456);
        System.out.println("CAR1:-");
       c.carType();
       c.engineType();
       c.tankCapacity();
        System.out.println(c.numberPlate);
       Car2 c2=new Car2(890765);
        System.out.println("CAR 2 :-");
        c2.carType();
        c2.engineType();
        c2.tankCapacity();
        System.out.println(c2.numberPlate);

        //Car c3=new Car(); we cant create objects of abstract classes
    }
}
