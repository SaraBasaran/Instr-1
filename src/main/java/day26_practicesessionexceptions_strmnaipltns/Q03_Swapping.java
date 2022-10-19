package day26_practicesessionexceptions_strmnaipltns;

import java.util.Scanner;

public class Q03_Swapping {

    //Ask user to enter 2 numbers then swap them
    // a= 12; and b= 13; ===> a=13; and b=12

    public static void main(String[] args) {

        try{
        Scanner input= new Scanner(System.in);
        System.out.println("Enter first number");
       double a= input.nextDouble();

        System.out.println("Enter second number");
        double b= input.nextDouble();
            System.out.println(a + " - " + b);
            double temp= 0;
            temp=b;
            b=a;
            a= temp;
            System.out.println(a + "-" + b);

        }catch (Exception e){

            System.out.println("Something went wrong while swapping");
        }

    }

}
