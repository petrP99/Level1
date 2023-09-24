package com.PetroP.Lesson7.Comparator;

import com.PetroP.Lesson7.Student;

import java.util.Comparator;

public class SortAge implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o2.getAge(), o1.getAge());
    }
}
