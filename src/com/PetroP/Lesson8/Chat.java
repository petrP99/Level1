package com.PetroP.Lesson8;

import com.PetroP.Lesson8_1.User;

import java.util.List;

public class Chat {

    private String name;
    private int users;

    public Chat(String name, int users) {
        this.name = name;
        this.users = users;
    }

    public String getName() {
        return name;
    }

    public int getUsers() {
        return users;
    }

    @Override
    public String toString() {
        return "\n" + "Chat{" +
                "name='" + name + '\'' +
                ", users=" + users +
                '}';
    }
}
