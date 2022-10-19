package day29_Maps;

import java.util.HashMap;

public class HashMap02 {
    public static void main(String[] args) {
        /*
        1)When you create a hashMap, Java creates 16 buckets in memory and indexes them from 0-15
        2)When you use put() method java uses hashCode() to create an integer value to assign the index randomly and uses %16
        3) The result of hashCode()%16 returns the index value selected for the entry
        4)After selecting bucket index, java will put the entry into the selected bucket as a node of LinkedList
        5)Every node will have 4 parts in it i)HashCode ii)Key iii)Value iv)Pointer
        6)Java makes every hashCode unique but sometimes Java can create same hashCode accidentally this is called "hashcode collision"
        7)"HashCode" Collision" are common for hashMap phenomenon of hashing functions.
        8) If the key is null hashCode will be "0" that is why the entry whose is null will be put into the bucket whose index is zero


        */

        HashMap<String, Double> coursePrices= new HashMap<>();

        coursePrices.put("Full Stack Development", 6000.00);

        coursePrices.put("Full Stack Automation Engineer", 5000.00);

        coursePrices.put("SalesForce Development", 4500.00);



    }




}
