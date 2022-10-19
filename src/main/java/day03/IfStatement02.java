package day03;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {

        /*

        Example 1: Type code to print "Weekday" for the weekday names, "Weekend day" for the weekend days
        Monday - Friday ==> Weekday            Saturday, Sunday ==>Weekend day

         */
        //1.Step:
        Scanner input = new Scanner(System.in);

        //2.Step:
        System.out.println("Enter a day name");

        //3.Step: Create appropriate container/variable to put the data (==) to check equality of the numbers==>primitive data types
        //Note: To compare Strings use "equals()"
        String dayName= input.next();
        //1.way:if statements

        if(dayName.equals("Monday")){
            System.out.println("Weekday");
        }
        if(dayName.equals("Tuesday")){
            System.out.println("Weekday");
        }
        if(dayName.equals("Wednesday")){
            System.out.println("Weekday");
        }
        if(dayName.equals("Thursday")){
            System.out.println("Weekday");
        }
        if(dayName.equals("Friday")){
            System.out.println("Weekday");
        }
        if(dayName.equals("Saturday")){
            System.out.println("Weekend day");
        }
        if(dayName.equals("Sunday")){
            System.out.println("Weekend day");
        }

        //2.way: if else statement ==> with or => || ==> this sign means "OR" operator in Java. equalsIgnoreCase()==>java does not care about the upper
        // or lower case

        if(dayName.equalsIgnoreCase("Monday") || dayName.equalsIgnoreCase("Tuesday") ||
                dayName.equalsIgnoreCase("Wednesday") || dayName.equalsIgnoreCase("Thursday") ||
                dayName.equalsIgnoreCase("Friday")){

            System.out.println("Weekday");

        }else if(dayName.equalsIgnoreCase("Saturday") || dayName.equalsIgnoreCase("Sunday"))
            System.out.println("Weekend day");
        else{

        System.out.println("Invalid day name");

        }

        /*
        Note: "OR" operator in Java ==> ||
        "||" can be used just with booleans==> true or false.

        To get false from "||" operator everything should be false.

        Just a single "true" makes the result true.==>|| is optimistic
        To get "false" from || every condition should be false
        true || true ==> true
        true || false ==> true
        false || true ==> true
        true || false ==> true
        false || false ==> false


         */












    }


}
