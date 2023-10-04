package com.telran.org.homeworktwo;

public class HomeWorkTwo {
    public static void main(String[] args) {

        Phone phone = new Phone();


        phone.call();
        phone.receiveCall();

        System.out.println();
        System.out.println();

        ButtonPhone buttonPhone = new ButtonPhone();
        RadioPhone radioPhone = new RadioPhone();
        SmartPhone smartPhone = new SmartPhone();

        buttonPhone.buttonCall();
        buttonPhone.buttonReceiveCall();

        System.out.println();
        System.out.println();

        radioPhone.radioCall();
        radioPhone.radioReceiveCall();

        System.out.println();
        System.out.println();

        smartPhone.smartCall();
        smartPhone.smartReceiveCall();





    }
}
