package combinationsum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CombinationSum {
    public static List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list,new ArrayList<>(),nums,target,0);
        return list;
    }
    
    static private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, int remain, int start){
        if (remain<0) return;
        else if(remain==0) list.add(new ArrayList<>(tempList));
        else {
            for (int i=start;i<nums.length;i++){
                tempList.add(nums[i]);
                backtrack(list,tempList,nums,remain-nums[i],i);
                tempList.remove(tempList.size()-1); // Delete the last one and try next Combination 
            }
        }
    }

    public static void main(String[] args) {
        int[] candidates={2,3,6,7};
        int target = 7;
        List<List<Integer>> ans = combinationSum(candidates,target);
        System.out.print(ans);
    }
    
}
