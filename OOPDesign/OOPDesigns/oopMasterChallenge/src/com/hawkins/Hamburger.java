package com.hawkins;

import java.util.ArrayList;

public class Hamburger {

    private String breadType;
    private String meatType;
    private int price;
    private ArrayList<String> additions;

    public Hamburger(String breadType, String meatType, int price) {
        this.breadType = breadType;
        this.meatType = meatType;
        this.price = price;
    }

    public void addAddition(String topping){
        if(this.additions.size() >= 4){
            System.out.println("Cannot add more toppings");
        } else {
            this.additions.add(topping);
        }
    }

    public String getBreadType() {
        return breadType;
    }

    public String getMeatType() {
        return meatType;
    }

    public int getPrice() {
        return price;
    }

    public ArrayList<String> getAdditions() {
        return additions;
    }
}

class HealthyBurger extends Hamburger{

    public HealthyBurger(String breadType, String meatType, int price) {
        super("Brown rye bread roll", meatType, price);
    }

    @Override
    public void addAddition(String topping) {
        if(super.getAdditions().size() >= 6){
            System.out.println("Cannot add more toppings");
        } else {
            super.addAddition(topping);
        }
    }
}



