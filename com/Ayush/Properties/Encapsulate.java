package com.Ayush.Properties;

import com.Ayush.StaticExample.Main;

public class Encapsulate {
    private String name;
    private int rollno;
    private int age;

    //getters and setters
    public int getAge(){
        return age;
    }
    public int getRollno(){
        return rollno;
    }
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setRollno(int rollno){
        this.rollno=rollno;
    }
    public void setAge(int age){
    this.age=age;
    }

    public static void main(String[] args) {
        Encapsulate obj=new Encapsulate();
        obj.setAge(20);
        obj.setName("AYUSH");
        obj.setRollno(41);
        System.out.println(obj.getAge()+" "+obj.getRollno()+" "+obj.getName());
    }
}
