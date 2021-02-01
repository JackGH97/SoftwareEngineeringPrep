package com.hawkins;

public class DoWhile {

    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;

        while (number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                continue; // bypass other statements
            }
            System.out.println("Even number" + number);
        }
    }

    public static boolean isEvenNumber(int nu){
        if((nu%2)==0){
            return true;
        }
        else {
            return false;
        }
    }
}
