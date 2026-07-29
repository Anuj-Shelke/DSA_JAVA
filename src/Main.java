//Program to check if a number is palindrome  ;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter number to reverse ");
        int temp= 0 ;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int save =n ;
        while(n!= 0 ){
            temp = temp*10+(n%10);
            n = n/10;
        }
        System.out.println("The reverse of the number is "+temp);
        if(save == temp){
            System.out.println("The number is a palindrome ");
        }
        else{
            System.out.println("The number is not a palindrome ");
        }
    }

}
