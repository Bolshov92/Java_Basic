package com.telran.org.homeworktwo;

public class ButtonPhone extends Phone {


    public void buttonCall() {
        this.setOwnNumber(" 07512389123 ");
        this.setPhoneName(" ButtonPhone ");
        System.out.printf("The phone : " + getPhoneName() + getOwnNumber());
        super.call();

    }

    public void buttonReceiveCall() {

        this.setOwnNumber(" 07512389123 ");
        this.setPhoneName(" ButtonPhone ");
        System.out.printf("The phone : " + getPhoneName() + getOwnNumber());
        super.receiveCall();

    }
}
