package day02;

public class Day02_TypeCasting {

    /*

    Type casting; converting a number primitive data type to another number primitive data type.For ex;
    while using data type convert as 'byte' convert to 'int'. Normally it is byte but it will behave like
     byte. (You can't change char or boolean data types, as they are not numeric data types).



    byte - short - int - long - float-double

    For ex;

    **If you convert small data type to large dat type it is called 'Auto widening'.
    **If you convert large data type to small data type it is called 'Explicit Narrowing'.

     */
    public static void main(String[] args) {

        byte age= 12;
        int myAge= age;

        short populationOfVillage= 21000;
        int myPopulationOfMyVillage= populationOfVillage;

        //Explicitly narrowing

        double x=23.45; // 23.45
        System.out.println(x);

        long y= (long) x;//23
        System.out.println(y);

        //Example 1: Create 2 integer variables and a String value

        int i= 13, k= 21;
        String s= "Tom";
        System.out.println(i+ k+ s);

        System.out.println(s + k*i);

        /*
           Order of the operations in Math
           1)Calculate the exponantial
           2)Do the operations inside the parenthesis
           3)Do multiplications and divisions
           4)Do add and subtractions
         */

        int result= 3 -2 * (5+2*3) /11;
        System.out.println(result);

        //Type Casting

        /*
        AutoWidening
        Java can put small data types into larger data types automatically
        When you put small data type into a large data type, you can widen the small data container into a bigger container data-type

       */

        //Auto-widening
        int m= 14000;
        System.out.println(m);

        double d= m;
        System.out.println(d);
        /*
        Explicitly Narrowing
        Java does not put large data types into small data types
         */

        int n= 15;
        byte b= (byte) n;
















    }


}
