package com.telran.org.homeworkthree;

public abstract class ATM {

    protected String name;
    protected double balanceUSD;
    protected String currencyType;

    public ATM(String name, double balanceUSD, String currencyType) {
        this.name = name;
        this.balanceUSD = balanceUSD;
        this.currencyType = currencyType;
    }

    public abstract boolean withdrawMoney(CreditCard card, double amount);

    public abstract void depositMoney(CreditCard card, double amount);
}


