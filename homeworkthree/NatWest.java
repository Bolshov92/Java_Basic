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

    public void ATMOperation() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to NatWestATM");
        System.out.print("Type pin : ");
        int enterPin = scanner.nextInt();

        if(enterPin == card.getPin()){
            System.out.println("Authorization was successful");
            System.out.print(" Enter amount : ");
            double withdrawAmount = scanner.nextDouble();
            double usdAmount = convertToUSD(withdrawAmount);

            if(withdrawMoney(card, usdAmount)){
                System.out.println("Operation Completed");
                System.out.println("Card information : ");
                System.out.println("Card number : " + card.getCardNumber());
                System.out.println("Balance : " + card.getBalance() + " " + card.getCurrencyType());
                System.out.println();
                System.out.println();
                System.out.println("ATM information : " + "NatWest" );
                System.out.println("Balance : " + balanceUSD  + currencyType);
            } else {
                System.out.println("Operation failed : ");
            }
        } else {
            System.out.println("Incorrect Pin. Operation failed.");
        }

    }

        }









