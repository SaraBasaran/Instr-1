package day26_practicesession;

import java.util.Scanner;

public class Q01SumOfDigitsInString {

     /*
     Create a method that accepts a String as parameter and finds the sum of digits in that String.
     Example:
     input : J/4\4 1$ 34$¥
     output : 16
     Hint:
     Character.isDigit()
     Integer.valueOf()
    */

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Enter a string");
        String str= input.nextLine();

        sumOfDigits(str);

    }

    public static void sumOfDigits(String str){

        try{
            int sum=0;

            for(int i=0; i<str.length(); i++){

                if( Character.isDigit(str.charAt(i))){

                    sum+= Integer.valueOf(""+str.charAt(i));

                }

            }
            System.out.println("Sum of digits: " + sum); //NumberFormatException, ArithmeticException, NullPointerException

        }catch (Exception e){

            System.out.println("There has been some unexpected issues while processing");
        }

        }






    }
