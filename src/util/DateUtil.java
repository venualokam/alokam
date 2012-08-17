package util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: alokamve
 * Date: 1/25/12
 * Time: 2:44 PM
 */
public class DateUtil {

    public static void main(String srgs[]){
              Calendar cal = Calendar.getInstance();
			  System.out.println("Today : " + cal.getTime());
			  // Subtract 30 days from the calendar
			  cal.add(Calendar.DATE, -90);
			  System.out.println("30 days ago: " + cal.getTime());
			  // Add 10 months to the calendar
                                             Date date=new Date();
				date.setTime(cal.getTimeInMillis());
				System.out.println("ALOKAM -----------------------");
        SimpleDateFormat sdt=new SimpleDateFormat("yyyy-MM-dd");
			String ss=	sdt.format(date);
        System.out.println(ss);

    }
}
