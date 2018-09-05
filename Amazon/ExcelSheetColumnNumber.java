package excelsheetcolumnnumber;


public class ExcelSheetColumnNumber {

    public static int titleToNumber(String s) {
        int len =s.length();
        int sum = 0;
        int n=1;
        for (int i=len-1;i>=0;i--){
            //int a = s.charAt(i)-'A'+1;
            sum+=((s.charAt(i)-'A'+1)*n);
            n*=26;
        }
        
        return sum;
    }
    
    public static void main(String[] args) {
        String s = "AZY";
        System.out.println(titleToNumber(s));
    }
    
}
