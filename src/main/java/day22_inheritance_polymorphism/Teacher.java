package day22_inheritance_polymorphism;

public class Teacher {

    public static void main(String[] args) {

        add( 5.00, 8);
        add(5, 9);
        add(4, 5,6);

        /*
        1)If you do method overloading ==> using the same name but different parameters you can apply that method for
        different requirements.
        2) Method overloading happens in one class therefore we donot need any inheritance for method overloading
        3)To do overloading
        i) do not change the method name
        ii) Change the parameters by changing a) number of parameters b) data type of parameters c)change the places of the parameters
        Note: To use another option for method overloading we shave to add different data types or different number of data types
        4) "private" methods can be overloaded
        5) "final" methods can be overloaded
        6) "static" can be overloaded

         */


    }

    private static int add(int a, int b){
        System.out.println(a+b);
        return a;

    }

    public static double add(double a, int b ){
        System.out.println(a+b);
        return a;
    }
    public static int add(int a, int b, int c){
        return a+b+c;
    }










}



