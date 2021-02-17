package com.hawkins;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExampleTrace {

    public static void main(String[] args) {
        int result = divide();
        System.out.println(result);
    }

    private static int divide(){
        int x ,y;
        try{
            x = getInt();
            y = getInt();
            return x/y;
        } catch (NoSuchElementException e){
           throw new NoSuchElementException("No suitable input");
        } catch (ArithmeticException e){
            throw new ArithmeticException("Attempt to divide by 0");
        }
     }

     private static int getInt(){
        Scanner s = new Scanner(System.in);
        while(true){
            try{
                return s.nextInt();
            }catch (InputMismatchException e){
                s.nextLine();
                System.out.println("Please enter only a number from 0-9");
            }
        }
     }
}
