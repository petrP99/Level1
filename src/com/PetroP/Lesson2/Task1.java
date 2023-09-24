/*Дан одномерный массив целых чисел.
Написать функцию, удаляющую из него все отрицательные элементы (удалить - значит создать новый массив с только положительными элементами).
После удаления - умножить каждый элемент массива на его длину.
Например: [3, 5, -6, 3, 2, -9, 0, -123] -> [15, 25, 15, 10, 0]
Не забывать, что всю логику приложения нужно выносить в отдельные функции. main - только для тестирования написанного функционала.
* */

package com.PetroP.Lesson2;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
    int[] array = {10, -2, 6, -11, 0, 9, 99, -40, 17};
        editArray(array);
    }
    private static void editArray (int[] arr) {
        int temp;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) count++;
        }
        int[] newArray = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                temp = arr[i];
            newArray[index] = temp * count;
            index++; }
            }
        System.out.println(Arrays.toString(newArray));
    }
}
