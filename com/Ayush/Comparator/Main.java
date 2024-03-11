package com.Ayush.Comparator;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student ayush=new Student(41,90.65f);
        Student ujjawal=new Student(171,98.45f);
        Student shivansh=new Student(42,94.35f);
        Student sitashu=new Student(173,95.5f);

        Student[] list={ayush,ujjawal,shivansh,sitashu};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));  //sort on the basis of marks as compareTo method uses the marks parameter
        Arrays.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int)(o1.rollNo-o2.rollNo);
            }
        });
     //   Arrays.sort(list, (o1, o2) -> (int)(o1.rollNo-o2.rollNo)); press altEnter to replace it with lambda expression
        System.out.println(Arrays.toString(list));  //sort on the basis of roll no

        /*if (ayush.compareTo(ujjawal)<0)
            System.out.println("ujjawal has more marks");
        else if (ayush.compareTo(ujjawal)==0) {
            System.out.println("equal marks");
        }
        else
            System.out.println("AYUSH HAS MORE MARKS");*/
    }
}
