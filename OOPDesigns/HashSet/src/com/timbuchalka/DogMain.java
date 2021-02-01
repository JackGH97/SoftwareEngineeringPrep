package com.timbuchalka;

public class DogMain {

    public static void main(String[] args) {
        Labrador rover = new Labrador("Rover");
        Dog rover2 = new Dog("Rover");

        // labrador is an istance of dog, but dog is not an instance of lab (Symmetric rule) isn't equal on both sides of the coin
        System.out.println(rover2.equals(rover));
        System.out.println(rover.equals(rover2));
    }
}
