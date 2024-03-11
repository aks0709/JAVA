package com.Ayush.Object;

public class ObjectDemo {
    int num;

    public ObjectDemo(int num) {
        this.num = num;
    }

    public ObjectDemo() {
        super();
    }

    @Override
    public int hashCode() {
   //     return num;// we can override it as we want
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString()//already discussed
    {
        return super.toString();
    }

    @Override  //already we discussed
    protected void finalize() throws Throwable {
        super.finalize();
    }


    public static void main(String[] args) {
        ObjectDemo obj=new ObjectDemo(43);
        ObjectDemo obj2=new ObjectDemo(43);
        ObjectDemo obj3=obj2;


        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj3.hashCode());
        System.out.println(obj instanceof ObjectDemo);
        System.out.println(obj3.getClass());
    }
}
