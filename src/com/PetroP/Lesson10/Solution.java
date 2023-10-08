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

class Solution {

    //Средняя оценка студентов этого курса, количество оценок у которых больше 3-х

    public static Map<Courses, OptionalDouble> chooseByCourseAndAverage(List<Student> list, Courses course, Map<Courses, OptionalDouble> mapByCourseAndAverage) {
        OptionalDouble average = list.stream()
                .filter(value -> value.getCourse() == course)
                .filter(value -> value.getMarks().size() > 3)
                .flatMapToDouble(value -> value.getMarks()
                        .stream().mapToDouble(Integer::doubleValue))
                .average();
        mapByCourseAndAverage.put(course, average);
        System.out.println(mapByCourseAndAverage);
        return mapByCourseAndAverage;
    }

    //Список студентов данного курса, но только с полями Имя и Фамилия.

    public static List<String> chooseByFullName(List<Student> studentList, Courses course, List<String> sortedStudentList, Map<Courses, List<String>> mapByFullName) {
        sortedStudentList = studentList.stream()
                .filter(value -> value.getCourse() == course)
                .map(Student::getFullName)
                .sorted()
                .collect(Collectors.toList());
        mapByFullName.put(course, sortedStudentList);
        System.out.println(mapByFullName);
        return sortedStudentList;
    }


}




