package permutationsequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationSequence {

    public static String getPermutation(int n, int k) {
        List<Integer> nums = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i=1;i<=n;i++){
            nums.add(i);
        }
        
        int[] factorial = new int[n+1];
        int sum = 1;
        factorial[0] = 1;
        for(int i=1; i<=n; i++){
            sum *= i;
            factorial[i] = sum;
        }
        k--;

        for (int i=1;i<=n;i++){
            int quotient = k/factorial[n-i];
            sb.append(String.valueOf(nums.get(quotient)));
            nums.remove(quotient);
            k-=quotient*factorial[n-i];
        }
        return String.valueOf(sb);
    }
    
    public static void main(String[] args) {
        int n=4;
        int k=9;
        String ans = getPermutation(n,k);
        System.out.println(ans);
    }
    
}
