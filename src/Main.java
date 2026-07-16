//Program to search for the minimum element ;
import java.util.*;
public class Main{
    public static void main(String[] args){


        int [] arr = {1,2,3,4,-1,6,7,8,9};
        search_min(arr);

    }
    static void search_min(int[] arr ){
        int min = 0 ;
        if(arr.length == 0 ){
            System.out.println("The Array is empty ");
        }
        for(int i = 1 ; i< arr.length; i++ ){

            if(min > arr[i]){
                min = arr[i];
            }

        }
        System.out.println("The min element of the array is "+min);

    }
}