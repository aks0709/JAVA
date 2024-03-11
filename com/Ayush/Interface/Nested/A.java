package com.Ayush.Interface.Nested;

public class A {
    public interface NestedInterface{
        boolean isOdd(int num);
    }

}
class B implements A.NestedInterface{
    @Override
    public boolean isOdd(int num) {
        if(num%2!=0)
            return true;

        return false;
    }
}