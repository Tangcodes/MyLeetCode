
package kthsmallestelementinasortedmatrix;

import java.util.Comparator;
import java.util.PriorityQueue;


public class KthSmallestElementinaSortedMatrix {
    public static int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {                
                return o2-o1;
            }
        });
        
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                if (maxHeap.size()<k) maxHeap.offer(matrix[i][j]);
                else if (maxHeap.peek()<=matrix[i][j]) continue;
                else{
                    maxHeap.poll();
                    maxHeap.offer(matrix[i][j]);
                }
            }
        }
        return maxHeap.peek();
    }
    
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,5,9},{10, 11, 13},{12, 13, 15}};
        //int[][] matrix = new int[][]{{1,2},{1,3}};
        int k = 8;
        System.out.println(kthSmallest(matrix,k));
    }   
}
