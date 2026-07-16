//Program to find Maximum Element in an array
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int [] arr = {1,2,10,7,5,6};
        int max = 0 ;
        for(int i = 0 ; i< 5 ; i++ ){

            if(max< arr[i+1]){
                max = arr[i];
            }

        }
        System.out.println("The Maximum element of the array is "+max);

    }
}