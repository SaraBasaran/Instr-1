package day25_Exceptions;

public class Exceptions05 {

    public static void main(String[] args) {

        char ch1= getCharFromString("Java", 9);//StringIndexOutOfBoundsException
        System.out.println(ch1);

    }

    //Create a method to get any character from a string

    public static char getCharFromString(String str, int idx){

        //Homework: Type try -catch block for this exception

        return str.charAt(idx);
    }


}
