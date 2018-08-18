package combinationsumii;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
    
    public static List<List<Integer>> combinationSum2(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list,new ArrayList<>(),nums,target,0);
        return list;
    }
    
    static private void backtrack(List<List<Integer>> list, List<Integer> templist, int[]nums,int remain,int start){
        if (remain<0) return;
        else if (remain==0) list.add(new ArrayList<>(templist));
        else {
            for (int i=start;i<nums.length;i++){
                if (i>start && nums[i]==nums[i-1])continue; // skip duplicates
                templist.add(nums[i]);
                backtrack(list, templist,nums,remain-nums[i],i+1);  // i->i+1
                templist.remove(templist.size()-1);
            }
        }  
    }
    
    public static void main(String[] args) {
        int[] candidates={2,5,2,1,2};
        int target = 5;
        List<List<Integer>> ans = combinationSum2(candidates,target);
        System.out.print(ans);
    }
    
}
