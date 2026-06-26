package com.training.banking.model;
import com.training.banking.interfaces.InterestBearing;
public class SavingsAccount extends Account
implements InterestBearing  {
	 private double interestRate;
	    private double minimumBalance;
	    
	    public SavingsAccount(String accountNumber,
                String holderName,
                double balance,
                double interestRate,
                double minimumBalance) {

super(accountNumber,
    holderName,
    balance);

this.interestRate = interestRate;
this.minimumBalance = minimumBalance;
}

@Override
public void withdraw(double amount) {

    if(balance - amount >= minimumBalance) {

        balance -= amount;

        System.out.println("Withdrawal successful");
    }
    else {

        System.out.println("Minimum balance violation");
    }
}

@Override
public void calculateInterest() {

    double interest =
            balance * interestRate / 100;

    balance += interest;

    System.out.println("Interest Added = " + interest);
}


}
