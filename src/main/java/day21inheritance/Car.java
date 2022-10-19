package day21inheritance;

public class Car {

    public void engine(){

        System.out.println("All cars have engine...");
    }

    public Car(){
        System.out.println("day21inheritancepolymorphism.Car class constructor 1");
    }

    public Car(String engineType){
        super();
        System.out.println(engineType);

    }

}