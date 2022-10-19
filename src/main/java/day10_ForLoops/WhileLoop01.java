package day10_ForLoops;

import java.util.Scanner;

public class WhileLoop01 {

    public static void main(String[] args) {

        //Example 1: Type code to print integers from 3 to 6

        //1.way:
        for(int i=3; i<7; i++){
            System.out.print(i + " ");
        }
        System.out.println();

        //2.way:
        int i=3;

        while (i<7){
            System.out.print(i+ " ");

            i++;
        }

        System.out.println();
        //Example 2: Type code to print odd integers from 12 to 67 in the same line with a space between them
        int k= 12;

        while(k<68){

            if(k%2!=0){

                System.out.print(k+ " ");
            }
            k++;
        }
        System.out.println();

        //Example 3: Type code to find the sum of integers from 12 to 67

        int m=12;
        int sum=0;

        while (m<68){
           sum= sum+m;
           m++;
        }

        System.out.println(sum);

        //4.Example: Type java code by using while loop,
        //           Write a program that prompts the user to input an integer.
        //           It should then find the sum of the digits of that number.
        //           123 ==> 1+2+3 = 6

        Scanner input= new Scanner(System.in);
        System.out.println("Enter an integer to find the sum of the digits");

        int num= input.nextInt();
        int sumOfDigits=0;

        while (num>0){

            sumOfDigits= sumOfDigits + num%10;
            num = num/10;

        }
        System.out.println(sumOfDigits);

         /*
		 Example 5: Type java code by using while loop,
	     Write a program that prompts the user to input a number.
	     It should then print the multiplication table of that number.
	     3x1=3  3x2=6  3x3=9  3x4=12 3x5=15  3x6=18  3x7=21  3x8=24  3x9=27  3x10=30
	  */

        System.out.println("Enter an integer to see the multiplication table on the console");

        int n= input.nextInt();//3

        int p= 1;//multiplication

        while (p<11){
            System.out.println(n + "x"+ p+ "="+ n*p);
            p++;

        }












    }





}
