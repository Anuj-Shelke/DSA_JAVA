//Program For demonstrating Recursion ;

public class Main {
    public static void main(String[] args) {
       int result =  fabonacci(4 );
        System.out.println(result);
    }
    public static int  fabonacci(int n){
        if(n < 2){
            return n ;
        }
        return fabonacci(n-2)+fabonacci(n-1);

    }
}