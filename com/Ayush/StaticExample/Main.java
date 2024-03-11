package com.Ayush.StaticExample;

public class Main
{


    public static void main(String[] args) {

        Human Ayush=new Human(21,"AYUSH",12000,false);
        Human MAYUR=new Human(24,"MAYUR",15000,false);
        Human RITIK=new Human(22,"RITIK",13000,false);
        //System.out.println(MAYUR.population);//dont do this it will work but still
        //fo these instead
        System.out.println(Human.population);// for convinience

        //greetings(); gives error as non static method is called inside static member
    }
    static void fun(){
        //greetings()  gives error as non static method is called inside static member
    Main obj=new Main();
    obj.greetings();//this gives no error as we have object

    }
    void fun2(){
        greetings(); //it gives no error as nonStatic calls nonStatic
    }
    void greetings(){
        fun();//it gives no error
        System.out.println("HELLO");
    }
}
