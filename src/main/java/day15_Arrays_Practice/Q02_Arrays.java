package day15_Arrays_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Q02_Arrays {

    //Example 1: Type code to check if a specific element exists in an Array or not
    public static void main(String[] args) {

        int arrInt[]= {250, 85, 98, 25, 88, 654, 789};

        int searchedItem= 25;
        //1.way:

        int counter= 0;

        for(int w: arrInt){
             if(w==searchedItem){
                counter++;
             }
         }
        if(counter>0){
            System.out.println("The element exists");
        }else {
            System.out.println("The element does not exist ");
        }

        //2.way:
        //We will binarySearch()==>everytime we need binary first use sort() method then use binarySearch().

        Arrays.sort(arrInt);

        System.out.println(Arrays.toString(arrInt));//[25, 85, 88, 98, 250, 654, 789]

        int searchedNum= Arrays.binarySearch(arrInt, 98);

        System.out.println(searchedNum);

        //Example 2:Get string from user and type code to find the number of words in the String.
        //String str= {"Learn Java earn money"};

        Scanner input= new Scanner(System.in);

        System.out.println("Enter a sentence to check the number of the words");

        String str= input.nextLine();

        String strArr[]= str.split(" ");

        System.out.println("The total number of words are: " + strArr.length);


        //Example 3: Count the number of words starts with "s" in the String

        int counter2=0;
        for(String w: strArr) {
            if (w.startsWith("j") || w.startsWith("J")) {
                counter2++;

            }
        }
        System.out.println(counter2 + " words are in the sentence");
        if (counter2==0){
            System.out.println("There is not a word in that sentence");
        }





    }








}
