package com.PetroP.Lesson10;

/*
* Преобразовать этот список студентов в ассоциативный массив, где ключом является номер курса, а значением:
Средняя оценка студентов этого курса, количество оценок у которых больше 3-х
Список студентов данного курса, но только с полями Имя и Фамилия.
Список должен быть отсортированы по этим двум полям*/

import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

class Helper {


    public static void chooseByCourseAndAverage(List<Student> list, Courses course, Map<Courses, OptionalDouble> mapByCourseAndAverage) {
        OptionalDouble average = list.stream()
                .filter(value -> value.getCourse() == course)
                .filter(value -> value.getMarks().size() > 3)
                .flatMapToDouble(value -> value.getMarks()
                        .stream().mapToDouble(Integer::doubleValue))
                .average();
        mapByCourseAndAverage.put(course, average);
        System.out.println(mapByCourseAndAverage);
    }

    //Список студентов данного курса, но только с полями Имя и Фамилия.

    public static void chooseByFullName(List<Student> list, Courses course, Map<Courses, List<String>> mapByFullName) {
        List<String> collect = list.stream()
                .filter(value -> value.getCourse() == course)
                .map(Student::getFullName)
                .sorted()
                .collect(Collectors.toList());
        mapByFullName.put(course, collect);
        System.out.println(mapByFullName);
    }

    //3. Объект с двумя полями:
    //- Отсортированный список студентов с пункта 2
    //- Средняя оценка этих студентов
    //Map<List<Student>, Double>

    public static void chooseByObject(List<Student> list, Courses course, Map<Courses, List<String>> mapByFullName) {
        chooseByFullName(list, course, mapByFullName);
        Map<String, List<List<Integer>>> collect = list.stream()
                .collect(Collectors.groupingBy(Student::getFullName, Collectors.mapping(Student::getMarks, Collectors.toList())));


        OptionalDouble average = list.stream()
                .flatMapToDouble(value -> value.getMarks()
                        .stream().mapToDouble(Integer::doubleValue))
                .average();

    }
}




