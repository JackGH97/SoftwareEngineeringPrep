package com.hawkins;

import java.util.Iterator;

public class MinFlips {

    public static void main(String[] args) {

    }

    public static int getFlip(int[] array, int current)
    {
        int flipCount = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] != current)
                flipCount++;

            //  flip expected character each time
            current =  current == 0 ? 1 : 0;
        }
        return flipCount;
    }

/*
;
def getFlips(input_value):




 */
}
