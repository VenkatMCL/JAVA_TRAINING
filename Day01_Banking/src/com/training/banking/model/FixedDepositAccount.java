package com.training.banking.model;

import com.training.banking.interfaces.InterestBearing;

public class FixedDepositAccount
        extends Account
        implements InterestBearing {

    private double penalty;

    public FixedDepositAccount(String accountNumber,
                               String holderName,
                               double balance,
                               double penalty) {

        super(accountNumber,
              holderName,
              balance);

        this.penalty = penalty;
    }

    @Override
    public void withdraw(double amount) {

        double total = amount + penalty;

        if(balance >= total) {

            balance -= total;

            System.out.println("Penalty Applied = " + penalty);
        }
        else {

            System.out.println("Insufficient Balance");
        }
    }

    @Override
    public void calculateInterest() {

        double interest = balance * 7 / 100;

        balance += interest;

        System.out.println("FD Interest Added = " + interest);
    }
}