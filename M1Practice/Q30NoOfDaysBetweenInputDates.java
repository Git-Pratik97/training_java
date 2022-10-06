package com.M1Practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Q30NoOfDaysBetweenInputDates {
    public static int dateDifference(String s1, String s2) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date d1 = sdf.parse(s1);
        Calendar cal = Calendar.getInstance();
        cal.setTime(d1);
        long d1time = cal.getTimeInMillis();

        Date d2 = sdf.parse(s2);
        cal.setTime(d2);
        long d2time = cal.getTimeInMillis();
        int n = Math.abs((int)((d1time - d2time)/(1000*3600*24)));

        return n;
    }

    public static void main(String[] args) throws ParseException{
        String s1="27/12/2009";
        String s2="15/09/2012";
        System.out.println(dateDifference(s1,s2));
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//
//        Date d1 = sdf.parse(s1);
//        System.out.println(d1);
//        Calendar cal = Calendar.getInstance();
//        cal.setTime(d1);
//        System.out.println(cal.getTimeInMillis());
//        System.out.println(" ");
//
//        Date d2 = sdf.parse(s2);
//        System.out.println(d2);
//        cal.setTime(d2);
//        System.out.println(cal.getTimeInMillis());
    }

}
