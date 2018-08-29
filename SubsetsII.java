package subsetsii;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class SubsetsII {

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        helper(ans,new ArrayList<>(),nums,0);
        return ans;
    }
    
    public static void helper(List<List<Integer>> ans,List<Integer> list,int[]nums,int start){
        //List<Integer> temp = new ArrayList<>(list);
        //Collections.sort(temp);
        ans.add(new ArrayList<>(list));
        //if (!ans.contains(temp))ans.add(new ArrayList<>(temp));
        for (int i=start;i<nums.length;i++){
            if(i > start && nums[i] == nums[i-1]) continue;
            list.add(nums[i]);
            helper(ans,list,nums,i+1);
            list.remove(list.size()-1);
        }
    }
    
    public static void main(String[] args) {
        int[] nums = {4,4,4,1,4};
        List<List<Integer>> ans = subsetsWithDup(nums);
        System.out.println(ans);
    }
    
}
