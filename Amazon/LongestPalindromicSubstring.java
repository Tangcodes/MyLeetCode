package longestpalindromicsubstring;


public class LongestPalindromicSubstring {

    public static String longestPalindrome(String s) {
        int n=s.length();
        int start=0;
        int end=0;
        for (int i=0;i<n;i++){
            int lenOneCenter=expandAroundCenter(s,i,i); //aba这种
            int lenTwoCenter=expandAroundCenter(s,i,i+1); //abba这种
            int len=Math.max(lenOneCenter,lenTwoCenter);
            if (len>end-start){  //true说明有longer string出现
                start=i-(len-1)/2;
                end=i+len/2;
            }
        }
        return s.substring(start,end+1);
    }
    
    public static int expandAroundCenter(String s, int left, int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1; 
    }
    
    public static void main(String[] args) {
        String s = "abcba";
        String ans = longestPalindrome(s);
        System.out.println(ans);
    }
    
}
