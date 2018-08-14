package removeduplicatesfromsortedarray;

public class RemoveDuplicatesfromSortedArray {

    public static int removeDuplicates(int[] nums) {
        int len=nums.length;
        int n=0;
        for (int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                n++;
                len--;
            }
            else{
                nums[i-n]=nums[i];
            }
        }
        return len;
    }
    
    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        //int[] nums = new int[]{1,1};
        //int[] nums = new int[]{1,2};
        //int[] nums = new int[]{1,2,2};
        int n=removeDuplicates(nums);
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i]);
        }
    }
}
