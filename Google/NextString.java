
package nextstring;


public class NextString {

    private static String next_string(char[] charset, String s) {
        // TODO Auto-generated method stub
        String result = "";
        if(s.isEmpty()) {
            return result + charset[0];
        }
        else {
            int idx = -1;
            for(int i = 0; i < charset.length; i++) {
                if(charset[i] == s.charAt(s.length()-1)) {
                    idx = i;
                    break;
                }
            }

            if(idx < charset.length - 1) {
                result = s.substring(0, s.length()-1) + charset[idx + 1];
            }
            else {
                String ss = next_string(charset, s.substring(0, s.length()-1));
                result = ss + charset[0];
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        char[] input = {'a','b','c'};
        String s = "";
        int i=0;
        while(i<50) {
            s = next_string(input, s);
            System.out.println(s);
            i++;
        }
    }
    
}
