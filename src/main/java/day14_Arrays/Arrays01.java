package day14_Arrays;

import java.util.Arrays;

public class Arrays01 {

    // Example 1: [0, 2, 3, 0, 12, 0] put the zeros to the end
    //[2, 3, 12, 0, 0, 0]

    public static void main(String[] args) {

        int arr[]= {0, 2, 3, 0, 12, 0};

        int brr[]= new int[arr.length];
             int idx=0;
        for (int i=0; i<arr.length; i++){

            if (arr[i]!=0) {
                brr[idx] = arr[i];
                idx++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(brr));

        // Example 2: Type code to check if a specific element exists in an array or not
        //            int crr[] = {-12, 23, 5}; check if 23 exists in the array or not

        int crr[]={-12, 23, 5, 99, 45, 63};

        int counter=0;

        int element= 23;

        for ( int w: crr){
            if(w==element){
                counter++;
            }
        }
        if(counter>0){

            System.out.println("There are" + counter+ " times in the array");
        }else{
            System.out.println("The number does not exist");
        }



    }


}
