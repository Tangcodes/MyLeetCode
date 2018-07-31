
package mergeintervals;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class MergeIntervals {

    public List<Interval> merge(List<Interval> intervals) {
        int n = intervals.size();
        int[] start = new int[n];
        int[] end = new int[n];
        for(int i=0; i<n; i++){
            start[i] = intervals.get(i).start;
            end[i] = intervals.get(i).end;
        }
        Arrays.sort(start);
        Arrays.sort(end);
        List<Interval> result = new ArrayList();
        int laststart = 0;
        for(int i=0; i<n; i++){
            if(i==n-1 || start[i+1] > end[i]){
                result.add(new Interval(start[laststart], end[i]));
                laststart = i+1;
            }
        }
        return result;
    }
  

    public static void main(String[] args) {
        Interval a = new Interval(1,3);
        Interval b = new Interval(2,6);
        Interval c = new Interval(8,10);
        Interval d = new Interval(15,18);
        List<Interval> inter = new ArrayList<Interval>();
        inter.add(a);
        inter.add(b);
        inter.add(c);
        inter.add(d);
        List<Interval> ans = new MergeIntervals().merge(inter);
        System.out.println(ans.get(0).start);
        System.out.println(ans.get(0).end);
        System.out.println(ans.get(1).start);
        System.out.println(ans.get(1).end);
        System.out.println(ans.get(2).start);
        System.out.println(ans.get(2).end);
    }
    
}

class Interval{
        int start;
        int end;
        Interval() { start = 0; end = 0; }
        Interval(int s, int e) { start = s; end = e; }
}