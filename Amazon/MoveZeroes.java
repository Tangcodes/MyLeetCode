package movezeroes;

import java.util.Arrays;


public class MoveZeroes {

    public static void moveZeroes(int[] nums) {
        /*
        int zeroDir = 0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]!=0){
                int temp = nums[zeroDir];
                nums[zeroDir] = nums[i];
                nums[i]=temp;
                zeroDir++;
            }
        }
        */
        if (nums == null || nums.length == 0) return;        

        int insertPos = 0;
        for (int num: nums) {
            if (num != 0) nums[insertPos++] = num;
        }        

        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }
    
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        System.out.print(Arrays.toString(nums));
    }
    
}
