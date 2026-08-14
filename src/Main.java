import java.util.ArrayList;
import java.util.Scanner;

// 1929. Concatenation of Array LeetCode
public class Main{
    public int[] getConcatenation(int[] nums){
        int []arr = new int[nums.length*2];
        for(int i = 0 ; i < nums.length ; i++){
            arr[i] = nums[i];
            arr[i+nums.length] = nums[i];
        }
        return arr;
    }
    public static void main(String[] args){
        Main g1 = new Main();
        int arr[]={1,2,3,4,5,6,7};
        int arr1[] = g1.getConcatenation(arr);
        for(int i = 0 ; i < arr1.length ; i++){
            System.out.println(arr1[i]);
        }

    }
}