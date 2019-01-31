package returndates;

import java.util.Calendar;

public class ReturnDates {
    
    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();
        calendar.set(Calendar.YEAR,2018);
        calendar.set(Calendar.MONTH,9);
        calendar.set(Calendar.DATE,1);
	
        while (calendar.get(Calendar.DAY_OF_WEEK) != Calendar.TUESDAY){
            calendar.add(Calendar.DATE,1);
	}
        System.out.println(calendar.get(Calendar.DATE) + 7);
    }
}
