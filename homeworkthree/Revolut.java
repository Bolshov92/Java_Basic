package com.telran.org.homeworkthree;

public class Revolut extends ATM {

    public Revolut() {
        super("Revolut", 4500, "USD");
    }

    @Override
    public boolean withdrawMoney(CreditCard card, double amount) {
        return false;
    }

    @Override
    public void depositMoney(CreditCard card, double amount) {

    }
}

