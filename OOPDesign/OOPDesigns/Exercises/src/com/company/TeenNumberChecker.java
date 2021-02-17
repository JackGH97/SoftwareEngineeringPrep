package com.company;

public class TeenNumberChecker {

    public static void main(String[] args) {

    }

    public static boolean hasTeen(int n1, int n2, int n3){
        if(n1 > 19 || n1 <13 ){
            return true;
        }else if(n2 > 19 || n2 <13 ){
            return true;
        }else if(n3 > 19 || n3 <13 ){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isTeen(int age){
        return age >= 13 && age <= 19;
    }

}
