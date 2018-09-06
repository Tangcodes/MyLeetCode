package validpalindrome;


public class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        if (s.length()==1) return true;
        String clear = s.toLowerCase().replaceAll("\\p{Punct}","").replaceAll(" ", "");
        int left = 0;
        int right = clear.length()-1;
        while (left<right){
            if (clear.charAt(right)==clear.charAt(left)){
                left++;
                right--;
            }
            else return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
    
}
