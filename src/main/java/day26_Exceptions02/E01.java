package day26_Exceptions02;

public class E01{

    public static void main(String[] args) {

        printAge(25);

        try{
            printAge(-25);
        }catch(IllegalArgumentException e){
            System.out.println("Age is not valid");
        }

        System.out.println("Codes are working");

        try{
            printTheWorkerAge(14);
        }catch (IllegalArgumentException e){
            System.out.println("Age is not a valid age for a worker");
        }

        printTheWorkerAge(34);

       // printTheWorkerAge(13);
    }

    //Create a method to print the given age
    public static void printAge(int age){

        if(age<0){

           throw new IllegalArgumentException("Age cannot be a negative number");

        }

        System.out.println(age);


    }

    //Create a method to print workers' age (under 16 is not acceptable)

    public static void printTheWorkerAge(int age){

        if (age<16){

            throw new IllegalArgumentException("A worker's age cannot be under 16");

        }
        System.out.println(age);




    }




}
