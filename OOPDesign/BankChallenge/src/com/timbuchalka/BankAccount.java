package com.timbuchalka;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by timbuchalka on 16/08/2016.
 */
public class BankAccount {

    private double balance;
    private String accountNumber;
    private Lock lock;

    public BankAccount(String accountNumber, double initialBalance) {
            this.accountNumber = accountNumber;
            this.balance = initialBalance;
            this.lock = new ReentrantLock();
        }


        public synchronized void deposit(double amount) {
            try{
                if(lock.tryLock(1000,TimeUnit.MILLISECONDS))
                    {
                        try{
                            balance += amount;
                        }
                        finally {
                            lock.unlock();
                        }
                }else{
                    System.out.println("Could not get lock");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public synchronized void withdraw(double amount) {
            lock.lock();
            try {
                    balance -= amount;

            } finally {
                lock.unlock();
            }
        }


    public String getAccountNumber(){
            return accountNumber;
    }

    public void printAccountNumber(){
            System.out.println("Account Number = " + accountNumber);
    }

}