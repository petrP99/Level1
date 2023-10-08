package com.PetroP.Lesson10;

/*
* Дан список студентов с полями:
- Имя
- Фамилия
- Номер курса в университете
- Список оценок за учебу
*
Преобразовать этот список студентов в ассоциативный массив, где ключом является номер курса, а значением:

*1.  Средняя оценка студентов этого курса, количество оценок у которых больше 3-х

*2.  Список студентов данного курса, но только с полями Имя и Фамилия.
  Список должен быть отсортированы по этим двум полям

3. Объект с двумя полями:
- Отсортированный список студентов с пункта 2
- Средняя оценка этих студентов

Подумать, как ассоциативный массив можно было представить в коде в виде отсортированного - TreeMap*/


import java.util.*;

import static com.PetroP.Lesson10.Courses.*;


public class Runner {
    public static void main(String[] args) {
        Map<Courses, OptionalDouble> mapByCourseAndAverage = new HashMap<>();
        Map<Courses, List<String>> mapByFullName = new HashMap<>();
        Map<Courses, Objects> mapByObjects = new HashMap<>();


        List<Student> studentsList = Arrays.asList(
                new Student("Petr", "Petrov", COURSE5, List.of(5, 6, 3, 2, 5, 8, 4)),
                new Student("Ivan", "Ivanov", COURSE3, List.of(6, 4, 4, 5, 7, 4)),
                new Student("Vova", "Putin", COURSE5, List.of(4, 3)),
                new Student("Sveta", "Svetikova", COURSE5, List.of(6, 6, 7, 4, 7, 9, 6)),
                new Student("Lariska", "Kryska", COURSE4, List.of(4, 7, 6, 4)),
                new Student("Misha", "Zadornov", COURSE3, List.of(10, 7, 9, 2, 2, 8, 8, 8)),
                new Student("Alex", "Shtamm", COURSE1, List.of(5, 10, 6, 8)),
                new Student("Masha", "Rasteryasha", COURSE1, List.of(4, 3)), //, 6, 5, 1, 5
                new Student("Pavel", "Apostol", COURSE2, List.of(1, 1, 5, 5, 7, 8, 10, 9)),
                new Student("Roma", "Romanov", COURSE2, List.of(10, 5, 2, 6, 6, 8, 5)),
                new Student("Sergei", "Esenin", COURSE2, List.of(3, 8, 6, 1, 1, 1, 7, 6)),
                new Student("Albert", "Eintshtein", COURSE5, List.of(6, 8, 1, 8, 9, 3, 7, 3)));


//        Helper.chooseByCourseAndAverage(studentsList, COURSE1, mapByCourseAndAverage);
//        Helper.chooseByFullName(studentsList, COURSE5, mapByFullName);
        Helper.chooseByObject(studentsList, COURSE1, mapByFullName);


    }


}

