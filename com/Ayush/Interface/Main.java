package com.Ayush.Interface;

public class Main
{
    public static void main(String[] args) {
        /*Car car=new Car();
        car.starts();
        car.accelerate();
        car.brake();
        car.stops();*/
        NiceCar car=new NiceCar(new PowerEngine()); //we created nice car with Power engine
        car.start();
        car.acc();
        car.startMusic();
        car.UpgradeEngine(new ElectricEngine());//we upgrade it to electric engine
        car.start();
        car.acc();
        car.stops();
        car.stopsMusic();

        //previously if we call car.starts it starts engine not starts music ,now by creating seperate classes we overcome that anomly
    }

}
