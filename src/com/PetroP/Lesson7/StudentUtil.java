package com.PetroP.Lesson7;

import java.util.List;
import java.util.ListIterator;

public final class StudentUtil {
    private StudentUtil() {
    }

    public static Student findBestStudent(List<Student> students) {
        Student bestStudent = null;
        for (Student student : students) {
            if (bestStudent == null || student.getAveragePoint() > bestStudent.getAveragePoint())
                bestStudent = student;
        }
        return bestStudent;
    }
}
