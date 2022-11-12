package lambda01;

import day32_lambdafp.UtilsClass;

import java.util.stream.IntStream;

public class LambdaInt {

    public static void main(String[] args) {

        System.out.println(getSumFromSevenToHundred01());
        System.out.println(getSumFromSevenToHundred02());
        System.out.println(getMultiplicationFromTwoToEleven());
        System.out.println(calculateFactorial(-6));
        System.out.println(sumOfIntsInGivenRange(-2, -4));
        System.out.println(findSumOfDigitsInTheGivenRange(32, 23)); //68



    }
    //1)Create a method to find the sum of integers from 7 to 100
    //if we donot have a ready list we can use IntStream structure.
    //IntStream.range(7, 101)==>does the same functionality with for loop in structured programming
    public static int getSumFromSevenToHundred01(){
        //1.way:
        return IntStream.range(7, 101).reduce(0, Math::addExact);
    }

    public static int getSumFromSevenToHundred02(){
        //2.way:
        //rangeClosed(7, 100)==>does the same with for loop in structured programming
        return IntStream.rangeClosed(7, 100).reduce(0, Math::addExact);
    }
    //2)Create a method to find the multiplication of the integers from 2(inc) to 11(inc)

    public static int getMultiplicationFromTwoToEleven(){

        return IntStream.rangeClosed(2, 11).reduce(1, Math::multiplyExact);//39916800
    }

    //3) Create a method to calculate the factorial of a given number.(5 factorial= 1*2*3*4*5 ==> 5!=m1*2*3*4*5)

    public static Object calculateFactorial(int x){

            return x>0 ? IntStream.rangeClosed(1, x).reduce(1, Math::multiplyExact) : "Do not use negative numbers for factorial operations";
            //Do not use negative numbers for factorial operations
    }

    //4) Create a method to calculate the sum of even integers between given two integers
    public static int sumOfIntsInGivenRange(int a, int b ){

        //what happens if the first given number range is greater than the second number range like "-2" and "-4"
         //starting value must be less than the ending value ==> causes problem

        int x=0;
        if (a>b){
            x=a;
            a=b;
            b=x;
        }
        return IntStream.rangeClosed(a, b).filter(UtilsClass::checkToBeEven).sum(); //-6
    }

    //5) Create a method to calculate the sum of digits of every integers between given two integers

    //23 and 32 ==> (2+3) + (2+4) + (2+5) + (2+6) + (2+7) + (2+8) + (2+9) + (3+0)+ (3+1) + (3+2) for each sum part

    //we will use sum of digits in every single digit sum up now we have to create our own method to calculate
    // the sum for all digits one by one

    public static int findSumOfDigitsInTheGivenRange(int a, int b){
        //what happens if the user gives a range that the first number is less than the second number range, we should
        //handle it by following the same way in the previous example
        int x=0;
        if (a>b){
            x=a;
            a=b;
            b=x;
        }

       return IntStream.rangeClosed(a, b).map(UtilsClass::getSumOfDigits).sum();

    }


}










