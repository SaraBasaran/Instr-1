package day29_Maps;

import java.util.Hashtable;

public class hashTable01 {

    /*
    HashTable is a Map
    HashTable is not putting the entries in order
    HashTable is slower than hashMap
    HashTable is thread-safe and synchronized
     */

    public static void main(String[] args) {

        Hashtable<String, Integer> countryPopulations= new Hashtable<>();
        countryPopulations.put("USA", 400000000);
        countryPopulations.put("Germany", 120000000);
        countryPopulations.put("Turkey", 100000000);
        countryPopulations.put("Denmark", 3000000);

        System.out.println(countryPopulations);


    }









}
