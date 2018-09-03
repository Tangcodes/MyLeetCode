package wordladder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WordLadder {

    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (!wordList.contains(endWord)) {
            return 0;
        }
        Set<String> dict = new HashSet<>(wordList);  //Make it faster
        Set<String> beginSet = new HashSet<String>(), endSet = new HashSet<String>();
        
	int len = 1;
	int strLen = beginWord.length();
	HashSet<String> visited = new HashSet<String>();
        beginSet.add(beginWord);
	endSet.add(endWord);
        while (!beginSet.isEmpty() && !endSet.isEmpty()){
            if (beginSet.size()>endSet.size()){ //需要beginSet更小
                Set<String> set = beginSet;
                beginSet=endSet;
                endSet=set;
            }
            Set<String> temp = new HashSet<String>();
            for (String word:beginSet){
                char[] chs  = word.toCharArray();
                for (int i=0;i<chs.length;i++){
                    for (char c = 'a';c<='z';c++){
                        char old = chs[i];
                        chs[i]=c;
                        String target = String.valueOf(chs);
                        if (endSet.contains(target)){
                            return len+1;
                        }
                        
                        if (!visited.contains(target) && dict.contains(target)){
                            temp.add(target);
                            visited.add(target);
                        }
                        chs[i] = old;
                    }

                }
            }
            beginSet = temp;
            len++;
        } 
        return 0;
    }
        
    
    public static void main(String[] args) {
        String b = "hit";
        String e = "cog";
        List<String> w = new ArrayList<>();
        w.add("hot");
        w.add("dot");
        w.add("dog");
        w.add("lot");
        w.add("log");
        w.add("cog");
        int ans = ladderLength(b,e,w);
        System.out.println(ans);
    }
    
}
