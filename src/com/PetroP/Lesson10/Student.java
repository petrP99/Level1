package com.PetroP.Lesson10;


import java.util.List;
import java.util.Objects;

public class Student {


    private final String firstName;
    private final String lastName;
    private final Courses course;
    private final List<Integer> marks;

    public Student(String firstName, String lastName, Courses course, List<Integer> marks) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
        this.marks = marks;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Courses getCourse() {
        return course;
    }

    public String getFullName() {
        return getFirstName() + " " + getLastName();
    }

    public List<Integer> getMarks() {
        return marks;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", course=" + course +
                ", marks=" + marks +
                '}';
    }
}
