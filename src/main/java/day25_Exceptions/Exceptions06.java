package day25_Exceptions;

public class Exceptions06 {

    public static void main(String[] args) {

        /*
        Exception is a class and it has many child classes. We have learned
        1-ArithmeticException
        2-NullPointerException
        3-NumberFormatException
        4-ArrayIndexOutOfBoundException
        5-StringOutOfBoundException
         */
        //doCombination(null, 5); //NullPointerException

        //doCombination("12a", 2);//NumberFormatException
        doCombination2("420", 0);//ArithmeticException

        doCombination2("345abc", 6 );




    }
    //create a method
    // i)Find the length of a String
    // ii) Convert the String to an integer
    // iii) Divide the integer by a given number

    public static void  doCombination(String str, int num){
        try{
            int length= str.length();//3
            System.out.println(length);

            int intStr= Integer.valueOf(str);//420
            System.out.println(intStr);

            int result = intStr/num;
            System.out.println(result);//420/0==>
        }catch(NullPointerException e){
            System.out.println("There is a problem in finding length");
        }catch (NumberFormatException e){
            System.out.println("There is a problem in convertion process");
        }catch (ArithmeticException e){
            System.out.println("There is a problem in division");//There is a problem in division
        }

        System.out.println("Code execution did not stop");




    }

    public static void  doCombination2(String str, int num){
        try{
            int length= str.length();
            System.out.println(length);

            int intStr= Integer.valueOf(str);
            System.out.println(intStr);

            int result = intStr/num;
            System.out.println(result);

        }catch(Exception e){

            System.out.println(e.getMessage());// by zero //For input string: "345abc"
        }

        System.out.println("Code execution did not stop");


    }




}
