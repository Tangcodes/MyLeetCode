package fizzbuzz;

import java.util.ArrayList;
import java.util.List;


public class FizzBuzz {


    public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i=1;i<=n;i++){
            list.add((i%3!=0 && i%5!=0)?Integer.toString(i):(i%3==0 && i%5==0)?"FizzBuzz":i%3==0?"Fizz":"Buzz");
        }
        return list;
    }
    
    public static void main(String[] args) {
        int n = 15;
        List<String> list= fizzBuzz(n);
        System.out.print(list);
    }
    
}
