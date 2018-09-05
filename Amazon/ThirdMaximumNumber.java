package thirdmaximumnumber;

import java.util.Arrays;
import java.util.PriorityQueue;

public class ThirdMaximumNumber {

    public static int thirdMax(int[] nums) {
        if (nums.length==1) return nums[0];
        else if(nums.length==2) return Math.max(nums[0], nums[1]);
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) {
            if (pq.size() < 3 && !pq.contains(num)) {
                pq.add(num);
                //continue;
            } else if (num > pq.peek() && !pq.contains(num)) {
                pq.poll();
                pq.add(num);
            }
        }
        
        if(pq.size() < 3) {
            while(pq.size() != 1) pq.poll();
        }
        
        return pq.peek();
    }
    
    public static void main(String[] args) {
        int[] nums = {3,2,1};
        int ans = thirdMax(nums);
        System.out.println(ans);
    }
    
}
