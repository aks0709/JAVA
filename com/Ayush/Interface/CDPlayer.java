package com.Ayush.Interface;

public class CDPlayer implements Media {
    @Override
    public void starts() {
        System.out.println("MUSIC STARTS");
    }

    @Override
    public void stops() {
        System.out.println("MUSIC STOPS");
    }
}
