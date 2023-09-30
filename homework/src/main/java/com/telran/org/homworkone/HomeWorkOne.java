package com.telran.org.homworkone;

public class HomeWorkOne {

    public static void main(String[] args) {

        Person person = new Person();
        person.setName("Viacheslav");
        person.setFullName("Bolshov Viacheslav");
        person.setAge(30);


        Person person2 = new Person("Tom", " Tom Walker ", 35);

        Person moving = new Person();
        Person talking = new Person();

        moving.Move();
        talking.Talk();

        Phone phoneOne = new Phone();
        Phone phoneTwo = new Phone();
        Phone phoneThree = new Phone();

        phoneOne.setNumber(" 0761247686 ");
        phoneOne.setModel(" Iphone ");
        phoneOne.setWeight(0.111);

        phoneTwo.setNumber(" 0765144848 ");
        phoneTwo.setModel(" Samsung ");
        phoneTwo.setWeight(0.118);

        phoneThree.setNumber(" 0766143868 ");
        phoneThree.setModel(" Nokia ");
        phoneThree.setWeight(0.158);

        System.out.println(" Phone one - Number : " + phoneOne.getNumber() + ". " + "Model : " + phoneOne.getModel() + "." + " Weight : " + phoneOne.getWeight());
        System.out.println(" Phone two - Number : " + phoneTwo.getNumber() + ". " + "Model : " + phoneTwo.getModel() + "." + " Weight : " + phoneTwo.getWeight());
        System.out.println(" Phone three - Number : " + phoneThree.getNumber() + ". " + "Model : " + phoneThree.getModel() + "." + " Weight : " + phoneThree.getWeight());

        System.out.println();
        System.out.println();;
        Phone call = new Phone();

        call.receiveCall("Tom");

        System.out.println("Calling : " + call.getName() + phoneOne.getNumber());

        call.receiveCall("Viacheslav");
        System.out.println("Calling : " + call.getName() + phoneTwo.getNumber());

        call.receiveCall("Jake");
        System.out.println("Calling : " + call.getName() + phoneThree.getNumber());
    }


}

