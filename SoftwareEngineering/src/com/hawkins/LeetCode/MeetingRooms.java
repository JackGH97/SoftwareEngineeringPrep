package com.hawkins.LeetCode;

import java.util.Arrays;

public class MeetingRooms {

    public static void main(String[] args) {
        int[][] test = new int[][]{{7,10},{2,4}};
        System.out.println(canAttendMeetings(test));
    }
    public static boolean canAttendMeetings(int[][] intervals) {
        for(int i = 0; i < intervals.length; i++){
            for(int j = i +1; j < intervals.length; j++){
                if(overlap(intervals[i],intervals[j])){
                    return false;
                }
            }
        }
        return true;
    }


    public static boolean overlap(int[] i1, int[] i2) {
        return (i1[0] >= i2[0] && i1[0] < i2[1])
                || (i2[0] >= i1[0] && i2[0] < i1[1]);
    }
}
