import java.util.*;
//Code to print Factorial of a number using recursion
public class Main{

    public static void main(String[] args ) {
        int result = fact(5);
        System.out.println("The factorial of number is "+result);
    }

    static int  fact(int n ){
        if(n==1){
            return 1 ;
        }
         return n * fact(n-1);



    }
}