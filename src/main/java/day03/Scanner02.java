package day03;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {

    // Example: Get the width and the length of a rectangle from the user
    //and get the area==> width*length= area

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the width");

        double width= input.nextDouble();  //85.2

        System.out.println("Enter the length");
        double length= input.nextDouble();

        System.out.println("The area of the rectangular is: "+width * length);











    }

}
