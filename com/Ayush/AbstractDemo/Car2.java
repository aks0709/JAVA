package com.Ayush.AbstractDemo;

public class Car2 extends Car{
    public Car2(int numberPlate) {
        this.numberPlate=numberPlate;
    }

    @Override
    void carType() {
        System.out.println("IT IS Normal CAR");
    }

    @Override
    void engineType() {
        System.out.println("IT HAS petrol ENGINE");
    }

    @Override
    void tankCapacity() {
        System.out.println("IT HAS 70 Lt capacity");
    }
}
