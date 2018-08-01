package sortcolors;
import java.util.Arrays;

public class SortColors {

    public void sort(int[] input){
        int p1 = 0, p2 = input.length - 1, index = 0;
        while (index <= p2) {
            if (input[index] == 0) {
                input[index] = input[p1];
                input[p1] = 0;
                p1++;
            }
            if (input[index] == 2) {
                input[index] = input[p2];
                input[p2] = 2;
                p2--;
                index--;
            }
            index++;
        }
    }
    
    public static void main(String[] args) {
        int[] input = new int[]{2,0,2,1,1,0};
        int N=input.length;
        new SortColors().sort(input);
        //for (int i=0;i<N;i++)System.out.print(input[i]);
        System.out.print(Arrays.toString(input));
    }
}
