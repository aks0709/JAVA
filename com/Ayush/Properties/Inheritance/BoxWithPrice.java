package com.Ayush.Properties.Inheritance;

public class BoxWithPrice extends BoxWithWeight{
    double price;

    BoxWithPrice(){
        super();//if we write it or not it is going to call super method
        this.price=-1;
    }

    public BoxWithPrice(double price) {
        this.price = price;
    }

    public BoxWithPrice(double l, double w, double h, double weight, double price) {
        super(l, w, h, weight);//this super by default call the constructor of just above parent class
        this.price = price;
    }

    public BoxWithPrice(Box obj, double weight, double price) {
        super(obj,weight);
        this.price = price;
    }
     BoxWithPrice(BoxWithPrice otherObj){
        super(otherObj);
        this.price=otherObj.price;
    }
    BoxWithPrice(double side,double weight,double price){
        super(side,weight);
        this.price=price;
    }

}
