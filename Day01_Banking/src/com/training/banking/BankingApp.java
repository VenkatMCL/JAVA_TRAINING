package com.training.banking;

import com.training.banking.model.*;
import com.training.banking.service.BankingService;

public class BankingApp {

    public static void main(String[] args) {

        SavingsAccount savings =
                new SavingsAccount(
                        "S101",
                        "Venkat",
                        10000,
                        5,
                        1000);

        CurrentAccount current =
                new CurrentAccount(
                        "C101",
                        "Ravi",
                        5000,
                        10000);

        FixedDepositAccount fd =
                new FixedDepositAccount(
                        "F101",
                        "Kiran",
                        20000,
                        500);

        savings.calculateInterest();
        savings.withdraw(2000);

        current.withdraw(8000);

        fd.calculateInterest();
        fd.withdraw(5000);

        BankingService service =
                new BankingService();

        service.displayAccount(savings);

        System.out.println();

        service.displayAccount(current);

        System.out.println();

        service.displayAccount(fd);
    }
}