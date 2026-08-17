import java.util.Scanner;

public class Main{
    public static int pali(int num) {
        int temp = 0 ;
        int dum = num;
        while (dum > 0) {
           temp = temp*10+dum%10;
           dum = dum/10;

        }
        return temp;
    }
    public static void main(String[] args){
        System.out.println("Enter the number to check if it is palindrome");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = pali(a);
        if(a == b){
            System.out.println("The number is a palindrome");
        }
        else{
            System.out.println("Not a pali ");
        }
    }
}