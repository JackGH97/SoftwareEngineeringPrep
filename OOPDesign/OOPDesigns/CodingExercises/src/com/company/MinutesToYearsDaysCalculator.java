package com.company;

public class MinutesToYearsDaysCalculator {

    public static void main(String[] args) {

        printYearsAndDays(1440);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else{
            long days = (minutes /(24*60));
            long years = minutes / (1440 * 365);
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }

}
