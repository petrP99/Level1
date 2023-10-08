package com.PetroP.Lesson10.Lections;

public class Person {
    private String firstName;
    private String lasttName;
    private  int age;

    public Person(String firstName, String lasttName, int age) {
        this.firstName = firstName;
        this.lasttName = lasttName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLasttName() {
        return lasttName;
    }

    public int getAge() {
        return age;
    }
}
