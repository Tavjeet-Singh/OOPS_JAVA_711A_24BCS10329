package com.bank.db;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class BankDAO {

    public static void insertCustomer(String id, String name) {
        try {
            Connection con = DBConnection.getConnection();
            String query = "INSERT INTO customers VALUES (?, ?)";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, id);
            ps.setString(2, name);

            ps.executeUpdate();
            System.out.println("Customer inserted");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void insertAccount(String accNo, double balance, String custId) {
        try {
            Connection con = DBConnection.getConnection();
            String query = "INSERT INTO accounts VALUES (?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, accNo);
            ps.setDouble(2, balance);
            ps.setString(3, custId);

            ps.executeUpdate();
            System.out.println("Account inserted");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void insertSavings(String accNo, double rate) {
        try {
            Connection con = DBConnection.getConnection();
            String query = "INSERT INTO savings_accounts VALUES (?, ?)";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, accNo);
            ps.setDouble(2, rate);

            ps.executeUpdate();
            System.out.println("Savings Account inserted");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void updateBalance(String accNo, double newBalance) {
        try {
            Connection con = DBConnection.getConnection();
            String query = "UPDATE accounts SET balance = ? WHERE account_number = ?";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setDouble(1, newBalance);
            ps.setString(2, accNo);

            ps.executeUpdate();
            System.out.println("Balance updated in DB");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static double getBalance(String accNo) {
        double balance = 0;

        try {
            Connection con = DBConnection.getConnection();
            String query = "SELECT balance FROM accounts WHERE account_number = ?";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, accNo);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                balance = rs.getDouble("balance");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return balance;
    }
}