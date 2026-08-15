//1365. How Many Numbers Are Smaller Than the Current Number
public class Main{
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int []arr = new int[nums.length];


        for(int i = 0 ; i < nums.length ; i++){
            int count = 0;
            for(int j = 0 ; j < nums.length ; j++){

                if(nums[i]>nums[j]){
                    count++;

                }
                else{
                    continue;
                }
                arr[i] = count;

            }

        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr ={1,2,3,4,5};
        int[] arr_1 = smallerNumbersThanCurrent(arr);
        for(int i = 0 ; i < arr_1.length ; i++){
            System.out.println(arr_1[i]);
        }
    }
}
