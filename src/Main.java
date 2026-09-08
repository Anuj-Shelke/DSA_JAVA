import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class Main{
    public static void main(String[] args){
       int []arr = {1,2,3,4,5,6};
       System.out.println("Enter the Element You Want to Search For ");
       Scanner sc = new Scanner(System.in);
       int found = 0 ;
       int element = sc.nextInt();
       for(int i = 0 ; i < arr.length; i++ ){
           if(arr[i] == element){
               System.out.println("Element is found at index "+i);
               found = 1;
           }

           }

        if(found != 1  ) {
            System.out.println("The element is not found ");
        }
       }

    }
