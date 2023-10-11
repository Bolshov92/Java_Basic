package com.telran.org.homeworkthree;

import java.util.Scanner;

public class LoydBank extends ATM {


    public LoydBank() {
        super("LoydBank", 890, "USD");
    }

    @Override
    public boolean withdrawMoney(CreditCard card, double amount) {
        return false;
    }

    @Override
    public void depositMoney(CreditCard card, double amount) {

    }
}
