package day03;

import java.util.Scanner;

public class Scanner03 {

    //Example 1: Ask user to enter width, heigth and the length of a rectangular prism then calculate the total area.
    //The area formula= 2*w*l + 2* h*l + 2 * w*h

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Enter width, length and heigth");

        double w= input.nextDouble();
        double l= input.nextDouble();
        double h= input.nextDouble();

        System.out.println("Total surface area is: " + (2*w*l + 2* h*l + 2 * w*h));





    }


}
