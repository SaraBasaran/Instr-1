package day24_practice_session;

public class Q02_CalculateVolumeOfCube {

  //Create a method to calculate  volume of cube, square prism and rectangular prism.

    public double volumeOfCube(double a){ //a*a*a

        return a*a*a;

    }

    public final double volumeOfSquarePrism(double a, double b){ // a*a*b

        return a*a*b;

    }

    public static double volumeOfRectangularPrism(double a, double b, double c){

        return a*b*c;

    }


}
