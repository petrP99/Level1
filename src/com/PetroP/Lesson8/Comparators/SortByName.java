package com.PetroP.Lesson8.Comparators;

import com.PetroP.Lesson8.Chat;

import java.util.Comparator;

public class SortByName implements Comparator<Chat> {
    @Override
    public int compare(Chat o1, Chat o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
