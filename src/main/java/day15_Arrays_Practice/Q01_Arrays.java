package day15_Arrays_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Q01_Arrays {

    public static void main(String[] args) {

        //Ask user to enter the number of the names into the application by using an Array then take the number of the elements and
        // then print them on the console.
        //1.step:
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number of names you want to insert");

        int length= input.nextInt();
        String arrNames[]= new String[length];

        //2.Step:Insert the elements into the array
        for(int i=0; i<length; i++){
            System.out.println("Enter the "+ (i+1) + ". employee name. Please press 'Q' to quit the application");
            String employeeName= input.next();
            if(!employeeName.equalsIgnoreCase("Q")){
                arrNames[i]=employeeName;
            }else{
                break;
            }
        }
        System.out.println(Arrays.toString(arrNames));

        //Type code to print the sum of minimum and maximum integers in an Array.

        int arr[]= {12, 56, 89, 5, 34, 92};

        System.out.println(Arrays.toString(arr));//[12, 56, 89, 5, 34, 92]

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); //[5, 12, 34, 56, 89, 92]

        int minValue= arr[0]; //the lowest number
        int maxValue= arr[arr.length-1];//the greatest value from the array


        System.out.println("The sum of the min and max value is: " + (minValue + maxValue));










    }

}
