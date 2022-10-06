package com.M1Practice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Q2findday {
    public static String getDay(Date d1) {
        String s1;
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        s1 = sdf.format(d1);

        return s1;
    }

    public static void main(String[] args) {
        Date d1 = new Date(27/12/2012);
        String day = getDay(d1);

        System.out.println("Day : " + day);
    }
}
