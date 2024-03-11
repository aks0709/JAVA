package com.Ayush.Properties.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box b1=new Box();
        System.out.println(b1.l+" "+b1.w+" "+b1.h);

        Box b2=new Box(4);
        System.out.println(b2.l+" "+b2.w+" "+b2.h);

        Box b3=new Box(b2);
        System.out.println(b3.l+" "+b3.w+" "+b3.h);
        Box b4=new Box(14,54.3,23);
        System.out.println(b4.l+" "+b4.w+" "+b4.h);

        Box b=new BoxWithWeight(2,3,4,5);  //b is ref variable of type superclass,
        // System.out.println(b.weight);  gives error as weight is member of subclass,we can only access members
        //related to superclass
        //reverse gives error

        BoxWithPrice bp1=new BoxWithPrice();
        System.out.println(bp1.weight+" "+bp1.l+" "+bp1.h+" "+bp1.w+" "+ bp1.price);
        BoxWithPrice bp2=new BoxWithPrice(3,5,45) ;
        System.out.println(bp2.weight+" "+bp2.l+" "+bp2.h+" "+bp2.w+" "+ bp2.price);

    }
}
