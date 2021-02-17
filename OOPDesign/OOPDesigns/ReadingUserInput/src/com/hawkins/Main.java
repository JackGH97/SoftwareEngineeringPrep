package com.hawkins;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        scanner.nextLine(); // handle next line character (enter key)
        System.out.println("Enter your year of birth");
        int yearOfBirth = scanner.nextInt();
        int age = 2018- yearOfBirth;




        System.out.println("Your name is "+name + " Your Age is " +age);


        scanner.close();

    }
}
