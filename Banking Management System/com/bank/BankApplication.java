package com.bank;

import com.bank.accounts.SavingsAccount;
import com.bank.customers.Customer;
import com.bank.loans.Loan;

import static com.bank.util.BankUtil.*;

public class BankApplication {

    public static void main(String[] args) {

        String accNo = generateAccountNumber();

        if (!validateMinimumBalance(5000)) {
            System.out.println("Minimum balance not maintained!");
            return;
        }

        SavingsAccount account = new SavingsAccount(accNo, 5000, 5);

        Customer customer = new Customer("C101", "Tavjeet Singh");
        customer.linkAccount(account);

        customer.showDetails();

        account.deposit(2000);
        account.withdraw(1000);

        double interest = account.calculateInterest();
        System.out.println("Interest: " + interest);

        Loan loan = new Loan(100000);
        System.out.println("EMI (12 months): " + loan.calculateEMI(12));

        loan.tryAccessAccount(account);
    }
}