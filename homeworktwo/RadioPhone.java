package com.telran.org.homeworktwo;

public class RadioPhone extends Phone{


    public void radioCall() {
        this.setOwnNumber(" 07445675600 ");
        this.setPhoneName(" RadioPhone ");
        System.out.printf("The phone : " + getPhoneName() + getOwnNumber());
        super.call();

    }

    public void radioReceiveCall() {

        this.setOwnNumber(" 07445675600 ");
        this.setPhoneName(" RadioPhone ");
        System.out.printf("The phone : " + getPhoneName() + getOwnNumber());
        super.receiveCall();

    }
}
