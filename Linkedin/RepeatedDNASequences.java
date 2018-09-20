
package repeateddnasequences;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class RepeatedDNASequences {

    public static List<String> findRepeatedDnaSequences(String s) {
        Set seen = new HashSet(), repeated = new HashSet();
        for (int i = 0; i + 9 < s.length(); i++) {
            String ten = s.substring(i, i + 10);
            if (!seen.add(ten))
                repeated.add(ten);
        }
        return new ArrayList(repeated);
    }
    
    public static void main(String[] args) {
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        List<String> ans = findRepeatedDnaSequences(s);
        System.out.println(ans);
    }
    
}
