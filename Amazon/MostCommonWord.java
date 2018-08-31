package mostcommonword;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MostCommonWord {
    
    public static String mostCommonWord(String p, String[] b) {
        if (p=="") return "";
        //String pclear = p.replaceAll("\\p{Punct}","");
        p = p.toLowerCase();
        p = p.replaceAll("[!?',;.]","");
        String[] pseg = p.split(" ");
        Map<String,Integer> map = new HashMap<>();
        for (int i=0;i<b.length;i++){
            map.put(b[i], -1000);
        }
        for (int i=0;i<pseg.length;i++){
            int count = map.containsKey(pseg[i]) ? map.get(pseg[i]) : 0;
            map.put(pseg[i], count + 1);
        }
        Collection<Integer> c = map.values();
        Object[] obj = c.toArray();
        Arrays.sort(obj);
        int max = (Integer)obj[obj.length-1];
        
        Set<String> kset=map.keySet();
        String ans="";
        for(String ks:kset){
            if(map.get(ks)==max) ans=ks;
        }
        return ans;
    }
        
    
    public static void main(String[] args) {
        String paragraph="Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};
        String ans = mostCommonWord(paragraph,banned);
        System.out.println(ans);
    }
    
}
