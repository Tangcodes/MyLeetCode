
package reversesentense;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ReverseSentense {

    public static String reverseSentense(String s){
        String[] sl = s.split(" ");
        String ans = "";
        StringBuffer sb = new StringBuffer("");
        for (int i=sl.length-1;i>=0;i--){
            ans+=sl[i]+" "; //更快可以用StringBuffer
            sb.append(sl[i]).append(" ");
        }
        //return ans;
        return sb.toString();
    }
    
    public static void main(String[] args) {
        String s = "This is an interview question";
        System.out.println(reverseSentense(s));
    }
    
}
