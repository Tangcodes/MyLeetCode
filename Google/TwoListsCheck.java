
package twolistscheck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TwoListsCheck {

    public static List<List<Integer>> listscheck(List<Integer> a,List<Integer> b){
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Map<Integer,Integer> amap = new HashMap<>();
        Map<Integer,Integer> bmap = new HashMap<>();
        for (int i=0;i<a.size();i++){
            amap.put(a.get(i), amap.getOrDefault(amap.get(a.get(i)), 0)+1);
        }
        for (int i=0;i<b.size();i++){
            bmap.put(b.get(i), bmap.getOrDefault(bmap.get(b.get(i)), 0)+1);
        }
        for (Integer i:amap.keySet()){
            if (!bmap.containsKey(i)) x.add(i);
            else {
                int diff = amap.get(i)-bmap.get(i);
                while(diff>0){
                    x.add(i);
                    diff--;
                }
            }
        }
        for (Integer i:bmap.keySet()){
            if (!amap.containsKey(i)) y.add(i);
            else {
                int diff = bmap.get(i)-amap.get(i);
                while(diff>0){
                    y.add(i);
                    diff--;
                }
            }
        }
        ans.add(x);
        ans.add(y);
        return ans;
    }
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1,2,2,2,3,5);
        List<Integer> b = Arrays.asList(1,2,3,4,5,5);
        System.out.println(listscheck(a,b));
    }
    
}
