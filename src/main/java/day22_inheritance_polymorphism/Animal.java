package day22_inheritance_polymorphism;

public class Animal {

    public String name="Animal";

    public void eat(){ //overridden method

        System.out.println("Animals eat...");

    }
    public void drink(){
        System.out.println("Animals drink...");
    }

    public Mammal create(){

        return new Mammal();

    }
    public Integer add(){

        return 12;
    }
    public int multiply(){

        return 24;

    }


    public boolean isRetired(){
        return true;
    }

    public static int counter(){
        return 5;
    }



}
