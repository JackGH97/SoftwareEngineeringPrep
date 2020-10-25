package com.hawkins.Questions.Easy;

public class FraudChecker {
    static int activityNotifications(int[] expenditure, int d) {
        int notificationsSent =0;

        if(expenditure.length-1 < 0 || expenditure.length-1 > 200){
            return 0;
        }
        int tracker = d;
        for(int i = d; i<= expenditure.length-1; i++){
            int median = 0;
            for(int j = tracker; j >tracker-d; j-- ){
                median += expenditure[j-1];
            }

            if(expenditure[i] >= Math.round((2*((double)median/d)))){
                notificationsSent++;
            }
            tracker++;
        }

        return notificationsSent;
    }

}
