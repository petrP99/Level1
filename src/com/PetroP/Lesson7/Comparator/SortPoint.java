package com.PetroP.Lesson7.Comparator;

import com.PetroP.Lesson7.Student;

import java.util.Comparator;

public class SortPoint implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.getAveragePoint(), o2.getAveragePoint());
    }
}
