
package removevowels;

import java.util.Arrays;
import java.util.List;

public class RemoveVowels {

    public static String removeVowels(String s){
        /* 方法1，一行解决
        String clear = s.replaceAll("[aeiou]","");
        return clear;
        */
        
        /* 方法2，注意除了aeiou，还有AEIOU
        StringBuffer sb = new StringBuffer(s);
        for (int i=0;i<sb.length();i++){
            if (sb.charAt(i)=='a'||sb.charAt(i)=='e'||sb.charAt(i)=='i'||sb.charAt(i)=='o'||sb.charAt(i)=='u'){
                sb.replace(i, i+1, "");
                i--; // 很关键，要不会错乱;
            }
        }
        String ans=sb.toString();
        return ans;
        */
        
        Character vowels[] = {'a', 'e', 'i', 'o', 'u','A','E','I','O','U'}; 
        List<Character> al = Arrays.asList(vowels);          
        StringBuffer sb = new StringBuffer(s); 
        for (int i = 0; i < sb.length(); i++) {   
            if(al.contains(sb.charAt(i))){ 
                sb.replace(i, i+1, "") ; 
                i--; 
            } 
        } 
        return sb.toString(); 
    }
    
    public static void main(String[] args) {
        String s = "abcdefighmlnopqrstaeiouAEIOUC";
        System.out.println(removeVowels(s));
    }
}
