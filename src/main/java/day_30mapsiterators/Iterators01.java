package day_30mapsiterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {
    /*
    An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet.
    It is called an "iterator" because "iterating" is the technical term for looping.
     To use an Iterator, you must import it from the java.util package.

     We have for-loop, while-loop, for-each loop and do-while loops.
     for-each loop is the fastest loop of all.It is better and easier to among the loops.
     But by using for-each loop it is impossible to remove or update a data in collections.
     Therefore, Java created a new structure called "iterators" to remove some elements from a collections or modify some elements in collections

     There are 2 iterators: 1) Iterator ==> has one direction=> starts from index 0 upto the last index==> one direction from left to right
                            2) ListIterator==>has two directions (bidirective) ==> starts from index 0 upto the last index and also vice-versa

      for-each loop and Iterators have same performance but iterators are best to update and remove elements from collections.

     set() ==> uses iterators in the backend

     */
    public static void main(String[] args) {

        List<String> list1= new ArrayList<>();
        list1.add("Ali");
        list1.add("Ayshia");
        list1.add("Can");

        System.out.println(list1);//[Ali, Ayshia, Can]

        //Example 1: Remove the element "Can"

       // Remove method doesnot work with for each loop
//        for (String w: list1){
//
//            if(w.equals("Can")){
//                list1.remove(w);
//            }
//
//        }

        //Update the element==> set() uses iterators in the backend operations
        for (String w: list1){

            list1.set(list1.indexOf(w), w+"!");//[Ali!, Ayshia!, Can!]
        }
        System.out.println(list1);

        //Update the element==> set() uses iterators in the backend operations
        //1.way:
        for (String w: list1){

        list1.set(1, "*");

        }
        System.out.println(list1);

        //2.way: Using iterator object

        Iterator<String> itr1= list1.iterator();

        while(itr1.hasNext()){

            String el= itr1.next();

            itr1.remove();

        }
        System.out.println(list1);//[]

        //3.way: Using iterator object to update the element
        List<String> list2= new ArrayList<>();
        list2.add("Ali");
        list2.add("Ayshia");
        list2.add("Can");

      ListIterator<String> itr2= list2.listIterator();

        while(itr2.hasNext()){

            String el2= itr2.next();

            itr2.set("*");


        }
        System.out.println(list2);//[]





    }

}
