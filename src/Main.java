import java.util.Scanner;

//Code to print factorial  of a given number ;
public class Main{
    public static void main(String[] args){
        int fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to know the factor of ");
        int n = sc.nextInt();
        for(int i = 1 ; i< n ; i++){
        fact = fact * i;
        }
        System.out.printf("The factorial of given number is %d",fact);
    }
}