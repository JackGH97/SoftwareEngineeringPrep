package com.hawkins;

public class Player {
    private String name;
    private int age;
    private StrongFoot foot;
    private int shirtNumber;
    private Position position;


    public Player(String name, int age, StrongFoot foot, int shirtNumber, Position position) {
        this.name = name;
        this.age = age;
        this.foot = foot;
        this.shirtNumber = shirtNumber;
        this.position = position;
    }

    public void setFoot(StrongFoot foot) {
        this.foot = foot;
    }

    public void setShirtNumber(int shirtNumber) {
        this.shirtNumber = shirtNumber;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public int getShirtNumber() {
        return shirtNumber;
    }

    public String getPosition() {
        return position.toString();
    }

    public String getFoot() {
        return foot.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Name: " + this.name + ", Position: " + this.position.toString();
    }
}
