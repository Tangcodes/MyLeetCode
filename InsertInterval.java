package insertinterval;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.LinkedList;

public class InsertInterval {
    
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> result = new ArrayList<>();
        int index = 0;
        while(index < intervals.size() && intervals.get(index).end < newInterval.start){
            result.add(intervals.get(index));
            index++;
        }
        while(index < intervals.size() && intervals.get(index).start <= newInterval.end ){
            newInterval.start = Math.min(intervals.get(index).start, newInterval.start);
            newInterval.end = Math.max(intervals.get(index).end, newInterval.end);
            index++;
        }
        result.add(newInterval);
        while(index < intervals.size()){
            result.add(intervals.get(index));
            index++;
        }
        return result;
    }


    public static void main(String[] args) {
        Interval a = new Interval(1,3);
        Interval b = new Interval(6,9);
        Interval c = new Interval(2,5);
        List<Interval> inter = new ArrayList<Interval>();
        inter.add(a);
        inter.add(b);

        List<Interval> ans = new InsertInterval().insert(inter, c);
        System.out.println(ans.get(0).start);
        System.out.println(ans.get(0).end);
        System.out.println(ans.get(1).start);
        System.out.println(ans.get(1).end);
    }
    
}

class Interval{
        int start;
        int end;
        Interval() { start = 0; end = 0; }
        Interval(int s, int e) { start = s; end = e; }
}