//26. Remove Duplicates from Sorted Array
public class Main {
    public static int removeDuplicates(int[] nums) {
        int i = 0 ;
        for(int j = 1; j < nums.length; j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i;
    }
    public static void main(String[] args){
        int nums[] ={1,1,2,2,3,4,5};
        int re = removeDuplicates(nums);
        System.out.println(re);
    }
}
