package com.hawkins;

import java.util.ArrayList;

public class Customer {

    private String customerName;
    private ArrayList<Double> customerTransactions;

    public Customer(String customerName) {
        this.customerName = customerName;
        this.customerTransactions = new ArrayList<>();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public ArrayList<Double> getCustomerTransactions() {
        return customerTransactions;
    }

    public void addTransaction(Double money){
        customerTransactions.add(money);
    }

    public static Customer createCustomer(String name){
        return new Customer(name);
    }

    public double customerTransaction(int i){
        return customerTransactions.get(i);
    }


}
