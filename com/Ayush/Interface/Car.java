package com.Ayush.Interface;

public class Car implements Brake, Engine {
    @Override
    public void brake() {
        System.out.println("I brake like a normal cat");
    }

    @Override
    public void starts() {
        System.out.println("I turn on like normal car");
    }

    @Override
    public void stops() {
        System.out.println("I turn off like normal car");
    }

    @Override
    public void accelerate() {
        System.out.println("I accelerate like normal car");
    }
}
