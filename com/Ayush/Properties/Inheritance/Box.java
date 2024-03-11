package com.Ayush.Properties.Inheritance;

public class Box {
    double l;
    double w;
    double h;
     Box(){
         this.l=-1;
         this.w=-1;
         this.h=-1;
     }
     //cube
     Box(double side){
         this .l=side;
         this .w=side;
         this .h=side;
     }

     Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    Box(Box obj){
         this.l=obj.l;
        this.w=obj.w;
        this.h=obj.h;
    }
    public void information(){
        System.out.println("DISPLAYING BOX");
    }
}
