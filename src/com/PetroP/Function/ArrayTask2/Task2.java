package com.PetroP.Function.ArrayTask2;

/**Дан одномерный массив символов.
Преобразовать его в одномерный массив чисел, где число - это код символа
 (любой символ - это число в памяти компьютера).
Например: [‘a’, ‘6’, ‘y’, ‘P’, ‘T’, ‘q’, ‘9’, ‘+’] -> [97, 54, 121, 80, 84, 113, 57, 43]
Далее определить среднее арифметическое всех элементов целочисленного массива и
вывести на консоль только те элементы, которые больше этого среднего арифметического.
* */

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {
        char[] array = {'a','g' , '5' ,'+' , 'v' ,'W' ,'4' ,'=' ,'|'};
        System.out.println("Массив символов: "+ Arrays.toString(array));
        transformation(array);
    }
    private static void transformation (char[] arr) {
        int[] intArray = new int[arr.length];
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int) arr[i];
            sum = sum + intArray[i];
        }
        System.out.println("Массив целых чисел: " + Arrays.toString(intArray));
        int average = sum / intArray.length;
        System.out.println("Среде-арифметическое: " + average);
        System.out.print("Значения, выше среде-арифметического: ");
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] >= average) System.out.print(intArray[i] +" ");
        }
    }
//    public static void main(String[] args) {
//        char[] array = {'a', '2', '+', '|', 'R', '_'};
//        System.out.println("Массив целых символов: "+ Arrays.toString(array));
//        System.out.println("Преобразованный массив целых чисел: " + Arrays.toString(converteToInt((array))));
//        printAverage(converteToInt(array));
//    }
//
//    private static int[] converteToInt (char[] c) {
//        String st = "";
//        int[] arrayInt = new int[c.length];
//        for (int i = 0; i < c.length; i++) {
//            st = st + c[i];
//            arrayInt[i] = st.charAt(i);
//        }
//        return arrayInt;
//    }
//
//    private static void printAverage (int[] mass) {
//        int sumInt = 0;
//        for (int i = 0; i < mass.length; i++)
//            sumInt = sumInt + mass[i];
//        int average = sumInt / mass.length;
//        System.out.println("Среднее арифметическое: "+ average);
//        System.out.print("Числа, больше среднего: ");
//        for (int i = 0; i < mass.length; i++) {
//            if (mass[i] >= average) System.out.print(mass[i] +" ");
//        }
//    }
}
