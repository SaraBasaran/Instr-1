package practice;

public class Q03_IfStatement03 {

      /*
        	 	|| means "or": If you use "||" between 2 things it means at least 1 of them is enough for you
	 	               For example; "tea || coffee" means just tea, or just coffee, or both
	 	               To get false from || operation all must be false
	 	               true || true ==> true
	 	               true || false ==> true
	 	               false || true ==> true
	 	               false || false ==> false
	 	        	 Note: "|" checks both conditions.==> true | false ==> true
	                       "||" does not check the second condition, if first one is true
	                       "||" is faster than "|"

	      && means "and":  If you use "&&" between 2 things it means you want both.
	 	                For example; "tea && coffee" means I want both, just one of them will not be enough
	 	                To get true from && operation all must be true.
	 	                true && true ==> true
	 	                true && false ==> false
	 	                false && true ==> false
	 	                false && false ==> false
	 	& means "and":  If you use "&" between 2 things it means you want both.
	 	                For example; "tea & coffee" means I want both, just one of them will not be enough
	 	                To get true from && operation all must be true.
	 	                true & true ==> true
	 	                true & false ==> false
	 	                false & true ==> false
	 	                false & false ==> false
	 	Note: "&" and "&&" do the same but
	 		  "&&" does not check the second condition if the first condition is false.
	 		  "&" checks both conditions every time.
         */


    public static void main(String[] args) {

        System.out.println(5>4);
        System.out.println(5>4 || 4>5);
        System.out.println(5>4 && 4>5);
        System.out.println(5<4 || 3+4==7);
        System.out.println(5<4 && 3+4==7);

        //I want to buy a PC
        //I have cash and Credit Card

        boolean cash= false;
        boolean creditCard= false;

        if(cash || creditCard){
            System.out.println("I can buy a PC");

        }else{
            System.out.println("I can not buy a PC");
        }

        //I want to learn java
        //I have PC and I watch videos

        boolean havingPC= true;
        boolean watchingVideos= false;

        if(havingPC && watchingVideos){
            System.out.println("I can learn Java");
        }else {
            System.out.println("I cannot learn Java");
        }












    }







}
