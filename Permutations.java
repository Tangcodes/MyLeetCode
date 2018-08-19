package permutations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {
    
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        addList(ans,new ArrayList<>(),nums);
        return ans;
    }
    
    public static void addList(List<List<Integer>> ans, List<Integer> templist, int[] nums){
        if (templist.size()==nums.length){
            ans.add(new ArrayList<>(templist));
        }
        else{
            for (int i=0;i<nums.length;i++){
                if(templist.contains(nums[i])) continue;
                templist.add(nums[i]);
                addList(ans,templist,nums);
                templist.remove(templist.size() - 1);
            }
        }
    }
    
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> ans = permute(nums);
        System.out.println(ans);
    }
}
