package com.bank.loans;

import com.bank.accounts.Account;

public class Loan {

    private double loanAmount;

    public Loan(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double calculateEMI(int months) {
        return loanAmount / months;
    }

    public void tryAccessAccount(Account acc) {
        
        System.out.println("Balance via getter: " + acc.getBalance());
    }
}