package com.hawkins;

import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        double sum = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        while(true){
            boolean isAnInt = scanner.hasNextInt();


            if(isAnInt){
                count++;
                double number = scanner.nextDouble();
                sum += number;
            }
            else{
                break;
            }
            scanner.nextLine();
        }

        scanner.close();
        if (sum != 0 ) {
            double average = Math.ceil(sum/count);
            System.out.println("SUM = " + (int) sum + " AVG = " + (int)(average));
        }
        else {
            System.out.println("SUM = " + 0 + " AVG = " + 0);
        }
    }
}
