import javax.swing.*;
import java.sql.SQLOutput;
import java.util.*;
//Swap Array elements at a particular index
public class Main{
    public static void main(String[] args){
        int []arr = {1,2,3,4,5};
        int temp;
        System.out.println("Enter the number to swap ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the index at which you want to swap with ");
        int m  = sc.nextInt();

        for(int i = 0 ; i < 5 ; i++){
            temp = arr[n];
            arr[n] = arr[m];
            arr[m] = temp;

        }
        System.out.println(Arrays.toString(arr));


    }
}
