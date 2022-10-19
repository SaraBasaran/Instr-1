package day29_Maps;

import java.util.*;

public class HashMap01 {

    /*
    Map ==> word (key) = meaning(value)==>like a dictionary
    1)Maps have key-value structure
    2)Keys have to be unique but values may not
    3)Every element in a Map is called "Entry"
    4)All elements are called "EntrySet".
    5)Keys cannot be null but value can be left as null.
    6)HashMap puts the entries in random order, because of that it is super fast.

     */

    public static void main(String[] args) {

        //How to create a hashMap

        HashMap<String, Integer> stdAges= new HashMap<>();

        //How put data into a hashMap

        stdAges.put("Ali", 13);
        stdAges.put("Tom Hanks", 53);
        stdAges.put("Brad Pitt", 55);
        stdAges.put("Angelina Jolie", 43);

        System.out.println(stdAges); //{Tom Hanks=53, Brad Pitt=55, Angelina Jolie=43, Ali=13}

        Set<String> keys= stdAges.keySet();
        System.out.println(keys);//[Tom Hanks, Brad Pitt, Angelina Jolie, Ali]


        Collection<Integer> values=stdAges.values();
        System.out.println(values);//[53, 55, 43, 13]

        //Can I put null to key part??
        stdAges.put(null, 23);
        System.out.println(stdAges);//null=23,==>at the very first order

        stdAges.put(null, 78);
        System.out.println(stdAges);

        //What happens if you use same key repeatedly?

        stdAges.put("Angelina Jolie", 33);
        System.out.println(stdAges);//java overwrites the value part only

        //How to get a value of a key?
        Integer tomAge=stdAges.get("Tom Hanks");
        System.out.println(tomAge);//53

        //If the key does not exist when you use get() what happens?

        Integer unknown= stdAges.get("Xyz blcb");
        System.out.println(unknown);//null==>technical

        //getOrDefault() ("Xyz blcb") returns 0 ==> because if the key doesnpt exist among the keys then
        // it will return the typed value as in the given way.
        Integer unknown2 = stdAges.getOrDefault("Xyz blcb",0);
        System.out.println(unknown2);// 0

        //I want to put an entry if it does not exist, then I should use putIfAbsent().

        stdAges.putIfAbsent("Brad Pitt", 44);
        System.out.println(stdAges);

        stdAges.putIfAbsent("Tom Cruise", 55);
        System.out.println(stdAges);//{null=78, Tom Hanks=53, Brad Pitt=55, Angelina Jolie=33, Tom Cruise=55, Ali=13}

        //How to update the value of a key
        stdAges.replace("Tom Hanks", 63); //Tom Hanks=63,
        System.out.println(stdAges);

        //How to update a key by typing old and new values
        stdAges.replace("Tom Hanks", 63, 54);//Tom Hanks=54,
        System.out.println(stdAges);

        //How to remove an entry from a Map

        stdAges.remove("Tom Hanks");
        System.out.println(stdAges);

        stdAges.remove("Someone not existing");
        System.out.println(stdAges);//java will not remove anything if it cannot find it!

        stdAges.put("John Travolta", null);
        System.out.println(stdAges);

        stdAges.put("Ahmet Bulut", null);
        System.out.println(stdAges);

        //How to get entries one by one from a hashMap;
       // stdAges.entrySet();==> helps java to resolve the entries

        Set<Map.Entry<String, Integer>> entries=stdAges.entrySet();//{null=78, Brad Pitt=55, Angelina Jolie=33, Ahmet Bulut=null, Tom Cruise=55, Ali=13, John Travolta=null}

        for(Map.Entry<String, Integer> w: entries){

            System.out.println(w + "!");
        }
















    }



}
