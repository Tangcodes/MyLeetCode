package houserobber;

public class HouseRobber {

    public static int rob(int[] nums) {
        int line1=0;
        int line2=0;
        int len = nums.length;
        for (int i=0;i<len;i++){
            if (i%2==0)
            {
            line1 = Math.max(line1+nums[i], line2);
            }
            else
            {
            line2 = Math.max(line1, line2+nums[i]);
            }
        }
        return Math.max(line1, line2);
    }
    
    public static void main(String[] args) {
        int[] nums = {2,1,1,1,1,2};
        System.out.println(rob(nums));
    }
}
