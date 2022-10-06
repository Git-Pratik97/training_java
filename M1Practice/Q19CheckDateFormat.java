package com.M1Practice;

import java.util.StringTokenizer;

public class Q19CheckDateFormat {
    public static boolean formattingDate(String s) {
        boolean isdate = false;
        StringTokenizer st = new StringTokenizer(s, "/");
        String dd = st.nextToken();
        String mm = st.nextToken();
        String yyyy = st.nextToken();

        int ddint = Integer.parseInt(dd);
        int mmint = Integer.parseInt(mm);
        int yyyyint = Integer.parseInt(yyyy);

        if(yyyy.length() == 4) {
            if(yyyyint % 100 == 0) {
                if(yyyyint % 400 == 0) {
                    if(mmint == 2 && ddint <= 29) {
                        isdate = true;
                    }
                    else if((mmint == 1 || mmint == 3 || mmint == 5 || mmint == 7 || mmint == 8
                            || mmint == 10 || mmint == 12) && ddint <= 31) {
                        isdate = true;
                    } else if ((mmint == 4 || mmint == 6 || mmint == 9 || mmint == 11) && ddint <= 30) {
                        isdate = true;
                    }
                }
                else {
                    if(mmint == 2 && ddint <= 28) {
                        isdate = true;
                    }
                    else if((mmint == 1 || mmint == 3 || mmint == 5 || mmint == 7 || mmint == 8
                            || mmint == 10 || mmint == 12) && ddint <= 31) {
                        isdate = true;
                    } else if ((mmint == 4 || mmint == 6 || mmint == 9 || mmint == 11) && ddint <= 30) {
                        isdate = true;
                    }
                }
            } else if (yyyyint % 4 == 0) {
                    if(mmint == 2 && ddint <= 29) {
                        isdate = true;
                    }
                    else if((mmint == 1 || mmint == 3 || mmint == 5 || mmint == 7 || mmint == 8
                            || mmint == 10 || mmint == 12) && ddint <= 31) {
                        isdate = true;
                    } else if ((mmint == 4 || mmint == 6 || mmint == 9 || mmint == 11) && ddint <= 30) {
                        isdate = true;
                    }
            }
            else {
                if(mmint == 2 && ddint <= 28) {
                    isdate = true;
                }
                else if((mmint == 1 || mmint == 3 || mmint == 5 || mmint == 7 || mmint == 8
                        || mmint == 10 || mmint == 12) && ddint <= 31) {
                    isdate = true;
                } else if ((mmint == 4 || mmint == 6 || mmint == 9 || mmint == 11) && ddint <= 30) {
                    isdate = true;
                }
            }
        }
        return isdate;
    }

    public static void main(String[] args) {
        String s="31/12/1900";
        boolean b=formattingDate(s);
        if(b==true)
            System.out.println("date is in dd/MM/yyyy format");
        else
            System.out.println("date is not in dd/MM/yyyy format");
    }
}

