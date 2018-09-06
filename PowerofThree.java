package powerofthree;


public class PowerofThree {

    public static boolean isPowerOfThree(int n) {
        if (n==1) return true;
        if (n>=Integer.MAX_VALUE) return false;
        String s = String.valueOf(n);
        int len = s.length();
        if (n==(int)Math.pow(3, 2*len-1) || n==(int)Math.pow(3, 2*len)) return true;
        else return false;
    }
    
    public static void main(String[] args) {
        int n=2147483647;
        System.out.println(isPowerOfThree(n));
    }
    
}
