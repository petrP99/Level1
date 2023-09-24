/**
 * Дан одномерный массив целых чисел.
 * Написать функцию, которая принимает этот массив и разбивает на 3 других: с только отрицательными числами, только положительными и только нули.
 * Если для какого-то из массивов не будет значений, то должен быть создан пустой массив.
 * Возвращает функция эти три массива в виде одного двумерного.
 * Пример:
 * [-4, -18]
 * [-4, 0, 1, 9, 0, -18, 3] -> [0, 0]
 * [1, 9, 3]
 **/

package com.PetroP.Lesson2;


public class Example {

    public static void main(String[] args) {
        int[] array = {17, -8, 11, 0, -6, 99, 5, 0, -68, 3, -7, -440};
        printResultArray(splitArray(array));
    }

    private static int[][] splitArray(int[] array) {
        int lengthPositive = 0;
        int lengthNull = 0;
        int lengthNigative = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) lengthPositive++;
            else if (array[i] == 0) lengthNull++;
            else lengthNigative++;
        }

        int[][] resultArray = new int[3][];
        resultArray[0] = new int[lengthPositive];
        resultArray[1] = new int[lengthNull];
        resultArray[2] = new int[lengthNigative];

        int countPositive = 0;
        int countNull = 0;
        int countNigative = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) resultArray[0][countPositive++] = array[i];
            else if (array[i] == 0) resultArray[1][countNull++] = array[i];
            else resultArray[2][countNigative++] = array[i];
        }
        return resultArray;
    }

    private static void printResultArray(int[][] array) {
        for (int[] value : array) {
            for (int i : value) System.out.print(i + "\t");
            System.out.println();
        }
    }
        }
