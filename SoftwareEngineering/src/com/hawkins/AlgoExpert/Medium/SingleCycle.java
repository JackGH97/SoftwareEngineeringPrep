package com.hawkins.AlgoExpert.Medium;

public class SingleCycle {

    public static boolean hasSingleCycle(int[] array) {
        int numElVisited = 0;
        int currentIndex = 0;
        while (numElVisited < array.length){
            if(numElVisited > 0 && currentIndex == 0){
                return false;
            }
            numElVisited++;
            currentIndex = getNextIndex(array,currentIndex);
        }
        return currentIndex == 0;
    }

    public static int getNextIndex(int[] array, int currentIndex){
        int jump = array[currentIndex];
        int nextIndex = (currentIndex + jump) % array.length;
        return nextIndex >= 0 ? nextIndex : nextIndex + array.length;
    }
}
