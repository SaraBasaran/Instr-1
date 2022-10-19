package practice;

import java.util.Scanner;

public class Practice01_IfStatement {


    //Type a code to print its season after getting a month name from the user.

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        //Give message to the user
        System.out.println("Enter a month name");

        //Create a container for the input
        String month= scan.next().toLowerCase();

        if (month.equals("march") || month.equals("april") || month.equals("may")) {
            System.out.println("Spring");
        }else if(month.equals("june") ||month.equals("july") || month.equals("august")){
            System.out.println("Summer");
        }else if(month.equals("september") || month.equals("october") || month.equals("november")){
            System.out.println("Autumn");
        }else if(month.equals("december") || month.equals("january") || month.equals("february")){
            System.out.println("Winter");
        }else {
            System.out.println("Enter a valid month name, please");
        }

















    }











}
