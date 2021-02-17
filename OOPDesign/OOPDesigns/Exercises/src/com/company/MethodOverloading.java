package com.company;

public class MethodOverloading {
    public static void main(String[] args) {
        calculateScore("jack",500);
        calculateScore(500);
    }


    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName);
        return score * 1000;
    }

    public static int calculateScore( int score){
        System.out.println("Unnamed Player " );
        return score * 1000;
    }
}
