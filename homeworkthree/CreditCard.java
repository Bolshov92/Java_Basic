package com.telran.org.homeworkthree;

public class CreditCard {

    private String cardNumber;
    private int pin;
    private double balance;
    private String currencyType;

    public CreditCard(String cardNumber, int pin, double balance, String currencyType) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.balance = balance;
        this.currencyType = currencyType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }



    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getPin() {
        return pin;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
    }
}



