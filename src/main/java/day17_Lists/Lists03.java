package day17_Lists;

import java.util.ArrayList;
import java.util.List;

public class Lists03 {

    public static void main(String[] args) {

        //Type code to increase the value of every element by 3 except 7.
        List<Integer> a= new ArrayList<>();

        a.add(11); //14
        a.add(33); //36
        a.add(22); //25
        a.add(7);  //XXX
        a.add(15);  //18

        for(Integer w: a) {

            if (w == 7) {
                continue;
            }

            a.set(a.indexOf(w), w+3);    //we can assign new values by using set()==> indexOf(), +/-/*)
        }

        System.out.println(a);

        //Example 2: Convert all elements to "*" except the last 4 elements.
        List <String> b= new ArrayList<>();
        b.add("11");
        b.add("31");
        b.add("22");
        b.add("17");
        b.add("31");
        b.add("21");
        b.add("67");

        for(int i=0; i<b.size(); i++){

            if(i==(b.size()-4)){

                break;
            }

            b.set(i, "*");
        }
        System.out.println(b);


    }



}
