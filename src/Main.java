import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("Enter the number you want to print the table of ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 10; i >0  ; i--){
            System.out.println("the reverse table of "+n+"*"+i+" = "+i*n);
        }

    }
}