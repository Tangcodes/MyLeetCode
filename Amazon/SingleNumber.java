package singlenumber;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SingleNumber {
    
    public static int singleNumber(int[] nums) {
        /*
        Arrays.sort(nums);
        int ans=0;
        for (int i=0;i<nums.length;i++){
            if(i%2==0) ans+=nums[i];
            else ans-=nums[i];
        }
        return ans;
        */
    int ans =0;
    for(int i=0;i<nums.length;i++) ans ^= nums[i];
    return ans;
    }
    
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        int ans = singleNumber(nums);
        System.out.println(ans);
        
    }
    
}
