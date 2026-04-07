package com.bank;

import com.bank.db.BankDAO;

public class BankApplication {

    public static void main(String[] args) {

        String accNo = "ACC101";

        double balance = BankDAO.getBalance(accNo);
        System.out.println("Initial Balance: " + balance);

        balance += 2000;
        BankDAO.updateBalance(accNo, balance);

        balance -= 1000;
        BankDAO.updateBalance(accNo, balance);

        System.out.println("Final Balance: " + balance);
    }
}