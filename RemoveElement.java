package removeelement;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int len=nums.length;
        int j=0;
        int k=0;
        for (int i=0;i<len;i++){
            if(nums[i]==val){
                k++;
            }
            else {
                j++;
                nums[i-k]=nums[i];
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        int val = 2;
        int len = removeElement(nums,val);
        for (int i=0;i<len;i++){
            System.out.print(nums[i]);
        }
    }
    
}
