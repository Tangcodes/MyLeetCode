
package findanagrammappings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;


public class FindAnagramMappings {

    public static int[] anagramMappings(int[] A, int[] B) {
        int[] ans = new int[A.length];
        Map<Integer,Stack> map = new HashMap<>();
        for (int i=0;i<B.length;i++){
            if (!map.containsKey(B[i])){
                Stack<Integer> stack = new Stack<>();
                stack.add(i);
                map.put(B[i], stack);
            }
            else {
                map.get(B[i]).add(i);
            }
        }
        
        for (int i=0;i<A.length;i++){
            ans[i] = (int)map.get(A[i]).pop();
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int[] A = {12, 28, 46, 32, 50, 50};
        int[] B = {50, 12, 32, 50, 46, 28};
        //int[] A = {12,12};
        //int[] B = {12,12};
        System.out.println(Arrays.toString(anagramMappings(A,B)));
    }
}
