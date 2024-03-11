package com.Ayush.Interface;

public class ElectricEngine implements Engine{
    @Override
    public void starts() {
        System.out.println("ELectric Engine starts ");
    }

    @Override
    public void stops() {
        System.out.println("ELectric Engine stops");
    }

    @Override
    public void accelerate() {
        System.out.println("ELectric Engine accelerates ");
    }
}
