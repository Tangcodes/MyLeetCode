package permutationsii;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsII {
    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        addList(ans,new ArrayList<>(),nums,new boolean[nums.length]);
        return ans;
    }
    
    public static void addList(List<List<Integer>> ans, List<Integer> templist, int[] nums, boolean[] used){
        if (templist.size()==nums.length){
            ans.add(new ArrayList<>(templist));
        }
        else{
            for (int i=0;i<nums.length;i++){
                if(used[i] || i > 0 && nums[i] == nums[i-1] && !used[i - 1]) continue;
                used[i]=true;
                templist.add(nums[i]);
                addList(ans,templist,nums,used);
                used[i]=false;
                templist.remove(templist.size() - 1);
            }
        }
    }
    
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        List<List<Integer>> ans = permuteUnique(nums);
        System.out.println(ans);
    }
    
}
