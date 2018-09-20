
package sumofsquarenumbers;

import java.util.HashSet;
import java.util.Set;

public class SumofSquareNumbers {

    public static boolean judgeSquareSum(int c) {
        HashSet<Integer> set = new HashSet<Integer>();
        
        for (int i = 0; i <= Math.sqrt(c); i++) {
            set.add(i * i);
            if (set.contains(c - i * i)) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int c = 10000000;
        System.out.println(judgeSquareSum(c));
    }
    
}
