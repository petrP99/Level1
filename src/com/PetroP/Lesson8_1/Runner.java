package com.PetroP.Lesson8_1;

/*Дан список чатов с предыдущего задания, только вместо поля “количество пользователей”
будет список объектов типа Пользователь, который имеет 3 поля: id (целочисленный идентификатор)
имя и возраст.
Задача:

- Преобразовать список чатов в один список пользователей всех чатов, возраст которых больше 18 лет
- С помощью итератора посчитать средний возраст всех оставшихся пользователей.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<User> user1 = Arrays.asList(
                new User(7, "Petr", 20),
                new User(6, "Ivan", 44),
                new User(3, "Igor", 12));

        List<User> user2 = Arrays.asList(
                new User(21, "Vova", 10),
                new User(54, "Sveta", 17),
                new User(64, "Larisa", 31));

        List<User> user3 = Arrays.asList(
                new User(14, "Misha", 14),
                new User(55, "Alex", 27),
                new User(16, "Masha", 21));

        List<User> user4 = Arrays.asList(
                new User(11, "Pavel", 33),
                new User(8, "Roma", 8),
                new User(9, "Sergei", 63));

        List<User> userList1 = new ArrayList<>(user1);
        List<User> userList2 = new ArrayList<>(user2);
        List<User> userList3 = new ArrayList<>(user3);
        List<User> userList4 = new ArrayList<>(user4);

        List<Chat> chat = Arrays.asList(
                new Chat("School", userList1),
                new Chat("Work", userList2),
                new Chat("Learning", userList3),
                new Chat("Music", userList4));

        List<Chat> chatsList = new ArrayList<>(chat);

        System.out.println(ChatHelp.formatToSingleList(chatsList));
        System.out.println("Средний возраст участника, младше 18: " + ChatHelp.calculateAverageAge(chatsList));
    }
}
