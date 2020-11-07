package com.hawkins.AlgoExpert.Easy;

import java.util.HashMap;

public class caesarCypher {

    public static String caesarCypherEncryptor(String str, int key) {
        // Write your code here.
        char[] newLetters = new char[str.length()];
        int newKey = key % 26;
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0; i < str.length(); i++){
            newLetters[i] = getNewLetter(str.charAt(i),newKey,alphabet);
        }
        return new String(newLetters);
    }

    public static char getNewLetter(char letter,int key, String alaphabet) {
        int newLetterCode = alaphabet.indexOf(letter) + key;
        return alaphabet.charAt(newLetterCode % 26);
    }
}
