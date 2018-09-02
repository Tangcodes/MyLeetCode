package findallanagramsinastring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsinaString {
    /*
    public static List<Integer> findAnagrams(String s, String p) {
        int m = s.length();
        int n = p.length();
        char[] pchar = p.toCharArray();
        Arrays.sort(pchar);
        String pp = new String(pchar);
        List<Integer> ans = new ArrayList<>();
        if(p.length()> s.length()) return ans;
        for (int i=0;i<m-n+1;i++){
            match(ans,s.substring(i, i+n),i,pp);
        }
        return ans;
    }
    
    public static void match ( List<Integer> list,String sub,int index,String pp){
        char[] subchar = sub.toCharArray();
        Arrays.sort(subchar);
        String ss = new String(subchar);
        if (ss.equals(pp)) list.add(index);
    }
    */
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if(s == null||s.length() == 0||p == null||p.length()==0) return result;
        int[] hash = new int[256];
        char[] pp = p.toCharArray();
        for(char i:pp){
            hash[i]++;
        }
        int left = 0, right = 0, count = p.length();
        while(right < s.length())
        {
            if(hash[s.charAt(right++)]-- > 0)  //窗口右移；相应的hash值减小；如果这个位置的Hash值是正的，表示p字符串也包含这个，所以count做减法
                count--;
            if(count == 0)
                result.add(left);//count指示器，为0表示和p对应的hash值完全一致
            if(right - left == p.length() && hash[s.charAt(left++)]++ >= 0) 
                //如果当窗口大小一定的时候即窗口大小和需要比较的字符串大小一致的时候，将窗口左边的指针向右边移动，移动的同时左边的字符计数因为在第一个if的地方hash值减小过，所以需要执行对应恢复操作，即：hash值增加，count计数值增加。
                count++;
        }
        return result;

    }
    
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> ans = findAnagrams(s,p);
        System.out.println(ans);
    }
    
}
