package stringaddphrases;

import java.util.ArrayList;
import java.util.List;

public class StringAddPhrases {

    public static boolean isAdd(String s, String t){
        if (s.equals("")) return true;
        if (s.length()>=t.length()) return false;
        String[] sstr = s.split(" ");
        String[] tstr = t.split(" ");
        int l=0,r=0;
        int count=0;
        boolean flag = false;
        for (;l<tstr.length && r<sstr.length;l++){
            if (!sstr[r].equals(tstr[l]) && !flag) {
                flag=!flag;
                count++;
            }
            else if(sstr[r].equals(tstr[l])){
                if (flag) flag=!flag;
                r++;
            }
        }
        if (l<tstr.length) count++;
        return count<=1;
    }
    
    public static List<Integer> isAddrange(String s, String t){
        String[] sstr = s.split(" ");
        String[] tstr = t.split(" ");
        int l=0,r=0;
        int count=0;
        boolean flag = false;
        List<Integer> list = new ArrayList<>();
        for (;l<tstr.length && r<sstr.length;l++){
            if (!sstr[r].equals(tstr[l]) && !flag) {
                list.add(l);
                flag=!flag;
                count++;
            }
            else if(sstr[r].equals(tstr[l])){
                if (flag){
                    list.add(l-1);
                    flag=!flag;
                }
                r++;
            }
        }
        if (l<tstr.length) {
            list.add(l);
            list.add(tstr.length-1);
        }
        return list;
    }
    
    public static void main(String[] args) {
        String s = "she is running";
        String t = "I know she is running";
        System.out.println(isAdd(s,t));
        System.out.println(isAddrange(s,t));
    }
    
}
