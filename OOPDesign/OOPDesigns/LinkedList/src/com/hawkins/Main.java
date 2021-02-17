package com.hawkins;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Customer customer = new Customer("Jack",54.96);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);

        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<>();

        intList.add(1);
        intList.add(3);
        intList.add(4);

        for(int i = 0; i < intList.size(); i++){
            System.out.println("Int Value at index " + i + " is " + intList.get(i));
        }

        intList.add(1,2);

        for(int i = 0; i < intList.size(); i++){
            System.out.println("Int Value at index " + i + " is " + intList.get(i));
        }




    }
}
