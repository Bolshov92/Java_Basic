package com.telran.org.homeworkthree;

import java.util.Scanner;

public class NatWest extends ATM implements Convector {

    public NatWest() {
        super("NatWest", 1000, "USD");
    }

    CreditCard card = new CreditCard("1234567890", 1234, 500.0, "EURO");

    @Override
    public boolean withdrawMoney(CreditCard card, double amount) {
        if (card.getBalance() >= amount && balanceUSD >= amount) {
            card.setBalance(card.getBalance() - amount);
            balanceUSD -= amount;
            System.out.println(" Withdrawal " + amount + " USD was successful.");
            return true;
        } else {
            System.out.println("insufficient funds.");
            return false;
        }
    }

    @Override
    public void depositMoney(CreditCard card, double amount) {
        card.setBalance(card.getBalance() + amount);
        balanceUSD += amount;
        System.out.println("input deposit " + amount + " USD was successful.");
    }

    @Override
    public double convertToUSD(double amountInEuro) {

        return amountInEuro * 1.2;
    }


}









