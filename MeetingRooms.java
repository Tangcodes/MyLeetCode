
package meetingrooms;

import java.util.Arrays;
import java.util.Comparator;


public class MeetingRooms {

    public static class Interval {
        int start;
        int end;
        Interval() { start = 0; end = 0; }
        Interval(int s, int e) { start = s; end = e; }
    }
    
    public static boolean canAttendMeetings(Interval[] intervals) {
        Arrays.sort(intervals,new Comparator<Interval>(){
            public int compare(Interval i1,Interval i2){
                if (i1.start==i2.start) return i1.end-i2.end;
                else return i1.start-i2.start;
            }
        });
        for (int i=1;i<intervals.length;i++){
            if (intervals[i].start<intervals[i-1].end) return false;    
        }
        return true;
    }

    public static void main(String[] args) {
        Interval[] i = new Interval[3];
        i[0]=new Interval(0,5);
        i[1]=new Interval(0,5);
        i[2]=new Interval(10,20);
        System.out.println(canAttendMeetings(i));
    } 
}
