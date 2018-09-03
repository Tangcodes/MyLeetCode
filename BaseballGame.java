package baseballgame;

import java.util.Stack;

public class BaseballGame {
    
    public static int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        int sum=0;
        for (int i=0;i<ops.length;i++){
            if (ops[i].charAt(0)=='-' || (ops[i].charAt(0)>='0' && ops[i].charAt(0)<='9')){     // It is number
                int num = Integer.parseInt(ops[i]);
                stack.add(num);
                sum+=num;
            }
            else {
                char ch = ops[i].charAt(0);
                if (ch=='+'){
                    int second = stack.pop();
                    int first = stack.pop();
                    int point = first+second;
                    sum+=point;
                    stack.add(first);
                    stack.add(second);
                    stack.add(point);
                }
                else if (ch=='C'){
                    sum-=stack.pop();
                }
                else if (ch=='D'){
                    int point = stack.peek()*2;
                    stack.add(point);
                    sum+=point;
                }
            }
        }
        
        return sum;
    }
    
    public static void main(String[] args) {
        String[] ops = {"5","-2","4","C","D","9","+","+"};
        int ans = calPoints(ops);
        System.out.println(ans);
    }
    
}
