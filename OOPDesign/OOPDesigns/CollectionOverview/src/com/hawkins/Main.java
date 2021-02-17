package com.hawkins;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Theatre theatre = new Theatre("Hero",8,12);


        if(theatre.reserveSeat("D12")){
            System.out.println("Please pay for D12");
        }else{
            System.out.println("Seat Reserved");
        }

        if(theatre.reserveSeat("D12")){
            System.out.println("Please pay for D12");
        }else{
            System.out.println("Seat Reserved");
        }

        if(theatre.reserveSeat("B13")){
            System.out.println("Please pay for B13");
        }else{
            System.out.println("Seat Reserved");
        }

        printList(theatre.getSeats());
    }

    public static void printList(Collection<Theatre.Seat> List){
        for(Theatre.Seat seat : List){
            System.out.print("Seat Number: " + seat.getSeatNumber() + ", Price £" + seat.getPrice() + "  ");
        }
        System.out.println();
        System.out.println("================================================================");
    }
}
