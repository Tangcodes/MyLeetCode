package foursum;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class FourSum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            if (nums[i] * 4 > target) break; // Too Big;
            if (nums[i] + 3 * nums[nums.length - 1] < target) continue; // Too small;
            int remaning3 = target - nums[i];
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                if(nums[j]*3>remaning3) break;//Too Big
                if(nums[j]+2*nums[nums.length-1]<remaning3) continue;// Too Small
                int remaning2 = remaning3 - nums[j];
                int l = j + 1;
                int r = nums.length - 1;
                while (l < r) {
                    if (nums[l] + nums[r] == remaning2) {
                        List<Integer> list = new ArrayList<Integer>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[l]);
                        list.add(nums[r]);
                        result.add(list);
                        l++;
                        r--;
                        while (l < r && nums[l] == nums[l - 1]) {
                            l++;
                        }
                        while (l < r && nums[r] == nums[r + 1]) {
                            r--;
                        }
                    } else if (nums[l] + nums[r] > remaning2) {
                        r--;
                    } else {
                        l++;
                    }
                }
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        //int[] nums =new int[]{1,0,-1,0,-2,2};
        int[] nums =new int[]{0,0,0,0};
        int target =0;
        List<List<Integer>> ans = FourSum.fourSum(nums, target);
        int N=ans.size();
        for(int i=0;i<N;i++){
            System.out.println(ans.get(i));
        }
    }
    
}
