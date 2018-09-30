
package sumpalindrome;


public class SumPalindrome {
    static int ans =0;
    public static int sumPalindrome(String s){
        findnum(s);
        return ans;
    }
    
    public static void findnum(String s){
        StringBuffer sb = new StringBuffer(s);
        String sum = String.valueOf(Integer.parseInt(s)+Integer.parseInt(sb.reverse().toString()));
        if (!isPalindrome(sum)) {findnum(sum);ans++;}
    }
    
    public static boolean isPalindrome(String s){
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            if (s.charAt(left)==s.charAt(right)){
                left++;
                right--;
            }
            else return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        String s = "99";
        System.out.println(sumPalindrome(s));
    }
}
