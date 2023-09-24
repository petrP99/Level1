package com.PetroP.Lesson7;

public class Student {


    private String firstName;
    private String lastName;
    private int age;
    private double averagePoint;


    public int getAge() {
        return age;
    }

    public double getAveragePoint() {
        return averagePoint;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return getFirstName() + " " + getLastName();
    }

    public Student(String firstName, String lastName, int age, double averagePoint) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.averagePoint = averagePoint;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", averagePoint=" + averagePoint +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }


}
