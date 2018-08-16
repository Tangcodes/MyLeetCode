package searchinsertposition;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int len = nums.length;
        int i=0;
        while (i<len){
            if (nums[i]==target)return i;
            if (nums[i]>target)return i;
            i++;
        }
        return len;
    }
    
    public static void main(String[] args) {
        int[] nums={1,3,5,6};
        int target = 0;
        int ans = searchInsert(nums,target);
        System.out.print(ans);
    }
    
}
