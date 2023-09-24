package com.PetroP.Lesson8_1;

import java.util.List;

public class Chat {

    private String name;
    private List<User> list;

    public Chat(String name, List<User> list) {
        this.name = name;
        this.list = list;
    }

    public List<User> getList() {
        return list;
    }
}
