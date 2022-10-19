package qbank;

public class p_30_q3 {

    public static void main(String[] args) {

      //  3. Which ones are true?
 String str = "Learn java, earn money";
System.out.println(str.replace("earn", "?")); //true
//
////Gives Compile Time Error because instead of 4 characters you cannot replace 1 character.
// String str2 = "Learn java, earn money";
// System.out.println(str.replace('Learn', '?'));
////Gives Compile Time Error==>yes the outcome CTE
// String str3= "Learn java, earn money";
//System.out.println(str.replace("Learn", '?'));
////Gives Compile Time Error==>yes the outcome CTE

String str4 = "Teach more, learn more";
System.out.println(str.replace("more", "less"));
//Prints Teach less, learn more on the console















    }








}
