package day25_Exceptions;

public class Exception02 {

    public static void main(String[] args) {

        String a[]={"A", "B", "D", "E", "F"};

        String r1= getElement(a, 5);//ArrayIndexOutOfBoundsException
        System.out.println(r1);


    }
    //Create a method to get any element from a String array.
    public static String getElement(String a[], int idx){

        String s= "";
        try {
            s= a[idx];

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("A problem occured in array indexes");
            System.out.println(e.getMessage());//to receive more technical=>Index 5 out of bounds for length 5
            e.printStackTrace(); //gives detailed technical for Exception
        }
        return s;

    }

}
