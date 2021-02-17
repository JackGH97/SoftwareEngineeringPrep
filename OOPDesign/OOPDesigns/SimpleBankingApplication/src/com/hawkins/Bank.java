package com.hawkins;

import java.util.ArrayList;

public class Bank {

    private String bankName;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.bankName = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String name){
        if(findBranch(name) >= 0){
            System.out.println("Branch already exists");
            return false;
        }
        System.out.println("Adding new branch.");
        branches.add(new Branch(name));
        return true;
    }

    public boolean addCustomer(String name, Customer customer){
        int branchIndex = findBranch(name);
        if(branchIndex >= 0){
            Branch branch = findBranch(name);
            branch.addNewCustomer(customer);
            return true;
        }
        System.out.println("Branch Did not exist");
        return false;
    }

    public boolean printBranchCustomers(Branch branch){
        for(int i = 0; i < branch.getBranchCustomers().size(); i++){
            System.out.println(branch.getBranchCustomers().get(i).getCustomerName());
            return true;
        }
        return false;
    }

    public void printBranchCustomersTransactions(Branch branch){
        for(int i = 0; i < branch.getBranchCustomers().size(); i++){
            System.out.println(branch.getBranchCustomers().get(i).getCustomerName());
            for (int j = 0; j < branch.getBranchCustomers().get(i).getCustomerTransactions().size(); j++){
                System.out.println(branch.getBranchCustomers().get(i).customerTransaction(j));
            }
        }
    }

    private int findBranch(Branch branch) {
        return this.branches.indexOf(branch);
    }

    private Branch findBranch(String branchName) {
        for (int i = 0; i < this.branches.size(); i++) {
            Branch branch = this.branches.get(i);
            if (branch.getBranchName().equals(branchName)) {
                return branch;
            }
        }
        return null;
    }

    // creates it without creating a separate object instance
    public static Bank createBank(String name){
        return  new Bank(name);
    }

}
