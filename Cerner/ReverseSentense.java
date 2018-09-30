
package reversesentense;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class ReverseSentense {

    public static String reverseSentense(String s){
        /* 方法1
        String[] words = s.trim().split(" +");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
        */
        
        String[] strs = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = strs.length - 1; i > -1; i--){
            if(strs[i].isEmpty())
                continue; //如果split(" +") 这两行就没必要了
            sb.append(strs[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
    
    public static void main(String[] args) {
        String s = "This is an    interview question";
        System.out.println(reverseSentense(s));
    }
    
}
