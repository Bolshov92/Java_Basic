package com.telran.org.homeworktwo;

public class SmartPhone extends Phone{

    public void smartCall() {
        this.setOwnNumber(" 07845676809 ");
        this.setPhoneName(" SmartPhone ");
        System.out.printf("The phone : " + getPhoneName() + getOwnNumber());
        super.call();

    }

    public void smartReceiveCall() {

        this.setOwnNumber(" 07845676809 ");
        this.setPhoneName(" SmartPhone ");
        System.out.printf("The phone : " + getPhoneName() + getOwnNumber());
        super.receiveCall();

    }


}
