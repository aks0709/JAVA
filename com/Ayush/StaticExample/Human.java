package com.Ayush.StaticExample;

public class Human
{
    int age;
    String name;
    int salary;
    boolean married;
    //these above attributes are instances

    static long population;

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population+=1;
    }
}
