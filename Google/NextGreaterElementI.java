
package nextgreaterelementi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;


public class NextGreaterElementI {

    public static int[] nextGreaterElement(int[] findNums, int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(); // map from x to next greater element of x
        Stack<Integer> stack = new Stack<>();
        for (int num : nums) {
            while (!stack.isEmpty() && stack.peek() < num)
                map.put(stack.pop(), num);
            stack.push(num);
        }   
        for (int i = 0; i < findNums.length; i++)
            findNums[i] = map.getOrDefault(findNums[i], -1);
        return findNums;
    }
    public static void main(String[] args) {
        int[] s = {4,1,2};
        int[] t = {1,3,4,2};
        System.out.println(Arrays.toString(nextGreaterElement(s,t)));
    }
}
