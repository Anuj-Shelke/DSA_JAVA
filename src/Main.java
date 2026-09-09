public class Main {
    public static void main(String[] args) {
        int key  = 0 ;
        int[] arr = {1, 6, 5, 4, 3, 2, 2};
        int n = arr.length;
        for(int i = 1 ; i < n; i++){
            key = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > key ){
                arr[j+1] = arr[j];
                j--;

            }
            arr[j+1] = key ;
        }
        for (int j : arr) {
            System.out.printf("%d ",j);
        }
    }
}