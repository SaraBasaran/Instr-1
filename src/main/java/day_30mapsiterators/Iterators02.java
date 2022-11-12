package day_30mapsiterators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Iterators02 {

    public static void main(String[] args) {

        //Example 1: Increase the numbers of the elements in a List by 20% print the elements in the reverse
        //   List= 20, 40, 60 ,100==> 24, 48, 72, 120 ==> 120, 72, 48, 24

        List<Integer> myList= new ArrayList<>();
        myList.add(20);
        myList.add(40);
        myList.add(60);
        myList.add(100);

        ListIterator<Integer> myItr=myList.listIterator();

        while (myItr.hasNext()){
            myItr.next();
        }

        while (myItr.hasPrevious()){

            Integer el= myItr.previous();

            myItr.set(el * 120/100);


        }
        Collections.reverse(myList);
        System.out.println(myList);//[120, 72, 48, 24]






    }



}
