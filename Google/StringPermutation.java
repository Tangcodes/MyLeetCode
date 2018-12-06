
package stringpermutation;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeSet;


public class StringPermutation {
    static TreeSet<String> combination = new TreeSet<String>();
    static PriorityQueue<String> queue = new PriorityQueue<>();
    private static void permutation(String prefix, String str) {
        int len = str.length();
        if (len == 0) {
            combination.add(prefix);
            queue.add(prefix);
        } else {
            for (int i = 0; i < len; i++) {
                String p = prefix + str.charAt(i);
                String s = str.substring(0, i) + str.substring(i + 1, len);
                permutation(p, s);
            }
        }
    }
    
    public static List<String> findPermutation(String s){
        permutation("", s);
        //List<String> ans = new ArrayList<>(combination);
        List<String> ans = new ArrayList<>(queue);
        return ans;
    }
    
    public static void main(String[] args) {
        String s = "ABCD";
        System.out.println(findPermutation(s));
    }
}
