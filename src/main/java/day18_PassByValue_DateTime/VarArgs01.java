package day18_PassByValue_DateTime;

public class VarArgs01 {

    public static void main(String[] args) {

        /*
        If you want to make the parameters limit flexible in a method, use "VarArgs".
        To create VarArgs "Data type + ... + space + a name for the varargs"
        VarArgs use Arrays behind. When you work with varargs, you can think you are working with arrays.
        VarArgs can accept zero or more elements

        Int q1 ==> Can I use another regular parameter after varargs? ==> "No. Because "varargs" cannot be typed more than once                             inside method parenthesis also if typed; second parameter will make java reach out the limit of varargs and it will give error.
         Varargs must be last parameter everytime.

        Int q2 ==> Can I use another regular parameter before VarArgs? ==> "Yes, you can use many regular parameters
        before VarArgs.

        Int q3 ==> Can I use multiple "varargs" parameters in a method? ==> "No.Because once we type varargs as first
        parameter then we cannot add any other parameters after varargs...
        */

        System.out.println(add(3, 5, 9, 47, 56, 75)); //8
        System.out.println(add(56,95,45));//196
        System.out.println(add(78,45,62,89,210,78));//562

    }

    public static int add(int b, int... a){

        int sum=0;

        for(int w: a){

            sum= sum+w;

        }
        return sum;

    }






}
