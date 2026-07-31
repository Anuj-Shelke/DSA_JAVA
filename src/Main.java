import java.util.*;
//Code to print 1 to 5 and 5 to 1 using recursion
public class Main{
    static void func(int n ){
        if(n==0){
            return ;
        }
        System.out.println(n);
        func(n-1);
        System.out.println(n);
    }
    public static void main(String[] args ) {
        func(5);
    }
}