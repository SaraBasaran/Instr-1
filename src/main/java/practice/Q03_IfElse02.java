package practice;

import java.util.Scanner;

public class Q03_IfElse02 {

    public static void main(String[] args) {

        /*
        //Type a code, get age from user and decide which stage on it
        //0 - 4 => baby
        //5 - 12 => child
        //13 - 20 => teenager
        //21 - 30 => adult
        //else (not expected age)
         */

        //1.Step: Create scanner object
        Scanner input= new Scanner(System.in);

        //2.Give message to the user
        System.out.println("Enter your age, please");

        //3.Create container according to data type
        int age= input.nextInt();

        if(age>=0 && age<=4){  //0 - 4 => baby
            System.out.println("baby");
        }else if(age>=5 && age<=12){ //5 - 12 => child
            System.out.println("child");
        }else if(age >=13 && age<=20){
            System.out.println("teenager");
        }else if(age>=21 && age <=30){
            System.out.println("adult");
        }else{
            System.out.println("not expected age");
        }













    }






}
