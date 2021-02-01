package com.company;

import static java.lang.Math.log;

public class Exercise16 {

    public static void main(String[] args) {
        sumFirstAndLastDigit(6203);
    }

    public static int sumFirstAndLastDigit(int number){
        int sum = 0;
        if(number == 0){

        } else if(number < 0){
            sum = -1;
        }else if(number<10 ){
            sum = -1;
        }
        else{
            String length = Integer.toString(number);
            int firstDigit = Integer.parseInt(Integer.toString(number).substring(0, 1));
            int lastDigit = Integer.parseInt(Integer.toString(number).substring(length.length()-1   ),length.length());
            sum = firstDigit + lastDigit;
        }
        return  sum;
    }


}
