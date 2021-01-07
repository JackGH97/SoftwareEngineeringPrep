package com.hawkins.LeetCode;

import java.util.HashMap;

public class UndergroundSystem {

    HashMap<String, int[]> travelTimes = new HashMap<String, int[]>();

    // KEY - id
    // Value -- Starting station
    HashMap<Integer, String> idToStation = new HashMap<Integer, String>();

    // KEY - id
    // Value -- start time
    HashMap<Integer, Integer> idToTime = new HashMap<Integer, Integer>();

    public UndergroundSystem() {

    }

    public void checkIn(int id, String stationName, int t) {
        if(idToStation.containsKey(id)){
        }else{
            idToStation.put(id,stationName);
            idToTime.put(id,t);
        }
    }

    public void checkOut(int id, String stationName, int t) {
        String s = idToStation.get(id) + " " + stationName;
        idToStation.remove(id);

        int time = t - idToTime.get(id);
        idToTime.remove(id);

        if (travelTimes.containsKey(s))
        {
            travelTimes.put(s, new int[] {travelTimes.get(s)[0] + 1, travelTimes.get(s)[1] + time});
        }
        else
        {
            travelTimes.put(s, new int[] {1, time});
        }
    }

    public double getAverageTime(String startStation, String endStation) {
        String s = startStation + " " + endStation;

        if (!travelTimes.containsKey(s)) return 0.0;

        double time = (double) travelTimes.get(s)[1];
        double amt = (double) travelTimes.get(s)[0];

        return time / amt;
    }


}
