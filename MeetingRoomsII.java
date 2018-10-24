
package meetingroomsii;

import java.util.Arrays;
import java.util.Comparator;


public class MeetingRoomsII {

    public static class Interval {
        int start;
        int end;
        Interval() { start = 0; end = 0; }
        Interval(int s, int e) { start = s; end = e; }
    }
    
    public static int canAttendMeetings(Interval[] intervals) {
        int[] starts = new int[intervals.length];
        int[] ends = new int[intervals.length];
        for(int i=0; i<intervals.length; i++) {
            starts[i] = intervals[i].start;
            ends[i] = intervals[i].end;
        }
        Arrays.sort(starts);
        Arrays.sort(ends);
        int rooms = 0;
        int endsItr = 0;
        for(int i=0; i<starts.length; i++) {
            if(starts[i]<ends[endsItr])
                rooms++;
            else
                endsItr++;
        }
        return rooms;
    }

    public static void main(String[] args) {
        Interval[] i = new Interval[3];
        i[0]=new Interval(6,10);
        i[1]=new Interval(13,14);
        i[2]=new Interval(12,14);
        System.out.println(canAttendMeetings(i));
    } 
}
