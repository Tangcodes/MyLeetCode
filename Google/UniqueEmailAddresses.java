
package uniqueemailaddresses;

import java.util.HashSet;
import java.util.Set;


public class UniqueEmailAddresses {

    public static int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        String hasplus;
        String hasnoplus;
        for (String s : emails){
            String[] split = s.split("@");
            String[] local = split[0].split("\\+"); // split local by '+'.
            set.add(local[0].replace(".", "") + "@" + split[1]); // remove all '.', and concatenate '@' and domain. 
        }
        return set.size();
    }
    
    public static void main(String[] args) {
       String[] e = new String[]{"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
       System.out.println(numUniqueEmails(e));
    }
}
