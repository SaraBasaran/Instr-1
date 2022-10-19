package day29_Maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMap03 {

    //Type code to print the number of occurrences of the words in a sentence

    //"I like to move it, move it, do you like to move it?"
    //I=1, like=2,

    public static void main(String[] args) {

        String sentence= "I like to move it, move it, do you like to move it?";

        //Remove all the punctuations
        sentence=sentence.replaceAll("\\p{Punct}", "");//I like to move it move it do you like to move it
        System.out.println(sentence);

        //Get the words splitted by using split() with space
        String [] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));//[I, like, to, move, it, move, it, do, you, like, to, move, it]

        HashMap<String, Integer> occurenceMap= new HashMap<>();

        for(String w: words){

            Integer numOfOccurrences= occurenceMap.get(w);

            if(numOfOccurrences==null){

                occurenceMap.put(w, 1);
            }else {

                occurenceMap.put(w, numOfOccurrences+1);

            }
        }
        System.out.println(occurenceMap);//{move=3, like=2, I=1, to=2, it=3, do=1, you=1}


    }
}
