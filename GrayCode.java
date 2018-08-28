package graycode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class GrayCode {

    public static List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < 1<<n; i++) result.add(i ^ i>>1);
        return result;
    }   
    
    public static void main(String[] args) {
        int n =3;
        List<Integer> ans = grayCode(n);
        System.out.println(ans);
    }
    
}
