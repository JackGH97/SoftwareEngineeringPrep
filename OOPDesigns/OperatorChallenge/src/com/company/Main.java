package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double lowValue = 20d;
        double highValue = 80d;
        double result = (lowValue + highValue) * 100d;
        double remainder = result%40.00d;
        System.out.println(remainder);
        boolean lessThan = (remainder == 0) ? true : false;
        System.out.println(lessThan);

        if(!lessThan){
            System.out.println("Got some Remainder");
        }
    }
}
