
package uniquemorsecodewords;

import java.util.HashSet;
import java.util.Set;


public class UniqueMorseCodeWords {

    public static int uniqueMorseRepresentations(String[] words) {
        String[] Morse  = {".-","-...","-.-.","-..",".","..-.","--.","....","..",
                           ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
                           "...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();
        int ans = 0;
        for (int i=0;i<words.length;i++){
            String s = "";
            for (char c : words[i].toCharArray()){
                s+=Morse[c-'a'];
            }
            set.add(s);
        }
        return set.size();
    }
    
    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig", "msg"};
        System.out.println(uniqueMorseRepresentations(words));
    }
}
