package day23_practice_session;

public class Q03_RunnerForCalculationOFVolume {

    public static void main(String[] args) {

    Q03_CalculateVolumeOfCube obj1= new Q03_CalculateVolumeOfCube(); //in every object we need a constructor.

        System.out.println(obj1.volumeOfCube(12));  //1728.0
        System.out.println(obj1.volumeOfSquarePrism(12, 1.85)); //266.40000000000003
        System.out.println(obj1.volumeOfRectangularPrism(15, 7.52, 4.45));  //501.96

    }

}
