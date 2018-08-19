package firstmissingpositive;

import java.util.Arrays;

public class FirstMissingPositive {
    
    public static void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    public static int firstMissingPositive(int[] nums) {
        if(nums.length == 0) return 1;
        for(int i = 0; i < nums.length; i++) {
            while(nums[i] > 0 && nums[i] <= nums.length && nums[nums[i]-1] != nums[i] ) {
                swap(i,nums[i]-1,nums);
            }
        }
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != i+1)
                return i+1;
        }
        return nums.length+1;
    } 
    
    public static void main(String[] args) {
        int[] nums  = new int[]{6,4,1,5,8,9,7};
        int ans = firstMissingPositive(nums);
        System.out.println(ans);
    }
    
}
