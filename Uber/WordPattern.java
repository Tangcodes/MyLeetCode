package wordpattern;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordPattern {

    public static boolean wordPattern(String p, String str) {
        String[] s = str.split(" ");
        if (p.length()!=s.length) return false;
        if (p.length()==0 || s.length==0) return false;
        Map<String,String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        for (int i=0;i<p.length();i++){
            if (!map.containsKey(p.substring(i, i+1)) && !set.contains(s[i])){
                map.put(p.substring(i,i+1),s[i]);
                set.add(s[i]);
            }
            else if (!map.containsKey(p.substring(i, i+1)) && set.contains(s[i])) return false;
            else {
                if (!map.get(p.substring(i, i+1)).equals(s[i]))return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        String p = "abba";
        String str = "dog cat cat dog";
        System.out.println(wordPattern(p,str));
    }
    
}
