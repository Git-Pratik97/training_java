package com.M1Practice;

import java.util.HashMap;
import java.util.Map;

public class Q16AvgMarksFromHashMap {
    public static double averageOfMarks(Map<Integer, Integer> m1) {
        double sum = 0;
        int count = 0;
        for(Map.Entry<Integer, Integer> entry: m1.entrySet()) {
            if(entry.getKey() %2 != 0) {
                sum += entry.getValue();
                count++;
            }
        }
        return Math.round((sum/count)*100)/100.00;
//        return Math.round((sum/count)*100)/100.00;
    }

    public static void main(String[] args) {
        Map<Integer, Integer> m1 = new HashMap<>();
        m1.put(367, 89);
        m1.put(368, 98);
        m1.put(369, 92);
        m1.put(366, 74);
        m1.put(365, 67);

        System.out.println(averageOfMarks(m1));
    }
}
