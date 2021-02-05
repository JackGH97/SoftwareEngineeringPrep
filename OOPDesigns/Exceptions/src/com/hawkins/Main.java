package com.hawkins;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        // write your code here
//        int x = 98;
//        int y = 0;
//        System.out.println(divideBYL(x,y));
//        System.out.println(divideEAFP(x,y));
//        System.out.println(divide(x,y));
        int x = getIntEAFP();
        System.out.println("X is " + x);
    }

    // BYL
    private static int getInt() {
        Scanner s = new Scanner(System.in);
        boolean isValid = true;
        String input = s.next();
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i))) {
                isValid = false;
                break;
            }
        }
        if (isValid) {
            return Integer.parseInt(input);
        }
        return 0;
    }

    private static int getIntEAFP() {
        Scanner s = new Scanner(System.in);
        try {
            return s.nextInt();
        } catch (InputMismatchException e) {
            return 0;
        }
    }

    // look before you leap (checking before)
    private static int divideBYL(int x, int y) {
        if (y != 0) {
            return x / y;
        }
        return 0;
    }

    // Easy to ask for forgiveness
    private static int divideEAFP(int x, int y) {
        try {
            return x / y;
        } catch (ArithmeticException e) {
            return 0;
        }
    }

    private static int divide(int x, int y) {
        return x / y;
    }
}
