package com.Ayush.AbstractDemo;

public abstract class Car {
    //if even one of the method is  abstract then class must be abstract too

    //we can't create abstract constructors
    //we can't create objects of abstract classes because if you create one then we can call abstract method
    //we can't access them as they have no function body
    //Car c3=new Car() {
    //            @Override
    //            void carType() {
    //            }
    //            @Override
    //            void engineType() {
    //            }
    //            @Override
    //            void tankCapacity() {
    //            }
    //        };
    //we need to declare the class in this way to create its object
    int numberPlate;
    abstract void carType();
    abstract void engineType();
    abstract void tankCapacity();
}
