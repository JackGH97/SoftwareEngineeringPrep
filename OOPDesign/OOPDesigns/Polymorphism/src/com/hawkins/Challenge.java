package com.hawkins;

class Car{

    private String engine;
    private int cylinders;
    private int wheels;

    public Car(String engine, int cylinders) {
        this.engine = engine;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public int accelerate(){
        return 10;
    }
}

public class Challenge {

    public static void main(String[] args) {

    }
}
