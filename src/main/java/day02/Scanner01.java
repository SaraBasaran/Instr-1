package day02;

import java.util.Scanner;

public class Scanner01 {

    /*
    Scanner class is used to get the data fromm user into our codes.Scanners are used to interact with the users.

    How do we get the data from the user?
    1.Step: Create an object from "Scanner Class".

    Class Name     Object Name    Assignment Operator    new Keyword     Constructor==>Class Name +()
     Scanner        input             =                    new               Scanner(System.in);
                    scan
     2.Step: Give a message to user about the data you ask
     */
    public static void main(String[] args) {

        //Ask user to enter his/her name
        Scanner input = new Scanner(System.in); //if we have multiple String values in one container, we should use nextLine().
        System.out.println("Enter your full name, please");
        String userFullName= input.nextLine();


        System.out.println();
        System.out.println("Enter your name, please"); //String

        String userName= input.next(); //till the first space
        System.out.println(userName); // Tom

        //Ask user to enter his/her age

        System.out.println("Enter your age, please"); //25/56
        byte age= input.nextByte();
        System.out.println(age);




    }


}
