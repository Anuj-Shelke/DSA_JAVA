//Program to Enter Base and power and enter their result  ;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int count = 0;
        int temp = 1;
        System.out.println("Enter base ");
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        System.out.println("Enter power ");
        int power = sc.nextInt();
        while(count != power){
            temp = temp *base ;
            count++;

        }
        System.out.printf("The result is %d",temp);
    }

}
