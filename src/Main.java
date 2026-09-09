import java.util.*;
public class Main{
    public static void main(String[] args){
        int found = 0;
        int [] arr = {1,2,3,4,5,6};
        System.out.println("Enter the element to search for ");
        Scanner sc = new Scanner(System.in);
        int element = sc.nextInt();
        int end = arr.length-1;
        int start = 0 ;
        while(end>= start){
            int mid = (end+start)/2;
            if(arr[mid] == element ){
                System.out.printf("The element is found at index %d",mid);
                found = 1;
                break;

            }
            else if(arr[mid] < element){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        if(found == 0){
            System.out.println("The element is not their  ");
        }
    }

}