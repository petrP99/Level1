package com.PetroP.Lesson8_1;

import java.util.*;

public final class ChatHelp {

    private final static int AGE18 = 18;

    private ChatHelp() {
    }

    public static List<User> formatToSingleList(List<Chat> chatsList) {
        List<User> usersOver18 = new ArrayList<>();
        for (Chat chat : chatsList) {
            for (User user : chat.getList()) {
                if (user.getAge() >= AGE18) usersOver18.add(user);
            }
        }
        return usersOver18;
    }

    public static double calculateAverageAge(List<Chat> chatsList) {
        List<User> usersLess18 = new ArrayList<>();
        int temp = 0;
        for (Chat chat : chatsList) {
            for (User user : chat.getList()) {
                if (user.getAge() < AGE18) {
                    usersLess18.add(user);
                    temp += user.getAge();
                }
            }
        }
        return (double) temp / usersLess18.size();
    }
}
