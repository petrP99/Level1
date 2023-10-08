package com.PetroP.Lesson10;

public enum Courses {

    COURSE1(1),
    COURSE2(2),
    COURSE3(3),
    COURSE4(4),
    COURSE5(5);

    private final int index;

    Courses(int index) {
        this.index = index;
    }

    public int index() {
        return index;
    }

}
