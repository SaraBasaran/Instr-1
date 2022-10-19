package day25_Exceptions;

public class Exception01 {

    /*
    1-Exception is unexpected result.
    2-There are two ways to work with Exceptions.
        i)try-catch blocks : Handling Exceptions
        ii)Throw exceptions and block the application.

    3-If you do not handle Exception, java stops execution and the application is blocked.


     */
    public static void main(String[] args) {

        divide(6, 2);//3
        divide2(8, 0);//ArithmeticException



    }

    //1.way:We donot recommend this way. It is not mandatory to know all math rules. In Math, there may be a lot of way to consider every formule
    //to solve a code requirements.

    public static void divide(int a, int b){
        if(b==0){
            System.out.println("A problem occurred when dividing");
        }else{
            System.out.println(a/b);
        }

    }
    //2.way: Handle Exception by using try -catch blocks

    public static void divide2(int a, int b){


        try{
            System.out.println(a/b);

        }catch(ArithmeticException e){

            System.out.println("A problem occurred in division");//A problem occurred in division
        }


    }






}
