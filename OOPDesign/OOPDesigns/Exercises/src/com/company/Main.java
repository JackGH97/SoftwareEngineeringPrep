package com.company;

public class Main {

    public static void main(String[] args) {
        printConversion(1.25);
    }

    public static long toMilesPerHour(double kilometersPerHour){
        long mPH = 0;
        if(kilometersPerHour < 0){
            mPH = -1;
        } else{
            mPH = (long) (kilometersPerHour*0.621371);
        }
        return mPH;
    }

    public static void printConversion(double kilometersPerHour){

        if(kilometersPerHour <0 ){
            System.out.println("Invalid Value");
        }else {
            double calculatedValue = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = "+ Math.round(calculatedValue) + " mi/h");
        }

    }
}
