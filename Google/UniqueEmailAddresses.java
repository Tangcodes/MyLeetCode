
package uniqueemailaddresses;

import java.util.HashSet;
import java.util.Set;


public class UniqueEmailAddresses {

    public static int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        String hasplus;
        String hasnoplus;
        String res="";
        for (String s : emails){
            String[] split = s.split("@");
            if(split[0].contains("+")) res = split[0].replaceAll("\\.","").indexOf("+") +"@"+ split[1];
            else res = split[0].replaceAll("\\.","")+ "@" + split[1];
            set.add(res);
        }
        return set.size();
    }
    
    public static void main(String[] args) {
       String[] e = new String[]{"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
       System.out.println(numUniqueEmails(e));
    }
}
