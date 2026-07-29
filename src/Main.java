import java.util.Scanner;

//Code to print the Result of power and base   ;
public class Main{
    public static void main(String[] args){
        System.out.println("Enter the value of base ");
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt() ;
        System.out.println("Enter the value of power ");
        int power = sc.nextInt();
        int result = 1;
        for(int i = 0 ; i < power ; i++){
            result  = result * base ;
        }
        System.out.println("The result is "+result);
    }
}