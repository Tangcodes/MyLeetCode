package valid.parentheses;
import java.util.Stack;


public class ValidParentheses {
    public static boolean isValid(String s) {
        int len = s.length();
        Stack<Character> str = new Stack<Character>();
        for (int i=0;i<len;i++){
            if (s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{') str.push(s.charAt(i));
            else if (s.charAt(i)==')' && str.peek()=='(' && !str.empty())str.pop();
            else if (s.charAt(i)==']' && str.peek()=='[' && !str.empty())str.pop();
            else if (s.charAt(i)=='}' && str.peek()=='{' && !str.empty())str.pop();
            else return false;
        }
        return str.empty();
        
    }

    public static void main(String[] args) {
        String s = "()";
        boolean ans = isValid(s);
        System.out.print(ans);
    }
    
}
