package day26_Exceptions02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E03 {

    public static void main(String[] args) throws IOException {
        /*
        1) FileNotFoundException=> it is thrown if the path of the file is wrong or if the file is not existing
        2) FileNotFoundException is "Compile Time Exception" (Checked Exception)
        3) FileNotFoundException is the child class of "IOException" class

        4) "IOException" class is related with all possible "input-output" issues
        5) "IOException" is "Compile Time Exception"(Checked Exception)
        6) When you use a parent-child exception classes in try catch blocks, you should type the child class first.

       7) When you encounter a "Compile Time Exception"(Checked Exception), you have 2 options;
        a) using "throws" keyword in method signature line
          **Java will throw exception and stop execution of the remaining part of coding

       b) you can handle by using try + catch blocks
         **Java will execute whatever you typed inside the catch block and does not stop execution for coding.

      8)What is the difference between "throw" and "throws" keywords?

        i) "throw" keyword is used to create any Exception class object
           "throws" keyword is put to method signature line

        ii) By using "throws" keyword you can declare multiple exceptions
            After using "throw" keyword we cannot add multiple exception classes

        iii)After using "throw" keyword , you have to create an Exception object
            After using "throws" keyword, you will just tell the name of Exception class.

        9) What is the difference between "Exception" and "error"?
           "Exception" can be handled because we have useful ways to handle them.
           But errors cannot be handled.
           OutOfMemory, StackOutOfMemory, VirtualMachine, Assertion Errors.

         */

        readTheText();
        readTheTextFile();



    }

    //Create a method to read a text from a text file.
    //If the file path is wrong, if the text cannot be found, if the text cannot be read, stop execution.

    public static void readTheText() throws FileNotFoundException, NullPointerException, IOException {

        FileInputStream fis= new FileInputStream("src/main/java/day26_Exceptions02/TextFile.txt");

        int k=0;

        while ( (k = fis.read()) !=-1){

            System.out.print((char)k);

        }

        System.out.println("==============================");

    }
    //Create a method to read a text from a text file.
    //If the file path is wrong, if the text cannot be found, if the text cannot be read, stop execution.
    //If we want java to move on reading the remaining part of coding, then we should handle exceptions that we
    //may encounter.
    public static void readTheTextFile(){

        try {

            FileInputStream fis = new FileInputStream("src/main/java/day26_Exceptions02/TextFile.txt");

            int k=0;

            while (true){
                try {
                    if (!((k = fis.read()) !=-1)) break;
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }  catch ( IOException e) {
                e.printStackTrace();
            }

                System.out.print((char)k);

            }


        } catch (FileNotFoundException e) {

            System.out.println("There is an issue in path or in the file " + e.getMessage());
        }

    }






}
