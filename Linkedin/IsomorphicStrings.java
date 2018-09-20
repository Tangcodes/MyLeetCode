
package isomorphicstrings;

import java.util.HashMap;


public class IsomorphicStrings {


    public static boolean isIsomorphic(String s, String t) {
        if (s.length()!=t.length())return false;
        HashMap<Character,String> map1 = new HashMap<>();
        HashMap<Character,String> map2 = new HashMap<>();
        StringBuilder ss = new StringBuilder();
        StringBuilder tt = new StringBuilder();
        for (int i=0;i<s.length();i++){
            if(!map1.containsKey(s.charAt(i))){
                map1.put(s.charAt(i), Integer.toString(i));
                ss.append(Integer.toString(i));
            }
            else{
                ss.append(map1.get(s.charAt(i)));
            }
        }
        
        for (int i=0;i<s.length();i++){
            if(!map2.containsKey(t.charAt(i))){
                map2.put(t.charAt(i), Integer.toString(i));
                tt.append(Integer.toString(i));
            }
            else{
                tt.append(map2.get(t.charAt(i)));
            }
        }
        return ss.toString().equals(tt.toString()); 
    }
    
    public static void main(String[] args) {
        String s= "egg";
        String t= "add";
        System.out.println(isIsomorphic(s,t));
    }
    
}
