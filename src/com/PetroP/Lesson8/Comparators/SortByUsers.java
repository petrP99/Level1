package com.PetroP.Lesson8.Comparators;

import com.PetroP.Lesson8.Chat;

import java.util.Comparator;

public class SortByUsers implements Comparator<Chat> {
    @Override
    public int compare(Chat o1, Chat o2) {
        return Integer.compare(o1.getUsers(), o2.getUsers());
    }
}
