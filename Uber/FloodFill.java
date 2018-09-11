package floodfill;

import java.util.Arrays;

public class FloodFill {

    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image.length==1 && image[0].length==1 && sr==0 && sc==0) {image[0][0]=newColor;return image;}
        int oldColor=image[sr][sc];
        if (oldColor != newColor) dfs(image, sr, sc, oldColor, newColor);
        return image;
    }
    
    public static void dfs(int[][] image,int r,int c,int oldColor,int newColor){
        if (image[r][c] == oldColor) {
            image[r][c] = newColor;
            if (r >= 1) dfs(image, r-1, c, oldColor, newColor);
            if (c >= 1) dfs(image, r, c-1, oldColor, newColor);
            if (r+1 < image.length) dfs(image, r+1, c, oldColor, newColor);
            if (c+1 < image[0].length) dfs(image, r, c+1, oldColor, newColor);
        }
    }
    
    public static void main(String[] args) {
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        System.out.println(Arrays.deepToString(floodFill(image,1,1,2)));
    }
}
