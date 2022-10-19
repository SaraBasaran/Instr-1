package day02;

public class WrapperClass01 {

    public static void main(String[] args) {

        /*

        Wrapper Class

        Non-primitive have "methods", this is useful and good.
        We can do many actions by using "methods", this is good.
        But Primitives do not have any "methods" because of that we cannot do any actions with primitives.
        Java created a new structure which has "primitive value" and "methods" together,
        that new structure is called "Wrapper Class"

        Wrapper classes are "Non-Primitive data types.

        Primitive      Wrapper Class
        byte             Byte
        short           Short
        int            Integer
        long            Long
        float          Float
        double        Double
        boolean       Boolean
        char          Character

         We can add methods to primitive data-types and by adding methods they become non-primitive.
         */

        int i= 12; //there is no method, just value
        Integer k= 12; //there are many methods in the coding

        char c= 'A';
        Character d= 'A';

        //Autoboxing: To convert "primitive data" to "wrapper class" data type.

        byte b= 23; //close to add any actions/methods
        Byte wb= b;  //is open to addition of the methods

        //Unboxing: To convert "wrapper class" to its "primitive data"

        Short ws= 34; //open to be added the methods
        short s= ws;   //container is closed to add methods

        //How to get the minimum and maximum values of numeric types in java

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        System.out.println(Character.MAX_VALUE);
        System.out.println(Character.MIN_VALUE);



    }




}
