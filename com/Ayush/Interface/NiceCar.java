package com.Ayush.Interface;

public class NiceCar {
    private Engine engine;  //this car have its own engine of type Engine
    private Media Player=new CDPlayer();
    public NiceCar(Engine engine) {
        this.engine = engine;
    }
    public void start(){
        engine.starts();
    }
    public void stops(){
        engine.stops();
    }
    public void acc(){
        engine.accelerate();
    }
    public void startMusic(){
        //engine.starts();//wrong
        Player.starts();//right
    }
    public void stopsMusic(){
        Player.stops();
    }
    public void UpgradeEngine(Engine engine){
        this.engine=engine;  //we can upgrade from power to electric and vice versa
    }
}
