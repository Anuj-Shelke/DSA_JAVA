import java.util.Scanner;

//Code to check if given number is a perfect Number  ;
public class Main{
    public static void main(String[] args){
        int factor_sum = 0 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check if it is a perfect Number  ");
        int n = sc.nextInt();
        for(int i = 1 ; i< n ; i++){
        if(n%i ==0){
            factor_sum = factor_sum + i ;
        }
        }
        System.out.println("The sum of the factors is "+factor_sum);
        if(factor_sum == n ){
            System.out.println("The given number is a perfect number ");
        }
        else{
            System.out.println("the number is not a perfect number ");
        }
    }
}