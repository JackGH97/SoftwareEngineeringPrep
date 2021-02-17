package com.company;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class LeapYear {


    public static void main(String[] args) {
        System.out.println(isLeapYear(2400));
        System.out.println(isLeapYear(10000));

        BigDecimal d=new BigDecimal("3.1756").setScale(3, RoundingMode.DOWN);
        System.out.println(d);
    }

    public static boolean isLeapYear(int year){
        boolean leapYear = false;
        if(year <= 0 || year >= 10000){

        }
        else if(year%4 == 0){
            if(year%100 == 0){
                if(year%400 ==0){
                    leapYear = true;
                }
                else{
                    // do nothing
                }
            }
            else {
                leapYear = true;
            }
        } else{
            // do nothing
        }

        return  leapYear;
    }

}
