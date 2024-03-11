package com.Ayush.StaticExample;
class Test2{
    String name;

    public Test2(String name) {
        this.name = name;
    }
}
 class Test3{
   static String name;

     public Test3(String name) {
         Test3.name = name;
     }
 }
public class InnerClasses {
     class Test{
         String str;

         public Test(String str) {
             this.str = str;
         }
     }

     static class Test4{
         String str;

         public Test4(String str) {
             this.str = str;
         }
     }

    public static void main(String[] args) {
        // Test a1=new Test("AYUSH");//gives error as class Test depends upon outer class(InnerClasses)
        //every instance of class InnerClasses have class Test
        Test2 a2=new Test2("ayush"); //it gives no error as TEST2 class does not depend on any other class

//for test 3 class
        Test3 a3=new Test3("JGM");
        Test3 a4=new Test3("XYZ");
        //output will be same because for Test3 class String variable is static ,same static var is used for a3,a4
        System.out.println(a3.name);
        System.out.println(a4.name);

        Test4 x=new Test4("KUNAL");
        Test4 y=new Test4("RAHUL");
        System.out.println(x.str);
        System.out.println(y.str);



       /* it will different output,now question may arise how x and y object are different if Test 4 is static class
        the thing is Test4 class is static so it must not depend on  object of class InnerClasses,
         but Test4 and psvm can have instances of each other*/




    }

}
