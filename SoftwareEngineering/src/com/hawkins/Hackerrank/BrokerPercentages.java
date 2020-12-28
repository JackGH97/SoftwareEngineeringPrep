package com.hawkins.Hackerrank;

import java.util.*;

public class BrokerPercentages {

    public static void main(String[] args) {
        ArrayList<String> test = new ArrayList<String>(Arrays.asList("Omega",
                "Alpha",
                "Omega",
                "Alpha",
                "Omega",
                "Alpha",
                "Omega",
                "Alpha",
                "Omega",
                "Alpha",
                "Omega",
                "Alpha",
                "Omega",
                "Alpha",
                "Omega",
                "Alpha",
                "Omega",
                "Alpha",
                "Omega",
               "Beta"));
        System.out.println(mostActive(test));
    }

    public static List<String> mostActive(List<String> customers) {
        // Write your code here
        int min = (int) Math.ceil(0.05 * customers.size());
        Map<String, Integer> counts = new HashMap<String, Integer>();
        ArrayList<String> mostActive = new ArrayList<String>();

        for (String string : customers) {
            if (counts.containsKey(string)) {
                counts.put(string, counts.get(string) + 1);
            } else {
                counts.put(string, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            if(entry.getValue() > min){
                mostActive.add(entry.getKey());
            }
        }

        Collections.sort(mostActive);

        return mostActive;
    }
}
