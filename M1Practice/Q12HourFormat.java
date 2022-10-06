package com.M1Practice;

import java.text.ParseException;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Q12HourFormat {
    public static boolean hourformat(String date) throws ParseException {
        boolean istwelve = false;
        StringTokenizer st = new StringTokenizer(date, " ");
        String s1 = st.nextToken();

        String s2 = st.nextToken();

        StringTokenizer time = new StringTokenizer(s1, ":");
        String hour = time.nextToken();
        String minute = time.nextToken();

        if (s2.equalsIgnoreCase("AM") || s2.equalsIgnoreCase("PM")) {
            if ((Integer.valueOf(hour) <= 12 && Integer.valueOf(hour) > 0) && (Integer.valueOf(minute) >= 0 && Integer.valueOf(minute) <= 59)) {
                istwelve = true;
            }
            if(Integer.valueOf(hour) > 12) {
                System.out.println("Invalid Time Format");
            }
        }
        return istwelve;
    }

    public static void main(String[] args) throws ParseException, NoSuchElementException {
        String s="19:36 am";
        boolean b=hourformat(s);
        if(b==true)
            System.out.println("the time is in 12 hr format");
        else
            System.out.println("the time is in 24 hr format");
    }
}
