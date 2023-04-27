package com.amila.qamp.OOP.zadaca5.Task1.Task1;

public abstract class Account {
    protected String serialNumber;
    protected int passcode;
    protected double balance;
    protected Owner owner;

    public Account (String serialNumber, int passcode, Owner owner, double balance) {
        this.serialNumber = serialNumber;
        this.passcode = passcode;
        this.owner = owner;
        this.balance = balance;
    }
    public Owner getOwner() {
        return owner;
    }
    public String getSerialNumber() {
        return serialNumber;
    }

    public int getPasscode() {
        return passcode;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit (double amount) {
        balance += amount;
    }
    public double withdraw (double amount) {
        if (balance - amount < 0) {
            throw new IllegalStateException("Insufficient funds.");
        }
        balance -= amount;
        return amount;
    }
    public abstract void reset();

    public String showAccountState() {
        String ownerInfo = owner.getFirstName() + ", " + owner.getLastName() + ", " + owner.getAddress();
        String accountState = "Owner information: " + ownerInfo + "\nCurrent balance: " + balance;
        return accountState;
        //return "Owner: " + owner.toString() + "\n" + "Current balance: " + balance;
    }
}
