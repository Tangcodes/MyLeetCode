package partitiontokequalsumsubsets;

import java.util.Arrays;

public class PartitiontoKEqualSumSubsets {
    
    public static boolean search(int k, int start, int cursum, boolean[] visited, int[] nums, int target) {
        if (k==1) return true;
        if (cursum==target) return search(k-1,0,0,visited,nums,target);
        for (int i = start; i < nums.length; i++) {
            if (!visited[i]){
                visited[i]=true;
                if (search(k,i+1,cursum+nums[i],visited,nums,target)) return true;
                visited[i]=false;
            }
        }
        return false;
    }
    
    public static boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = Arrays.stream(nums).sum();
        if (sum % k > 0) return false;
        int target = sum / k;
        //Arrays.sort(nums);
        boolean[] visited = new boolean[nums.length];
        return search(k, 0, 0, visited, nums, target);
    }
        
    public static void main(String[] args) {
        int[]nums = {4,15,1,1,1,1,3,11,1,10};
        int k = 3;
        System.out.println(canPartitionKSubsets(nums,k));
    }
}
