package com.company;

public class Exercise15 {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-222));
    }

    public static boolean isPalindrome(int number, int test){
        int palindrome = number;
        int reverse = 0;

        // Compute the reverse
        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
            System.out.println("Reverse" + reverse + " Pala " + palindrome);
        }

        // The integer is palindrome if integer and reverse are equal
        return number == reverse; // Improved by Peter Lawrey

    }

    public static boolean isPalindrome(int integer) {
        if(integer < 0){
            integer = integer * -1;
        }
        String intStr = String.valueOf(integer);
        return intStr.equals(new StringBuilder(intStr).reverse().toString());
    }
}
