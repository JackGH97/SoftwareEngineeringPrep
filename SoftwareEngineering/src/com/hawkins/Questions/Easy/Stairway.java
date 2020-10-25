package com.hawkins.Questions.Easy;

public class Stairway {

    public static void staircase(int n) {
        String[] test = new String[n];
        for(int i = 0; i < n; i++){
            String line = "";
            for(int j = n-i; j >1; j--){
                line += " ";
            }
            for(int k = i+1; k>0; k--){
                line+= "#";
            }
            test[i] = line;
        }
        for(int t = 0; t < test.length; t++){
            System.out.println(test[t]);
        }
    }


}
