package com.M1Practice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;

public class Q9NumOfMonthsBetDates  {
    public static int numOfMonths(String d1, String d2) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = sdf.parse(d1);
        Date date2 = sdf.parse(d2);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date1);
        int y1 = cal.get(Calendar.YEAR);
        int m1 = cal.get(Calendar.MONTH);

        cal.setTime(date2);
        int y2 = cal.get(Calendar.YEAR);
        int m2 = cal.get(Calendar.MONTH);

        int diff = (y1-y2)*12 + (m1-m2);

        return diff;
    }

    public static void main(String[] args) throws ParseException {
        String d1 = "2012-12-01";
        String d2 = "2012-01-03";
        System.out.println(numOfMonths(d1, d2));

    }
}
