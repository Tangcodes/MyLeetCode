package combinations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combinations {
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        combine (res,new ArrayList<Integer>(),1,n,k);
        return res;
    }
    public static void combine(List<List<Integer>> combs, List<Integer> comb, int start, int n, int k) {
        if(k==0) {
            combs.add(new ArrayList<Integer>(comb));
            return;
	}
	for(int i=start;i<=n;i++) {
            comb.add(i);
            combine(combs, comb, i+1, n, k-1);
            comb.remove(comb.size()-1);
	}
    }
    
    public static void main(String[] args) {
        int n=4;
        int k=2;
        List<List<Integer>> ans = combine(n,k);
        System.out.print(ans);
    }
}
