package com.Ayush.AbstractDemo;

public class Car1 extends Car{
    //sub class must be declared as abstract or override all abstract methods

    public Car1(int numberPlate) {
        this.numberPlate=numberPlate;
    }

    @Override
    void carType() {
        System.out.println("IT IS SUPER CAR");
    }

    @Override
    void engineType() {
        System.out.println("IT HAS DISEL ENGINE");
    }

    @Override
    void tankCapacity() {
        System.out.println("IT HAS 100 Lt capacity");
    }
}
