package maximumsubarray;

public class MaximumSubarray {
    
    public static int maxSubArray(int[] nums) {
        int maxSoFar=nums[0];
        int maxEndHere = nums[0];
        for (int i=1;i<nums.length;i++){
            maxEndHere = Math.max(maxEndHere+nums[i], nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndHere);
        }
        return maxSoFar;
    }
    
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int ans = maxSubArray(nums);
        System.out.println(ans);
    }
    
}
