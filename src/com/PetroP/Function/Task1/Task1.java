package com.PetroP.Function.Task1;
/*
Имеются три числа - день, месяц и год, вводимые пользователем с консоли.
Вывести дату следующего дня в формате "День.Месяц.Год".
Учесть переход на следующий месяц, а также следующий год.
Форматирование строки "День.Месяц.Год" вынести в отдельную функцию.
* */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int day = 0;
        int month = 0;
        int year = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Введи число дня от 1 до 31: ");
        while (day == 0) {
            int temp = sc.nextInt();
            if (temp <= 0 || temp > 31) System.err.print("Неверно! введи число дня от 1 до 31: ");
            else day = temp;
        }
        System.out.print("Введи число месяца от 1 до 12: ");
        while (month == 0) {
            int temp = sc.nextInt();
            if (temp <= 0 || temp > 12) System.err.print("Неверно! введи число месяца от 1 до 12:  ");
            else month = temp;
        }
        System.out.print("Введи год от 1 до 2023: ");
        while (year == 0) {
            int temp = sc.nextInt();
            if (temp < 1 || temp > 2023) System.err.print("Неверно! введи год от 1 до 2023: ");
            else year = temp;
        }
        dataPrint(day, month, year);
    }
    public static void dataPrint(int day, int month, int year) {
        System.out.printf( "\nВведенная дата: %d.%d.%d", day, month, year);
        System.out.println();
        System.out.print("Дата следующего дня: " + nextData(day, month, year));
    }

    public static String nextData(int day, int month, int year) {
        if (day == 31 && month == 12) {
            day = 1;
            month = 1;
            year++;
        } else if (day == 31) {
            day = 1;
            month ++;
        } else day++;

        return day + "." + month + "." + year;
    }
}