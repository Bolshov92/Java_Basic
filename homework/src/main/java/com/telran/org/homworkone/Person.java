package com.telran.org.homworkone;

public class Person {
    private String name;
    private String fullName;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person() {

    }

    public Person(String name, String fullName, int age) {
        this.name = name;
        this.fullName = fullName;
        this.age = age;

    }

    public void Move() {
        System.out.println("Viacheslav Bolshov is moving ");

    }

    public void Talk() {
        System.out.println("Tom Walker is talking ");

    }


}
