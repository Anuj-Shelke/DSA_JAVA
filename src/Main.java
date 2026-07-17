//Code for Order_Agnostic Binary Search ;
import java.util.*;
public class Main{
    public static void main(String[] args){
//        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] arr= {9,8,7,6,5,4,3,2,1};
        int target = 9;
        int result=  binary_search(arr, target) ;
        System.out.println("The element is found at index : "+result);
    }
    static int  binary_search(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        boolean isascending = (arr[start] < arr[end]);


        while(start <= end){

            int mid = start+(end-start)/2;
            if(arr[mid] == target){
                return mid ;
            }
            if(isascending) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else
                {
                    end = mid - 1;
                }
            }
            else{
                if (arr[mid] > target) {
                    start = mid + 1;
                } else
                {
                    end = mid - 1;
                }

            }

        }
        return -1;

    }
}