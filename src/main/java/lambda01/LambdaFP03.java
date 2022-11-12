package lambda01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaFP03 {
    //upto now we learned fp with method reference here we will see the fp with Strings
    public static void main(String[] args) {
        List<String> l= new ArrayList<>();
        l.add("Tom");
        l.add("Alley");
        l.add("Mark");
        l.add("Amanda");
        l.add("John");
        l.add("Jackson");
        l.add("Marry");
        l.add("Alberto");
        l.add("Tucker");
        l.add("Ben");

        printInUpperCase01(l);
        System.out.println();
        //printInUpperCase02(l);
        printEleSortedByLengths(l);
        System.out.println();
        printEleInReverseOrderSortedByLength(l);
        System.out.println();
        printDistinctEleSortedByLastChar(l);
        System.out.println();
        printSortedByLengthAndSortedByInitial(l);
        System.out.println();
        //removeIfTheLengthIsGreaterThanFive(l);
        printRemoveIfStartingWithAOrEndingWithN01(l);
        System.out.println();
        printRemoveIfStartingWithAOrEndingWithN02(l);



    }
    //1)Create a method to print all list elements in uppercase.

    //1.way:
    public static void printInUpperCase01(List<String> list){

        list.stream().map(String::toUpperCase).forEach(UtilsClass::printInTheSameLineWithspace);

    }
    //2.way:
    public static void printInUpperCase02(List<String> list){
        list.replaceAll(String::toUpperCase); //here we donot use stream bec. it is not compulsory for fp using stream in all methods
        System.out.print(list);
    }

    //2) Create a method to print the elements after ordering according to their lengths

    public static void printEleSortedByLengths(List<String> list){

        list.stream().sorted(Comparator.comparing(String::length)).forEach(UtilsClass::printInTheSameLineWithspace);

    }
    //3)Create a method to print the elements after ordering according to their lengths (In reverse order)
    public static void printEleInReverseOrderSortedByLength(List<String> list){

        list.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(UtilsClass::printInTheSameLineWithspace);

    }

    //4) Create a method to sort the distinct elements by using their last characters

    public static void printDistinctEleSortedByLastChar(List<String> list){

        list.stream().distinct().sorted(Comparator.comparing(UtilsClass::getLastChar)).forEach(UtilsClass::printInTheSameLineWithspace);


    }

    //5)Create a method to sort the elements according to their lengths then according to their first character

    public static void printSortedByLengthAndSortedByInitial(List<String> list){

        list.stream().sorted(Comparator.comparing(String::length).thenComparing(t->t.charAt(0))).forEach(UtilsClass::printInTheSameLineWithspace);

        //Ben  Tom  John  Mark  Alley  Marry  Amanda  Tucker  Alberto  Jackson
    }

     //6) Remove the elements if the length of the element is greater than 5

    public static void removeIfTheLengthIsGreaterThanFive(List<String> list){

        list.removeIf(t-> t.length()>5);

        System.out.println(list);

    }
    // 7)Remove the elements if the element is starting with 'A', 'a' or ending with 'N', 'n'

    public static void printRemoveIfStartingWithAOrEndingWithN01(List<String> list){

        list.removeIf(t-> t.charAt(0)=='A' || t.charAt(0)=='a' || t.charAt(t.length()-1)=='N' || t.charAt(t.length()-1)=='n');

        System.out.println(list);

    }
    public static void printRemoveIfStartingWithAOrEndingWithN02(List<String> list) {

        list.removeIf(t -> t.startsWith("A") || t.startsWith("a") || t.endsWith("N") || t.endsWith("n"));
        System.out.println(list);
    }






}
