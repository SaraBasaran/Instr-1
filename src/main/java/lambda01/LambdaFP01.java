package lambda01;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaFP01 {
    public static void main(String[] args) {

        /*
        1)Lambda is Functional programming and lambda was added into java 8==>
        We started to use lambda in java 8
        2)In Functional prog, we focus on "what to do" but in structured programming we focus on "how to do"==>
        (to reach the goal focusing on what to do is shorter bec of that it is shorter to reach the goal, when you type a
        code in sp it may take upto half an hour but in fp it takes 5 min.s )

         3) FP can be used just with arrays and collections==> list, queue and set
         If you wanna use fp in maps you have to use entryset() and convert maps into collections and then
         you can use fp in Maps as well

         */

        List<Integer> l= new ArrayList<Integer>(); //bec fp can be used with collections
        l.add(8);
        l.add(9);
        l.add(131);
        l.add(10);
        l.add(9);
        l.add(10);
        l.add(2);
        l.add(8);
        printElementsStructured(l);
        System.out.println("===========================");
        printElementsFunctional(l);
        System.out.println();
        printEvenElementsStructured(l);
        System.out.println();
        printEvenElementsFunctional(l);
        System.out.println();
        printSquareOfOddElements(l);
        System.out.println();
        printCubeOfDistinctOddElements(l);
        System.out.println();
        sumOfSquareOfDistinctEvenElements(l);
        productOfCubesOfDistinctEvenElements(l);
        getMaxEle01(l);
        getMaxEle02(l);
        getMinGreaterThanSeven(l);
        }

        //1)Create a method to print the list ele.s on the console in the same line with a space
        //between two consecutive ele.s (Structured) //() we should type first access modifier

    public static void printElementsStructured(List<Integer> list) {
        //the name of this part (List<Integer> list) is parameter and when we call that method
        //in the main method we are just typing the arguments in it.Args is the real name of the value
        //inside method call part

        for (Integer w : list) { //until now we just typed our structure

            System.out.print(w + " ");

        }
    }
        //Let us do the same method by using fp
        //1) Create a method to print the list ele.s on the console in the same line with a space
        //between two consecutive ele.s (Functional) //() we should type first access modifier

        public static void printElementsFunctional(List<Integer> list){
            list.stream().forEach(t-> System.out.print(t + " "));

            //stream() //here java takes all elements automatically into stream and prints directly one by one
            //stream orders elements from top to down. Wth the usage of stream () java puts the ele.s
            //in fp we can convert our list structure to fp structure with stream () we can use multiple methods with it.
            // for ex; when we create an object from Character wrapper class you will have some methods to use but when
            // you create a String object then you can have numerous methods compared to
           //Character wrapper class .To be able to use more methods we create our object with stream().

        //for each loop will take the element into stream and prints ele.s on the console also "t" is used as
            // "each element" inside the loop. we used for now 2 methods => stream and foreach

        }
    //2) Create a method to print the even list ele.s on the console in the same line with a space
    //between two consecutive ele.s (Structured) //() we should type first access modifier

    public static void printEvenElementsStructured(List<Integer> list){

        for (Integer w: list){

            if (w%2==0){
                System.out.print(w + " ");
            }

        }

    }
    public static void printEvenElementsFunctional(List<Integer> list) {

        list.stream().filter(t->t%2==0).forEach(t-> System.out.print(t +" "));
        //if you select som ele.s to work on them it means you are filtering them.it will get the ele.

    }
    //3) Create a method to print the square of odd list ele.s on the console in the same line with a space
    //between two consecutive ele.s (Functional)
    public static void printSquareOfOddElements(List<Integer> list){

        list.stream().filter(t-> t%2!=0).map(t-> t*t).forEach(t-> System.out.print(t +" ")); //81 17161 81

        //here map() will give the square root of the element.To print the squares you need to find the square of elements
        //not the elements itself...map method will return us the calculated value standing for each elelemnt' square root.



    }
    //4) Create a method to print the cube of distinct odd list ele.s on the console in the same line with a space
    //between two consecutive ele.s (Functional)

    public static void printCubeOfDistinctOddElements(List<Integer> list){

        //list.stream().filter(t->t%2!=0).distinct().map(t-> t*t*t).forEach(t-> System.out.print(t + " ")); //729 2248091

        //distinct () returns us the elements after removing the repeated times.It will give us just the elements that
        //you will see the numbers as not repeated on the console.If I don't want to see repeated outcome on the console
        //then I should use distinct().

        //Also, if We put the distinct() before filter() for java there will be less work so it is better way to use
        //distinct () before filter().

        list.stream().distinct().filter(t->t%2!=0).map(t-> t*t*t).forEach(t-> System.out.print(t + " "));

    }

    //5) Create a method to calculate the sum of the squares of distinct even elements

    public static void sumOfSquareOfDistinctEvenElements(List<Integer> list){

        list.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0, (t, u) ->t+u);

                //after doing sum up I should see only one value on the console to make java in the way we want
        //we should use reduce method. Inside the list I have 3 even ele.s but after sum up all these 3 I am going to have only 1 value
        //that is why we should use reduce method.
        //in reduce() we use two parameters first part will be initial value and second one will be functionality part
        //so we are typing here 2 numbers. After the process I am going to have a result for addition operation so I need to put
        //that new vaşue into an Integer container....
        Integer sum=  list.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0, (t, u) ->t+u);
        //here reduce() is starting with 0 as this is an addititon operation if we put 100 for the first parameter
        //then initial value for the reduce() will be 100...like a sum container in for loop...if we do multiplication for
        //reduce () you should type 1 as initial value

        System.out.println(sum);//168
    }

    //6) Create a method to calculate the product of the cubes of distinct even elements
    public static void productOfCubesOfDistinctEvenElements(List<Integer> list){

        Integer product= list.stream().distinct().filter(t->t%2==0).map(t-> t*t*t).reduce(1, (t, u)-> t*u);

        System.out.println(product);


    }

    //7)Create a method to find the max value from the list elements

    public static void getMaxEle01(List<Integer> list){
        //1.way:

      Integer max= list.stream().distinct().reduce(Integer.MIN_VALUE, (t, u)-> t>u? t:u);
        System.out.println(max);//131

    }
    public static void getMaxEle02(List<Integer> list){

       Integer max= list.stream().distinct().sorted().reduce(Integer.MIN_VALUE, (t, u)->u);

       //after using sorted () ele.s will be in ascending order.
        System.out.println(max);

    }

    //Homework
    //8) Create a method to find the minimum value from the list elements (In 2 ways).//==>just this is hw

    //9) Create a method to find the minimum value which is greater than 7 and even from the list.

    //1.way:
    public static void getMinGreaterThanSeven(List<Integer> list){

        Integer min= list.stream().distinct().filter(t->t%2==0).filter(t->t>7).reduce(Integer.MAX_VALUE, (t, u)-> t<u ? t: u);
        System.out.println(min);

    }
    //2.way:
    public static void getMinGreaterThanSeven02(List<Integer> list){

        Integer min= list.
                       stream().
                       distinct().
                       filter(t->t%2==0).
                       filter(t->t>7).
                       sorted(Comparator.reverseOrder()).
                       reduce(Integer.MAX_VALUE, (t, u)->u);

        System.out.println(min);

    }
    //3.way:
    public static void getMinGreaterThanSeven03(List<Integer> list){

        Integer min= list.stream().filter(t->t%2==0).filter(t->t>7).sorted().findFirst().get();

        System.out.println(min);

    }

    //10)Create a method to find the half of the elements which are distinct and greater than 5 in reverse order in the list

    public static void getHalfOfDistinctElementsInReverseOrder(List<Integer> list){

        List <Double> result= list.stream().distinct().filter(t->t>5).map(t->t/2.0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println(result);
    }






}

