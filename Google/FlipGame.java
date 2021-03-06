
package flipgame;

import java.util.ArrayList;
import java.util.List;


public class FlipGame {
    
    public static List<String> generatePossibleNextMoves(String s) {
        List<String> list = new ArrayList<String>();
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '+' && s.charAt(i - 1) == '+') {
                list.add(s.substring(0, i - 1) + "--" + s.substring(i + 1, s.length()));
            }
        }
        return list;
    }
    
    public static void main(String[] args) {
        String s = "++";
        System.out.println(generatePossibleNextMoves(s));
    }
    
}
