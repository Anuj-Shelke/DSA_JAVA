import java.util.*;
public class Main{
    public static void main(String[] args ){
        System.out.println("Enter a number to reverse : \n");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digit = 0;
        while(num > 0){
            digit = (digit*10)+(num%10);
            num = (num/10);
        }
        System.out.println("The reverse of the number "+digit);
    }
}