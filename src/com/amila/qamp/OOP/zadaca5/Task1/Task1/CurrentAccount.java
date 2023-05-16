package com.amila.qamp.OOP.zadaca5.Task1.Task1;

public class CurrentAccount extends Account {
    public CurrentAccount (String serialNumber, int passcode, Owner owner, double balance) {
        super(serialNumber, passcode, owner, balance);
    }

    @Override
    public double withdraw (double amount) {
        balance -= amount;
        return amount;
    }

    public void deposit (double amount) {
        super.deposit(amount);
    }

    public void reset() {
        // do nothing
    }
}
