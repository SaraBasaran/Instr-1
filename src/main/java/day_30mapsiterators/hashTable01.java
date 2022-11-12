package day_30mapsiterators;

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

        //Example 1: Store the students names together with their email addresses, ages, grades and nationality
        // Tom Hanks = th@gmail.com, 21, 2, "American"

        Hashtable<String, Students> studentsInfo= new Hashtable<>();

        studentsInfo.put("Tom Hanks", new Students("th@gmail.com", 21, 2, "American"));
        studentsInfo.put("Brad Pitt", new Students("bd@gmail.com", 24, 3, "Peruvian"));
        studentsInfo.put("Angeline Jolie", new Students("aj@gmail.com", 17, 4, "English"));

        System.out.println(studentsInfo);

        //How to get a specific data from students table

        Students bradInfo=studentsInfo.get("Brad Pitt");
        System.out.println(bradInfo.age);//24
        System.out.println(bradInfo.nationality);//Peruvian





    }









}
