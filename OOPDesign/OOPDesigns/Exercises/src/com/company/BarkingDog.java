package com.company;

public class BarkingDog {

    public static void main(String[] args) {

        System.out.println(shouldWakeUp (true, 1));
        System.out.println(shouldWakeUp (false, 2));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        boolean shouldWake = false;
        if(barking & (hourOfDay < 8 || hourOfDay > 22)){
            shouldWake = true;
        }
        return  shouldWake;
    }
}
