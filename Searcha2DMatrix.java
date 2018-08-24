package searcha2dmatrix;

public class Searcha2DMatrix {
    
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix==null || matrix.length==0 || matrix[0].length==0) return false;
        int[] row = findRow(matrix,target);
        boolean ans = search(row, target);
        return ans;
    }
    
    public static int[] findRow(int[][] matrix,int target){
        if (matrix.length==1) return matrix[0];
        int i=0;
        int j=matrix[0].length-1;
        while(i<matrix.length && matrix[i][j]<=target){
            if (matrix[i][j]==target) return matrix[i];   
            else {
                i++;
            }
        }
        if (i>=matrix.length) return matrix[matrix.length-1];
        return matrix[i];
    }
    
    public static boolean search(int[] row, int target){
        boolean res=false;
        for (int i=0;i<row.length;i++){
            if (row[i]==target) return true;
        }
        return res;
    } 
    
    public static void main(String[] args) {
        //int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
        int[][] matrix = {{1},{3}};
        int target = 4;
        boolean ans = searchMatrix(matrix,target);
        System.out.println(ans);
        
    }
    
}
