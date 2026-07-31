import java.util.*;
//Code to Print sum of digits of a number No recursion approach first  ;
public class Main{

    public static void main(String[] args ) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to add digits of ");
        int num = sc.nextInt();
        int num2 = num ;
        int r = 0;

        while(num >  0) {
            r =r + (num%10);
            System.out.println("The digits are "+r);
            num  = num/10;

        }
        int r1 = 0 ;
        System.out.println("The addition of the digits is "+r);
        while(num2 > 0) {
            r1 = r1 * 10 + (num2 % 10);
            num2 = num2/10;

        }
        System.out.println("The reverse of the digit is "+r1);


    }
}