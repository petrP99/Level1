package com.PetroP.Lesson4;

import java.util.Arrays;

/**
 * Дана строка с текстом, в котором есть цифры от 0 до 9.
 * Написать 2 метода:
 * - возвращающий массив цифр из переданной строки
 * - возвращающий сумму цифр из переданного целочисленного массива
 * Посчитать сумму всех чисел из строки
 * Например: * “Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?” -> 18 (8+1+2+4+3)
 */

public class Task2 {
    public static void main(String[] args) {
        String values = "a57b7Cpd1 s9d1dd1d0dd8s4ss2ss Di6ow0";
        System.out.println("Массив чисел: " + (Arrays.toString(charToDigital(values))));
        System.out.println("Сумма всех чисел массива: " + sumArray(charToDigital(values)));
    }

    private static int[] charToDigital(String string) {
        int arrayLength = 0;
        char[] charsArray = string.toCharArray();
        for (int i = 0; i < charsArray.length; i++) {
            if (Character.isDigit(charsArray[i]))
                arrayLength++;
        }

        int[] result = new int[arrayLength];
        int count = 0;
        for (int i = 0; i < charsArray.length; i++) {
            if (Character.isDigit(charsArray[i])) {
                result[count] = Character.getNumericValue(charsArray[i]);
                count++;
            }
        }
        return result;
    }

    private static int sumArray(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum = sum + i;
        }
        return sum;
    }

}
