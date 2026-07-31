import java.util.*;
//Code to print Factorial of a number using recursion
public class Main{

    public static void main(String[] args ) {
        int result = sum(2);
        System.out.println("The Sum of given natural number is :  "+result);
    }

    static int  sum(int n ){
        if(n==1){
            return 1 ;
        }
         return n + sum(n-1);



    }
}