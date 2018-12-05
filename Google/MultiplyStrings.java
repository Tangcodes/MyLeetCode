
package multiplystrings;


public class MultiplyStrings {

    public static String multiply(String num1, String num2) {
        int n1 = num1.length(), n2 = num2.length();
        String[] products = new String[n1 + n2];
        for (int i = n1 - 1; i >= 0; i--) {
            for (int j = n2 - 1; j >= 0; j--) {
                int d1 = num1.charAt(i) - '0';
                int d2 = num2.charAt(j) - '0';
                int temp = 0;
                if(products[i + j + 1] != null){
                    temp = Integer.parseInt(products[i + j + 1]);
                }
                temp += d1 * d2 ;
                products[i + j + 1] = String.valueOf(temp%10);
                if(products[i + j] == null) products[i + j] = String.valueOf(temp/10);
                else products[i + j] = String.valueOf(Integer.parseInt(products[i + j])+(temp/10));
            }
        }

        StringBuilder sb = new StringBuilder();
        for (String num : products) sb.append(num);
        while (sb.length() != 0 && sb.charAt(0) == '0') sb.deleteCharAt(0);
        return sb.length() == 0 ? "0" : sb.toString();
    }
    
    public static void main(String[] args) {
        String num1 = "101";
        String num2 = "20";
        System.out.println(multiply(num1,num2));
    }
}
