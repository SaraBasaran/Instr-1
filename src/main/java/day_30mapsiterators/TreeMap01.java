package day_30mapsiterators;

import java.util.*;

public class TreeMap01 {

    /*
    1)TreeMap puts the entries into natural order
    2)TreeMap is the slowest Map
    3)TreeMap is not thread-safe and not synchronized

    There are 3 maps=1.hashmap, 2.treemap and 3.hashtable

    hashmap is the fastest bec random (Key=value, no index)
    treemap puts elements in natural order so the slowest(slowest)
    hashtable is taking the elements with multiple values and takes the keys indexes randomly(key=multiple values)
     */

    public static void main(String[] args) {

        TreeMap<String, Integer> countryPopulations= new TreeMap<>();
        countryPopulations.put("USA", 400000000);
        countryPopulations.put("Germany", 120000000);
        countryPopulations.put("Turkey", 100000000);
        countryPopulations.put("Denmark", 3000000);
        System.out.println(countryPopulations);

        //If the key is the same with any key inside the treeMap you will get the entry itself
        //If the key is not existing inside the treeMap then it will return the nearest and greatest on the console.
        //If the key is not existing at all inside the treeMap then it will return "null".
        Map.Entry<String, Integer> dataOfCeiling=countryPopulations.ceilingEntry("Z");
        System.out.println(dataOfCeiling);//Turkey=100000000

        //If you want to organize treeMAp inn reverse order you should use descendingKeySet()

        NavigableSet<String> keysInDescendingOrder= countryPopulations.descendingKeySet();
        System.out.println(keysInDescendingOrder);//[USA, Turkey, Germany, Denmark]

        Map.Entry<String, Integer> floorCountryData= countryPopulations.floorEntry("M");
        System.out.println(floorCountryData);//Turkey=100000000=>nearest and the closest previous key in return

        //lowerEntry() returns the key before the given the key
        //But floorEntry() returns the key itself if it is existing if it not existing it will return the closest and previous key in TreeMap.
        Map.Entry<String, Integer> abc= countryPopulations.lowerEntry("Germany");
        System.out.println(abc);//Denmark=3000000

        SortedMap<String, Integer> subMap1= countryPopulations.subMap("Denmark", false, "USA", true);
        System.out.println(subMap1);//{Germany=120000000, Turkey=100000000, USA=400000000}

        SortedMap<String, Integer> subMap2=countryPopulations.subMap("Germany", "USA");//{Germany=120000000, Turkey=100000000}
        System.out.println(subMap2);//in default usage of subMap() the first key is inclusive and the second key is exclusive

        SortedMap<String,Integer> tailTreeMap=countryPopulations.tailMap("Germany");
        System.out.println(tailTreeMap);//{Germany=120000000, Turkey=100000000, USA=400000000}

        SortedMap<String,Integer> tailTreeMap2=countryPopulations.tailMap("Germany", false);
        System.out.println(tailTreeMap2);//{Turkey=100000000, USA=400000000}




    }


}
