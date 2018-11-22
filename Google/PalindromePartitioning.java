
package palindromepartitioning;

import java.util.ArrayList;
import java.util.List;


public class PalindromePartitioning {

    public static List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        if(s == null || s.length() == 0){
            return ans;
        }
        List<String> curr = new ArrayList<>();
        backTracking(s, 0, curr, ans);
        return ans;
    }
    
    private static void backTracking(String s, int index, List<String> curr, List<List<String>> ans){
        if(index == s.length()){
            ans.add(new ArrayList<>(curr));
            return;
        }
        for(int i = index + 1; i <= s.length(); i++){
            String currStr = s.substring(index, i);
            if(isPalindrome(currStr)){
                curr.add(currStr);
                backTracking(s, index + currStr.length(), curr, ans);
                curr.remove(curr.size() - 1);
            }
        }
    }
    
    private static boolean isPalindrome(String s){
        int left = 0, right = s.length() - 1;
        while(left <= right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    public static void main(String[] args) {
        String s = "aaab";
        System.out.println(partition(s));
    }
    
}
