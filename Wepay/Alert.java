package alert;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Alert {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(100);
        list.add(2);
        list.add(2);

        int windowSize = 2;
        System.out.println(alert(list, windowSize, 2));
    }
    
    // Start here
    // Complete the alert function below.
    static boolean alert(List<Integer> inputs, int windowSize, float allowedIncrease) {
        // Initialize data
        int[] nums = new int[inputs.size()-1];
        int n = nums.length;
        for (int i=0;i<inputs.size()-1;i++){
            nums[i] = inputs.get(i+1);
        }
        return isAlert(nums,windowSize,allowedIncrease);
    }

    static boolean isAlert(int[] nums, int s, float k){
        // Get the max for each window
        int[] maxs = maxInWindow(nums,s);

        //Get the average for each window
        double[] avgs = avgsInWindow(nums,s);

        // Check if value is more than the allowed increase above the window average
        // in ALL window
        for (int i=0;i<maxs.length;i++){
            boolean temp = true;
            for (int j=i;j<i+s && j<avgs.length;j++){
                if (maxs[i]/avgs[j]<=k){
                    temp = false;
                }
            }

            if (temp){
                return temp;
            }
        }

        // Check if any window's average is more than the acceptable increase
        // over any previous window's average value
        Double min = null;
        Double max = null;
        for (int i=0;i<maxs.length;i++){
            // Update min
            if (min==null || avgs[i]<min){
                min = avgs[i];
            }

            // Update max
            if (max==null || avgs[i]>max){
                max = avgs[i];
            }

            if (min!=null && max!=null && max/min>k){
                return true;
            }
        }
        // Default
        return false;
    }

    static int[] maxInWindow(int[] nums, int s){
        int n = nums.length;
        if(n==0 || s<=0) return new int[0];
        int[] res = new int[n-s+1];

        // Use Deque to store maxs
        Deque<Integer> queue = new ArrayDeque<>();
        for (int i=0;i<n;i++){
            // Check window range
            if (!queue.isEmpty() && queue.peek()<i-s+1){
                queue.pollFirst();
            }

            // Remove smaller numbers in window
            while(!queue.isEmpty() && nums[queue.getLast()]<nums[i]){
                queue.pollLast();
            }

            queue.offerLast(i);
            if (i>=s-1){
                res[i-s+1] = nums[queue.getFirst()];
            }
        }
        return res;
    }
    static double[] avgsInWindow(int[] nums,int s){
        int n = nums.length;
        double[] res = new double[n-s+1];
        int sum = 0;
        for (int i=0;i<n;i++){
            // Still in the window range
            if (i<=s-1){
                sum+=nums[i];
            }
            else{
                sum-=nums[i-s];
                sum+=nums[i];
            }

            if (i>=s-1){
                res[i-(s-1)] = (double)sum/(double)s;
            }
        }
        return res;
    }   
}
