import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        int[] arr ={1,3,2,5,2};
        int result = cyclic_sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(result );


    }
    static int cyclic_sort(int[] arr){
        int i = 0 ;
        while(i < arr.length){
            int correct = arr[i]-1;
            if(arr[correct]!=arr[i]){
                swap(arr,i,correct);
            }
            else {
                if (i!=correct ) {
                    return arr[i];
                }
                i++;
            }


        }
        return -1;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first] ;
        arr[first ]= arr[second];
        arr[second] = temp;
    }
}