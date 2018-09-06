
package missingnumber;

import java.util.Arrays;


public class MissingNumber {

    public static int missingNumber(int[] nums) {
        /*
        if (nums.length==1 && nums[0]==0) return 1;
        if (nums.length==1 && nums[0]==1) return 0;
        Arrays.sort(nums);
        for (int i=0;i<nums.length;i++){
            if (nums[i]!=i) return i;
        }
        return nums.length;
        */
        int expectedSum = nums.length*(nums.length + 1)/2;
        int actualSum = 0;
        for (int num : nums) actualSum += num;
        return expectedSum - actualSum;
    
    }
    
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        int ans = missingNumber(nums);
        System.out.println(ans);
    }
    
}
