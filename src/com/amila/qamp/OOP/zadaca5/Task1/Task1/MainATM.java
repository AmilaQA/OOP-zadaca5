package com.amila.qamp.OOP.zadaca5.Task1.Task1;

public class MainATM {
    public static void main(String[] args) {
        Owner owner = new Owner("Amila", "Gicic", "E.Sehovica");
        CurrentAccount currentAccount = new CurrentAccount("123456", 1234, owner, 1000.23);
        SavingsAccount savingsAccount = new SavingsAccount("2222222", 4321, owner, 1000, 3, 15);
        ATM atm = new ATM();
        atm.addAccount(currentAccount);

        try {
            atm.withdraw(200, "123456", 12356);
            atm.withdraw(200, "123456", 1235);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            atm.withdraw(200, "123456", 1235);
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            atm.withdraw(200, "12345677", 1234);
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        ATM atm2 = new ATM();
        atm2.addAccount(savingsAccount);

        try {
            atm2.withdraw(1200, "2222222", 4321);
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}