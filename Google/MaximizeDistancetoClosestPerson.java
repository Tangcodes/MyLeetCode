
package maximizedistancetoclosestperson;

import java.util.Arrays;


public class MaximizeDistancetoClosestPerson {

    public static int maxDistToClosest(int[] seats) {
        int[] dis = new int[seats.length];
        dis[0]=-1;
        for (int i=0; i<seats.length;i++){
            if (seats[i]==1) {
                dis[i]=-1;
            }
            else{
                if (i==0) {
                    continue;
                }
                dis[i] = dis[i-1]+1;
            }
        }
        
        for (int i=seats.length-2; i>=0;i--){
            if (dis[i]==-1) continue;
            else{
                dis[i] = dis[i+1]==-1? Math.min(1, dis[i]): Math.min(dis[i],dis[i+1]+1);
            }
        }
        Arrays.sort(dis);
        //return dis[dis.length-1]==-1?1:dis[dis.length-1];
        return dis[dis.length-1];
    }
    
    public static void main(String[] args) {
        int[] seats = {0,0,0,1};
        System.out.println(maxDistToClosest(seats));
    }
}
