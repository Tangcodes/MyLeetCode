package happynumber;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    
    public static boolean isHappy(int n) {
    Set<Integer> inLoop = new HashSet<Integer>();
    int squareSum,remain;
	while (inLoop.add(n)) {
		squareSum = 0;
		while (n > 0) {
		    remain = n%10;
			squareSum += remain*remain;
			n /= 10;
		}
		if (squareSum == 1)
			return true;
		else
			n = squareSum;

	}
	return false;

    }
    
    public static void main(String[] args) {
        int n = 19;
        boolean ans = isHappy(n);
        System.out.println(ans);
    }
    
}
