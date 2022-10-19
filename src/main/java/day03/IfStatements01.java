package day03;

public class IfStatements01 {

    public static void main(String[] args) {

        //If statement: We sometimes need to execute some codes under some specific conditions
        //   If it rains, I will cancel the picnic



        //Example 1: Type code to print "negative" for the numbers less than zero, "non-negative" for the numbers greater than or equal to zero.

        double d= 2.3;

        if (d<0){
            System.out.println("Negative");
        }
        if(d>=0){
            System.out.println("Non-negative");
        }

        //Example 2: Type code to print "Divisible by 5" if the number can be divided by 5, otherwise print "Not divisible by 5" if the number cannot be
        //divided by 5. In java "==" means equals. % (modulus operator) ==> gives the remainder of a division operation. In java "=" is assignment operator.
         int i= 1506;

        //1.way: Multiple if statements

        if(i%5==0){

            System.out.println("Divisible by 5");

        }
        if(i%5 != 0){  // "!" means "NOT" in Java!.
            System.out.println("Not divisible by 5");
        }

        //2.way: If else statements ==>use it if you have just two conditions
        //In the second way Java checks just 1 condition, but in the first Java checks 2 conditions.
        //If you type the code in the second firstly, you will prevent repetition and secondly Java will execute your code faster.
        int k= 15;
        if(k%5 ==0){
            System.out.println("Divisible by 5");
        }else{
            System.out.println("Not divisible by 5");
        }






    }



}
