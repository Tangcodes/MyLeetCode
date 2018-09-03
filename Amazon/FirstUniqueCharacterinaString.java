package firstuniquecharacterinastring;

import java.util.LinkedList;
import java.util.Queue;

public class FirstUniqueCharacterinaString {
    
    public static int firstUniqChar(String s) {
        if (s==null || s.length()==0) return -1;
        int len = s.length();
        int[] freq = new int[26];
        for (int i=0;i<len;i++){
            freq[s.charAt(i)-'a']++;
        }
        for (int i=0;i<len;i++){
            if (freq[s.charAt(i)-'a']==1){
                return i;
            }
        }
        
        return -1;
    }
    public static void main(String[] args) {
        String s = "loveleetcode";
        int ans = firstUniqChar(s);
        System.out.println(ans);
    }
    
}
