package com.Ayush.Singleton;

public class Singleton {
    /*private Singleton() {

    }*/
    private static Singleton instance;//this is not going to depend on object of SingleTon class,and we are wanting to have only one object
    public static Singleton getInstance(){
        //Check whether only one object is created or not
        if(instance==null)
        {
            instance=new Singleton();  // only one object is created
        }

        return instance;
    }
}
