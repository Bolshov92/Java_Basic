package com.telran.org.homeworktwo;

public class Phone extends com.telran.org.homworkone.Phone {

    private String PhoneName;
    private String ownNumber;

    public String getOwnNumber() {
        return ownNumber;
    }

    public void setOwnNumber(String ownNumber) {
        this.ownNumber = ownNumber;
    }

    public String getPhoneName() {
        return PhoneName;
    }

    public void setPhoneName(String phoneName) {
        PhoneName = phoneName;
    }

    public void call() {
        this.setNumber("07317888908");
        System.out.println("Try to make a call to number : " + getNumber());

    }

    public void receiveCall() {

        this.setNumber("07519646748");
        System.out.println("Try to receive a call from number : " + getNumber());
    }







}


