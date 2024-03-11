package com.Ayush.ExceptionHandling;

public class Demo {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        //int c=a/b;  //runtime error as n runtime it evalutes to find that we cant do such operation

        try {
            //normally do operation
           // divide(a, b);
            //throw new Exception("JUST FOR FUN , THIS IS CALLED MIMICING an Exception");
            String name = "ayush";
            if (name.equals("ayush")){
                throw new MyException("THIS IS CUSTOM EXCEPTION FOR NAME CREATED BY ME");
            }
        }
        catch (MyException e){
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println("Exception other than Arithmethic exception");
        }//we always declare exception from less restricted one to more restricted one
        /*
        catch (Exception e){
            System.out.println("Exception other than Arithmethic exception");
        }catch (ArithmeticException e){
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
        }

        this will show error as First catch will handle all the exception,
        * */
        finally {
            System.out.println("This will always run no matter what");
        }
    }
    static int divide(int a,int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Please do not divide by zero");
        }
        return a/b;
    }
}
