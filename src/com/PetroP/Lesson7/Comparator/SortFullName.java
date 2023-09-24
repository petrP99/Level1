package com.PetroP.Lesson7.Comparator;

import com.PetroP.Lesson7.Student;

import java.util.Comparator;

public class SortFullName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getFullName().compareTo(o2.getFullName());
    }
}

