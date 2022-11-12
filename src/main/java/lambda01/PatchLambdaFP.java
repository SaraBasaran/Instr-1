package lambda01;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PatchLambdaFP {
    //1) Create a method to find the minimum value which is greater than 7 and even from the list

    public static void getMinGreaterThanSeven03(List<Integer> list){

        Integer min= list.stream().filter(t->t%2==0).filter(t->t>7).sorted().findFirst().get();

        System.out.println(min);

    }

    //2)Create a method to find the half of the elements which are distinct and greater than 5 in reverse order in the list

    public static void getHalfOfDistinctElementsInReverseOrder(List<Integer> list){

        List <Double> result= list.
                              stream().
                              distinct().
                              filter(t->t>5).
                              map(t->t/2.0).
                              sorted(Comparator.reverseOrder()).
                              collect(Collectors.toList());

        System.out.println(result);
    }
}
