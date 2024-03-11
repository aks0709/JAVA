package com.Ayush.Collection.SetInterface;

import com.Ayush.AccessModifiersEx.B;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Book{
    private String title;
    private double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }
    public String getTitle(){
        return title;
    }
    public double getPrice(){
        return price;
    }
}
class MyComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Book b1=(Book)o1;
        Book b2=(Book)o2;
        if(b1.getPrice()<b2.getPrice())
            return -1;
        else
            return 1;
    }
}
public class CustomSortingInInterface {

    public static void main(String[] args) {
        Book b1,b2,b3;
        b1=new Book("JAVA",500.00);
        b2=new Book("PYTHON",200.00);
        b3=new Book("C++",450.50);
        TreeSet<Book> t=new TreeSet<>(new MyComparator());
        t.add(b1);
        t.add(b2);
        t.add(b3);
        Iterator it=t.iterator();
        Book b;
        while (it.hasNext()){
            b=(Book)it.next();
            System.out.println(b.getTitle()+" "+b.getPrice());
        }
    }
}
