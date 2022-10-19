package day24_practice_session;

public class Q02_RunnerForCalculationOfCube {

    public static void main(String[] args) {

        Q02_CalculateVolumeOfCube obj1= new Q02_CalculateVolumeOfCube();

        System.out.println(obj1.volumeOfCube(2.6));//17.576000000000004
        System.out.println(obj1.volumeOfSquarePrism(12, 1.85));//266.40000000000003
        System.out.println(obj1.volumeOfRectangularPrism(15, 12, 7.52));//1353.6

    }

}
