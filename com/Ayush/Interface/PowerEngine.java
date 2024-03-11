package com.Ayush.Interface;

public class PowerEngine implements Engine{
    @Override
    public void starts() {
        System.out.println("Power engine starts ");
    }

    @Override
    public void stops() {
        System.out.println("POWER ENGINE STOPS");
    }

    @Override
    public void accelerate() {
        System.out.println("POWER ENGINE ACCELERATES");
    }
}
