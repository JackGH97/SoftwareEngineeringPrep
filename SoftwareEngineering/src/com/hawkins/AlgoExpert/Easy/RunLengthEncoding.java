package com.hawkins.AlgoExpert.Easy;

public class RunLengthEncoding {

    public static void main(String[] args) {
        System.out.println(runLengthEncoding("AAAAAAAAAAAA"));
    }


    // time O(n) || space O(n)
    public static String runLengthEncoding(String string) {
        // Write your code here.
        if(string.length() == 0){
            return "";
        }

        StringBuilder sb = new StringBuilder();

        int currentL = 1;
        char[] cA = string.toCharArray();
        for(int i = 1; i < cA.length; i++){
            if(cA[i] != cA[i-1] || currentL == 9){
                sb.append(currentL);
                sb.append(cA[i-1]);
                currentL = 0;
            }
            currentL++;
        }

        sb.append(currentL);
        sb.append(cA[cA.length-1]);

        return  sb.toString();
    }
}
