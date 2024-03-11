package com.Ayush.Collection.QUEUE;

import java.util.Comparator;
import java.util.PriorityQueue;
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
class MyComparator implements Comparator {
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

public class PQ {
    public static void main(String[] args) {
        PriorityQueue pq=new PriorityQueue();
        pq.offer("A");
        pq.offer("C");
        pq.offer("D");
        pq.offer("B");
        System.out.println(pq);  //elements are stored in any order
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());

        Book b1=new Book("JAVA",500);
        Book b2=new Book("PYH",450);
        Book b3=new Book("C++",250);
        Book b4=new Book("GO",700);
        PriorityQueue <Book> PQ2=new PriorityQueue<>(new MyComparator());
        PQ2.offer(b1);
        PQ2.offer(b2);
        PQ2.offer(b3);
        PQ2.offer(b4);
        Book b=PQ2.poll();
        System.out.println(b.getTitle()+" "+b.getPrice());
        b=PQ2.poll();
        System.out.println(b.getTitle()+" "+b.getPrice());
        b=PQ2.poll();
        System.out.println(b.getTitle()+" "+b.getPrice());
        b=PQ2.poll();
        System.out.println(b.getTitle()+" "+b.getPrice());
    }
    }
