package practice;

import java.util.Scanner;

public class Practice02_IfStatement {

        //Type a code, get age from user and decide which stage on it
        //0 - 4 => baby
        //5 - 12 => child
        //13 - 20 => teenager
        //21 - 30 => adult
        //else (not expected age)

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Enter your age");

        //create container for the input
        int age= input.nextInt();

        if(age>=0 && age<=4){
            System.out.println("baby");
        }else if(age>=5 && age<=12){
            System.out.println("child");
        }else if(age>=13 && age<=20){
            System.out.println("teenager");
        }else if(age>=21 && age<=30){
            System.out.println("adult");
        }else{
            System.out.println("not expected age");
        }
         /*
        	 	|| means "or": If you use "||" between 2 things it means at least 1 of them is enough for you
	 	               For example; "tea || coffee" means just tea, or just coffee, or both
	 	               To get false from || operation all must be false
	 	               true || true ==> true
	 	               true || false ==> true
	 	               false || true ==> true
	 	               false || false ==> false
	 	        	 Note: "|" checks both conditions.
	                       "||" does not check the second condition, if first one is true
	                       "||" is faster than "|"

               && means "and":  If you use "&&" between 2 things it means you want both.
	 	                For example; "tea && coffee" means I want both, just one of them will not be enough
	 	                To get true from && operation all must be true.
	 	                true && true ==> true
	 	                true && false ==> false
	 	                false && true ==> false
	 	                false && false ==> false
	 	      & means "and":  If you use "&" between 2 things it means you want both.
	 	                For example; "tea & coffee" means I want both, just one of them will not be enough
	 	                To get true from && operation all must be true.
	 	                true & true ==> true
	 	                true & false ==> false
	 	                false & true ==> false
	 	                false & false ==> false
	 	      Note: "&" and "&&" do the same but
	 		  "&&" does not check the second condition if the first condition is false.
	 		  "&" checks both conditions every time.
         */

    }




}
