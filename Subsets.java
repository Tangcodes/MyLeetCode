package subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Subsets {
    
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        subset(ans,new ArrayList<>(),0,nums);
        return ans;
    }
    
    public static void subset(List<List<Integer>> ans,List<Integer> list,int start,int[]nums){
        ans.add(new ArrayList<Integer>(list));
        for (int i=start;i<nums.length;i++){
            list.add(nums[i]);
            subset(ans,list,i+1,nums);
            list.remove(list.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> ans = subsets(nums);
        System.out.print(ans);
    }
    
}
