package com.PetroP.Lesson7;

import com.PetroP.Lesson7.Comparator.SortAge;
import com.PetroP.Lesson7.Comparator.SortFullName;
import com.PetroP.Lesson7.Comparator.SortPoint;

import java.sql.SQLOutput;
import java.util.*;



/*Создать класс Student, представляющий собой ученика.
Добавить ему данные об имени, фамилии, возрасте и среднем балле за год.
Создать список (List) учеников. Найти и вывести ученика с самым высоким
средним баллом используя итератор.
Отсортировать и вывести список учеников по полному имени (имя + фамилия),
 возрасту и среднему баллу, используя компараторы
* */

public class ListRunner {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Petr", "Petrov",20,9.5),
                new Student("Ivan", "Ivanov",18,8.4),
                new Student("Sidr", "Sidrov",22,8.2),
                new Student("Lena", "lenova",21,9.2),
                new Student("Sveta", "Svetikova",20,8.6),
                new Student("Igor", "Igorev",19,8.9));

        System.out.println(StudentUtil.findBestStudent(students));
        students.sort(new SortAge());
        System.out.println(students);

        students.sort(new SortPoint());
        System.out.println(students);

        students.sort(new SortFullName());
        System.out.println(students);




    }
}
