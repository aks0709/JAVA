package com.Ayush.Properties.Inheritance;

public class BoxWithWeight extends Box{
    double weight;

    public BoxWithWeight() {
        this.weight = -1;
    }

    public BoxWithWeight(double l, double w, double h, double weight) {
        super(l, w, h);//what is this? --> call the parents class constructor
        //used to initialise value present in parents class
        this.weight = weight;
    }
    public BoxWithWeight(BoxWithWeight other){
        super(other);
        this.weight=other.weight;
    }
    public BoxWithWeight(Box obj, double weight) {
        super(obj);  //call constructor of class Box where we pass argument as object
        this.weight = weight;
    }
    BoxWithWeight(double side,double weight){
        super(side);
        this.weight=weight;
    }
}
