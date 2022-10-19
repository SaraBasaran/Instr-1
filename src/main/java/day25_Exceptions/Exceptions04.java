package day25_Exceptions;

public class Exceptions04 {

    public static void main(String[] args) {

        int r1= convertStringToInt("123");//NumberFormatException

        System.out.println(r1);

    }

    //Create a method to convert a String to an integer

    public static int convertStringToInt(String str){
        int i= 0;
        try{
            i=Integer.valueOf(str);

        }catch (NumberFormatException e){

            System.out.println("A problem occurred while converting");
        }

        return i;

    }





}
