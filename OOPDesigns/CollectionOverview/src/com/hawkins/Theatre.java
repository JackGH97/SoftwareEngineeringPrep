package com.hawkins;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Theatre {

    private final String theatreName;
    private List<Seat> seats = new ArrayList<>();

    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;
        int lastRow = 'A' + (numRows - 1);
        for(char row = 'A'; row <= lastRow; row++){
            for(int seatNum = 1; seatNum <= seatsPerRow; seatNum++){
                double price = 12.00;
                if((row < 'D') && (seatNum >= 4 && seatNum <= 9)){
                    price = 14.00;
                } else if (row > 'F' || (seatNum < 4 || seatNum > 9) ){
                    price = 7.00;
                }
                Seat seat = new Seat(row + String.format("%02d", seatNum),price);
                seats.add(seat);
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }

    public boolean reserveSeat(String seatNumber){
        Seat requestedSeat = new Seat(seatNumber,0);
        int foundSeat = Collections.binarySearch(seats,requestedSeat,null);
        if(foundSeat >= 0 ){
            return seats.get(foundSeat).reserve();
        } else {
            System.out.println("Invalid Seat");
            return  false;
        }
    }

    public Collection<Seat> getSeats(){
        return seats;
    }

    public class Seat implements Comparable<Seat>{
        private final String seatNumber;
        private double price;
        private boolean reserved = false;

        public Seat(String seatNumber,double price) {
            this.seatNumber = seatNumber;
            this.price = price;
        }

        public boolean reserve(){
            if(!this.reserved){
                this.reserved = true;
                System.out.println("Reserved");
                return true;
            }
            else{
                System.out.println("Already Reserved");
                return false;
            }
        }

        public boolean cancel(){
            if(this.reserved){
                this.reserved = false;
                System.out.println("reservation of seat cancelled");
                return true;
            } else{
                System.out.println("Seat was not reserved");
                return false;
            }
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }

        public double getPrice() {
            return price;
        }
    }
}