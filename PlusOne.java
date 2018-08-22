
package plusone;

import java.util.Arrays;

public class PlusOne {
    
    public static int[] plusOne(int[] digits) {
        int len = digits.length;
        if (digits[len-1]==9){
            while (len>0 && digits[len-1]==9){
                digits[len-1]=0;
                len--;
            }
        
            if ((len-1)<0){
                int[] ansplus = new int[digits.length+1];
                ansplus[0]=1;
                for (int i=1;i<ansplus.length-1;i++) ansplus[i]=0;
                return ansplus;
            }
            digits[len-1]++;
        }
        else digits[len-1]++;
        return digits;
    }
    
    public static void main(String[] args) {
        int[] nums = {9};
        int[] ans = plusOne(nums);
        System.out.print(Arrays.toString(ans));
    }
}
