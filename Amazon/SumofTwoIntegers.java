package sumoftwointegers;

public class SumofTwoIntegers {

    public static int getSum(int a, int b) {
        return b==0? a:getSum(a^b, (a&b)<<1); //be careful about the terminating condition;

    }
    
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println(getSum(a,b));
    }
    
}
