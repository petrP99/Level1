package com.PetroP.Lesson8;

import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class CollectionHelp {

    public static void deleteChatLess1000Users(List<Chat> list) {
        for (ListIterator<Chat> listIterator = list.listIterator(); listIterator.hasNext(); ) {
            Chat chat = listIterator.next();
            if (chat.getUsers() < 1000)
                listIterator.remove();
        }
    }
}

