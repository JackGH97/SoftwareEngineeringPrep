package com.hawkins;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int switchValue = 3;

        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
            case 3: case 4: case 5:
                System.out.println("was a 3,4,5");
                break;
            default:
                System.out.println("Value was not 1 or 2");
                break;
        }

        char seq = 'A';

        switch(seq){
            case 'B': case 'A': case 'C': case 'D': case 'E':
                System.out.println("Char was " + seq);
                break;
            default:
                System.out.println("Char was not found");
                break;
        }
    }
}
