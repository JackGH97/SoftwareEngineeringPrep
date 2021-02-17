package com.hawkins;

import java.util.ArrayList;

public class Branch {

    private String branchName;
    private ArrayList<Customer> branchCustomers;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.branchCustomers = new ArrayList<>();
    }

    public boolean addNewCustomer(Customer customer){
        if(findCustomer(customer) >= 0){
            System.out.println("Customer already exists");
            return false;
        }
        System.out.println("Adding new customer.");
        branchCustomers.add(customer);
        return true;
    }

    public boolean addTransaction(String name, Double transactionAmount){
        int customerIndex = findCustomer(name);
        if(customerIndex >= 0){
            branchCustomers.get(customerIndex).addTransaction(transactionAmount);
            return true;
        }
        System.out.println("Customer Contact name did not exist");
        return false;
    }

    public String getBranchName() {
        return branchName;
    }

    private int findCustomer(Customer customer) {
        return this.branchCustomers.indexOf(customer);
    }

    private int findCustomer(String customerName) {
        for (int i = 0; i < this.branchCustomers.size(); i++) {
            Customer customer = this.branchCustomers.get(i);
            if (customer.getCustomerName().equals(customerName)) {
                return i;
            }
        }
        return -1;
    }

    public ArrayList<Customer> getBranchCustomers() {
        return branchCustomers;
    }

    public void setBranchCustomers(ArrayList<Customer> branchCustomers) {
        this.branchCustomers = branchCustomers;
    }

    public static Branch createBranch(String name){
        return  new Branch(name);
    }


}
