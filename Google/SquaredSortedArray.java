
package squaredsortedarray;

import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;


public class SquaredSortedArray {

    public static int[] square(int[] A){
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        Set<Integer> set = new HashSet<>();
        for (int num:A){
            if (set.add(num*num)) queue.add(num*num);
        }
        int[] ans = new int[queue.size()];
        for (int i = 0;i<ans.length;i++){
            ans[i]=queue.poll();
        }
        return ans;
    }
    
    public static int[] arr(int []arr){
       int n = arr.length;
       int l=0,r=n-1,index=n-1;
       int[] temp = new int[n];
       while(arr[l]<0 && arr[r]>=0){
           if(arr[l]*arr[l] > arr[r]*arr[r]){
               temp[index--]=arr[l]*arr[l];
               l++;
           }else{
               temp[index--]=arr[r]*arr[r];
               r--;
           }
       }
       while(arr[l]<0){
           temp[index--]=arr[l]*arr[l];
           l++;
       }
       while(arr[r]>=0){
           temp[index--]=arr[r]*arr[r];
           r--;
       }
       return temp;
    }
    
    public static void main(String[] args) {
        int[] A = {-7,-3,1,3,5,9};
        System.out.println(Arrays.toString(square(A)));
        System.out.println(Arrays.toString(arr(A)));
    }
    
}
