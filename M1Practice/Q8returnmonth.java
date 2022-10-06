package com.M1Practice;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Q8returnmonth {
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        String date =  scan.next();
        Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(date);
        monthreturn(date1);

    }

    public static void monthreturn(Date d) {
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM");
        String Month = sdf.format(d);
        System.out.println("Month: "+Month);
    }
}
