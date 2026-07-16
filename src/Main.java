//Program to search for an element in an 2D Array  ;
import java.util.*;
public class Main{
    public static void main(String[] args){


        int[][] arr = {{1,2,3},
                       {5,6,7},
                       {9,10,11}};
        int element = 10 ;
        int[] result = search(arr,element);
        System.out.println("The element is found at index "+Arrays.toString(result));
    }
    static int[] search(int[][] arr , int element ){
        for (int row = 0 ; row <arr.length; row++ ){
            for(int coln = 0 ; coln < arr[row].length; coln++){
                if(arr[row][coln] == element ){
                    return new int[]{row,coln};
                }
            }
        }
return new int[]{-1,-1};
    }
}