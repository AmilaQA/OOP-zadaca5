package com.amila.qamp.OOP.zadaca5.Task1.Task1;

import java.util.ArrayList;
import java.util.List;

public class ATM {

    private List<Account> accountRegister;

    public ATM() {
        this.accountRegister = new ArrayList<>();
    }

    public double withdraw(double amount, String serialNumber, int passcode) {
        Account account = getAccount(serialNumber, passcode);
        account.withdraw(amount);
        return amount;
    }

    public double deposit(double amount, String serialNumber, int passcode) {
        Account account = getAccount(serialNumber, passcode);
        account.deposit(amount);
        return amount;
    }

    public void reset(String serialNumber, int passcode) {
        Account account = getAccount(serialNumber, passcode);
        account.reset();
    }

    public String showAccountState(String serialNumber, int passcode) {
        Account account = getAccount(serialNumber, passcode);
        return account.toString();
    }

    private Account getAccount(String serialNumber, int passcode) {
        if (passcode < 1000 || passcode > 9999)
            throw new IllegalArgumentException("Passcode is outside of the legal range.");

        for (Account account : accountRegister) {
            if (account.getSerialNumber().equals(serialNumber)) {
                if (account.getPasscode() != passcode) {
                    throw new IllegalStateException("Invalid passcode.");
                }
                return account;
            }
        }
        throw new IllegalStateException("Account not found.");
    }

    public void addAccount(Account account) {
        accountRegister.add(account);
    }
}





