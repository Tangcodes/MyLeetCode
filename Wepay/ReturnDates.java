package returndates;

import java.util.Calendar;

public class ReturnDates {
    
    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();
        calendar.set(Calendar.YEAR,2019);
        calendar.set(Calendar.MONTH,0);
        calendar.set(Calendar.WEEK_OF_MONTH,3);
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
        System.out.println((calendar.get(Calendar.DATE)));
    }
}
