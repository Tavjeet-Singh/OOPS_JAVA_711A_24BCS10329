package com.bank.customers;

public class Customer {

    private String customerId;
    private String name;

    // Using Fully Qualified Class Name
    private com.bank.accounts.Account account;

    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    public void linkAccount(com.bank.accounts.Account account) {
        this.account = account;
    }

    public void showDetails() {
        System.out.println("Customer: " + name);
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());
    }
}