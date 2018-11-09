
package repeatedsubstringpattern;


public class RepeatedSubstringPattern {

    public static boolean repeatedSubstringPattern(String s) {
        if (s.length()==1 || s==null) return false;
        int len = s.length();
        for (int i=1;i<(len/2)+1;i++){
            String sub = s.substring(0,i);
            if(len%sub.length()!=0 || !s.substring(i).contains(sub)) continue;
            if (isAns(sub,s)) return true;
        }
        return false;
    }
    
    public static boolean isAns(String s, String t){
        for(int i = 0;i<(t.length()-s.length())+1;i+=s.length()){
            if (!s.equals(t.substring(i,i+s.length()))) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        String s = "ababba";
        System.out.println(repeatedSubstringPattern(s));
    }
}
