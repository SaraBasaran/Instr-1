package day19_Practice;

import java.util.Arrays;

public class Q03_FindEleInMiddle {

    public static void main(String[] args) {
    /*
        Find the middle element in an integer array
       Example 1: (12, 5, 8) ==> (5, 8, 12) ==> Output=8
       Example 2: (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Output=(8+12)/2 = 3
    */
        int [] arr= {12, 5, 8, 21, 13, 15, 50};

        Arrays.sort(arr);
        int middleIdx= arr.length/2;  //3.5==> 3
        System.out.println(Arrays.toString(arr));//[5, 8, 12, 13, 15, 21, 50]
        System.out.println(middleIdx);

        if(arr.length % 2 !=0 ){
            System.out.println(middleIdx);
        }else {
           int middle= (arr[middleIdx] + arr[middleIdx-1]) /2;
            System.out.println(middle);
        }













    }

}
