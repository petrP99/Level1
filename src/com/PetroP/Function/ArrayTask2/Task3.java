package com.PetroP.Function.ArrayTask2;

import java.util.Arrays;

/**Дан одномерный массив целых чисел.
Написать функцию, которая принимает этот массив и разбивает на 3 других:
с только отрицательными числами, только положительными и только нули.
Если для какого-то из массивов не будет значений, то должен быть создан пустой массив.
Возвращает функция эти три массива в виде одного двумерного.
 Пример:
                              [-4, -18]
 [-4, 0, 1, 9, 0, -18, 3] -> [0, 0]
                             [1, 9, 3]
* */
public class Task3 {
    public static void main(String[] args) {
        int[] array = {17, -8, 11, 0, -6, 99, 5, 0,-68, 3,-7, -440};
        separationArray(array);
    }
    private static void separationArray(int[] array) {
        int lengthPositive = 0;
        int lengthNull = 0;
        int lengthNigative = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) lengthPositive++;
            else if (array[i] == 0) lengthNull++;
            else lengthNigative++;
        }
        int[] positiveArray = new int[lengthPositive];
        int[] nigativeArray = new int[lengthNigative];
        int[] nullArray = new int[lengthNull];

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < array.length; i++) {
                if (array[i] > 0) {
                    positiveArray[count0] = array[i];
                    count0++;
                }
                if (array[i] == 0) {
                    nullArray[count1] = array[i];
                    count1++;
                }
                if (array[i] < 0) {
                    nigativeArray[count2] = array[i];
                    count2++;
                               }
        }
        System.out.println(Arrays.toString(positiveArray));
        System.out.println(Arrays.toString(nullArray));
        System.out.println(Arrays.toString(nigativeArray));

}
        }




