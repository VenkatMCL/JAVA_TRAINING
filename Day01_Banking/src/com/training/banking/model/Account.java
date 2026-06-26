package com.training.banking.model;

public abstract class Account {
	  protected String accountNumber;
	    protected String holderName;
	    protected double balance;

	    public Account(String accountNumber,
	                   String holderName,
	                   double balance) {

	        this.accountNumber = accountNumber;
	        this.holderName = holderName;
	        this.balance = balance;
	    }

	    public void deposit(double amount) {

	        if(amount > 0) {
	            balance += amount;
	            System.out.println(amount + " deposited");
	        }
	    }

	    public abstract void withdraw(double amount);

	    public void display() {

	        System.out.println("Account Number : " + accountNumber);
	        System.out.println("Holder Name    : " + holderName);
	        System.out.println("Balance        : " + balance);
	    }

}
