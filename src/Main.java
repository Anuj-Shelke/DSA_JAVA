import java.util.Scanner;

//Code to print factors of a given number ;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to know the factor of ");
        int n = sc.nextInt();
        for(int i = 1 ; i< n ; i++){
            if(n%i ==0 ){
                System.out.printf("%d\n",i);
            }

        }
    }
}