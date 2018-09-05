package reversestring;

import java.util.Stack;

public class ReverseString {

    public static String reverseString(String s) {
        
        if (s==null || s.length()==1) return s;
        /*
        Stack<Character> stack = new Stack<>();
        for (char c:s.toCharArray()){
            stack.push(c);
        }
        char[] ss = new char[s.length()];
        for (int i=0;i<s.length();i++){
            ss[i]=stack.pop();
        }
        String ans = String.valueOf(ss);
            
        return ans;
        */
        int left = 0;
        int right =s.length()-1;
        char[] ss = s.toCharArray();
        while (left<right){
            char temp = ss[right];
            ss[right]=ss[left];
            ss[left] = temp;
            left++;
            right--;
        }
        return String.valueOf(ss);
    }
    
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String ans = reverseString(s);
        System.out.println(ans);
    }
    
}
