package com.telran.org.homeworkthree;

import java.util.Scanner;


public class AtmApp {
    public static void main(String[] args) {
        NatWest natWest = new NatWest();
        Revolut revolut = new Revolut();
        LoydBank loydBank = new LoydBank();
        CreditCard card = new CreditCard("1234567890", 1234, 500.0, "EURO");

        ATM[] atms = {natWest, revolut, loydBank};
        for (ATM atm : atms) {
            if (atm instanceof Convector) {

                Scanner scanner = new Scanner(System.in);
                System.out.println("Welcome to NatWestATM");
                System.out.print("Type pin : ");
                int enterPin = scanner.nextInt();

                if (enterPin == card.getPin()) {
                    System.out.println("Authorization was successful");
                    System.out.print(" Enter amount : ");
                    double withdrawAmount = scanner.nextDouble();
                    double usdAmount = ((Convector) atm).convertToUSD(withdrawAmount);

                    if (natWest.withdrawMoney(card, usdAmount)) {
                        System.out.println("Operation Completed");
                        System.out.println("Card information : ");
                        System.out.println("Card number : " + card.getCardNumber());
                        System.out.println("Balance : " + card.getBalance() + " " + card.getCurrencyType());
                        System.out.println();
                        System.out.println();
                        System.out.println("ATM information : " + "NatWest");
                        System.out.println("Balance : " + natWest.balanceUSD + natWest.currencyType);
                    } else {

                        System.out.println("Operation failed : ");

                    }
                }
                System.out.println("Incorrect Pin");
            }

        }
    }
}






