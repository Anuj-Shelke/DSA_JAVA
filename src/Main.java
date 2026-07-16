//Program for linear search of elements ;
import java.util.*;
public class Main{
    public static void main(String[] args){
        System.out.println("Enter the element to search in the array ");
        Scanner sc = new Scanner(System.in);
        int element = sc.nextInt();
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int result = search(arr,element);
        System.out.println("The array element "+element+" is found at index : "+result);

    }
    static int search(int[] arr, int target ){
        if(arr.length == 0 ){
            return -1;
        }
        for(int i = 0 ; i< arr.length; i++ ){
            if(arr[i] == target){
                return i;
            }

        }
        return -1;
    }
}