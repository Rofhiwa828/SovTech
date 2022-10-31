package utilities;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HelperMethods {


    public static int GetTodaysDate(){

        return Integer.parseInt(new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime()));
    }


    public static int Get8DaysBeforeCurrentDate() throws ParseException {

        // Create a date formatter using your format string
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");

        // Parse the given date string into a Date object.
        // Note: This can throw a ParseException.
        Date dt = new Date();
        Date myDate = dateFormat.parse(new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime()));

        // Use the Calendar class to subtract one day
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(myDate);
        calendar.add(Calendar.DAY_OF_YEAR, -10);

        // Use the date formatter to produce a formatted date string
        Date previousDate = calendar.getTime();
        return Integer.parseInt(Integer.toString(Integer.parseInt(dateFormat.format(previousDate))));
    }


}
