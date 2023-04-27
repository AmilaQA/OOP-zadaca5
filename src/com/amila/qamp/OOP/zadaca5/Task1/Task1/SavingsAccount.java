package com.amila.qamp.OOP.zadaca5.Task1.Task1;

public class SavingsAccount extends Account {
    private double dailyLimit;
    private int transactionsLeft = 1000;
    public SavingsAccount (String serialNumber, int passcode, Owner owner, double balance, int dailyLimit, int transactionsLeft) {
        super(serialNumber, passcode, owner, balance);
        this.dailyLimit = dailyLimit;
        this.transactionsLeft = transactionsLeft;
    }
    @Override
    public double withdraw (double amount) {
        if (getBalance() - amount < 0) {
            throw new IllegalStateException("Cannot have negative balance.");
        }
        if (dailyLimit > 3) {
            throw new IllegalStateException("Daily limit exceeded.");
        }
        if (transactionsLeft == 0) {
            throw new IllegalStateException("Transactions limit exceeded.");
        }
        deposit(-amount);
        transactionsLeft --;
        dailyLimit++;
        return amount;
    }
    @Override
    public void deposit (double amount) {
        if (transactionsLeft == 0) {
            throw new IllegalStateException("Transaction limit exceeded.");
        }
        super.deposit(amount);
        transactionsLeft --;
        dailyLimit++;
    }
    @Override
    public void reset() {
        transactionsLeft = 3;
    }
    public String showAccountState() {
        String accountState = super.showAccountState();
        accountState += "Current daily limit: " + dailyLimit + ", number of available transactions: " + transactionsLeft;
        return accountState;
    }
}
