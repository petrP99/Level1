package com.PetroP.Lesson8;

import java.util.*;

/**
 * Дан список чатов.
 * Каждый чат состоит из двух полей: название и количество пользователей в этом чате. *
 * Задача:
 * <p>
 * - Удалить с помощью итератора из этого списка те чаты, что содержат менее 1000 пользователей.
 * <p>
 * - Оставшиеся чаты отсортировать с помощью компараторов по убыванию по количеству пользователей,
 * а если это количество совпадает, то по названию в алфавитном порядке.
 * <p>
 * - Также предоставить сортировку чатов по названию по умолчанию.
 */

public class CollectionRunner {

    public static void main(String[] args) {
        List<Chat> list = Arrays.asList(
                new Chat("School", 5025),
                new Chat("Work", 5025),
                new Chat("Learning", 5025),
                new Chat("Music", 373),
                new Chat("Students", 2064),
                new Chat("Sports", 2600));
        List<Chat> chatsList = new ArrayList<>(list);

        chatsList.sort(Comparator.comparing(Chat::getName));
        System.out.println("Сортировка по названиию:" + "\n" + chatsList + "\n");

        chatsList.sort(Comparator.comparing(Chat::getUsers).reversed().thenComparing(Chat::getName));
        System.out.println("Сортировка по убыванию кол-ва юзеров, если ==, то по алфавиту:" + "\n" + chatsList + "\n");

        CollectionHelp.deleteChatLess1000Users(chatsList);
        System.out.println("Чаты, где меньше 1000 юзеров:" + "\n" + chatsList);
    }
}
