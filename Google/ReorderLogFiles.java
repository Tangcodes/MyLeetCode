
package reorderlogfiles;

import java.util.Arrays;
import java.util.Comparator;


public class ReorderLogFiles {

    public static String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs,new Comparator<String>(){
            public int compare(String s1,String s2){
                String[] split1 = s1.split(" ", 2);
                String[] split2 = s2.split(" ", 2);
                boolean isDigit1 = Character.isDigit(split1[1].charAt(0));
                boolean isDigit2 = Character.isDigit(split2[1].charAt(0));
                if (!isDigit1 && !isDigit2) {
                    int cmp = split1[1].compareTo(split2[1]);
                    if (cmp != 0) return cmp;
                    return split1[0].compareTo(split2[0]);
                }
                return isDigit1 ? (isDigit2 ? 0 : 1) : -1;
            }
        });
        return logs;
    }

    public static void main(String[] args) {
        String[] logs = {"a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"};
        System.out.println(Arrays.toString(reorderLogFiles(logs)));
    }
    
}
