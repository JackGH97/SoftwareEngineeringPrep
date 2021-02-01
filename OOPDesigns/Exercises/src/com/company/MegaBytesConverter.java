package com.company;

public class MegaBytesConverter {


    public static void main(String[] args) {


    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        int XX = kiloBytes;
        if (XX<0){
            System.out.println("Invalid Value");
        }else {
            int YY = (int) Math.floor(XX/1024);
            int ZZ = XX % 1024;
            System.out.println(XX + " KB = " + YY + " MB and " + ZZ + " KB");
        }
    }

}
