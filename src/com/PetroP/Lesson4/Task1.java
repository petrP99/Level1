package com.PetroP.Lesson4;

/**
 * Дана строка.
 * Удалить из нее все повторяющиеся символы без учета регистра, если они идут друг за другом.
 * Также удалить пробелы.
 * Результат привести к верхнему регистру.
 * * Например:  "abc Cpddd Dio OsfWw" -> "ABCPDIOSFW"
 */


public class Task1 {
    public static void main(String[] args) {
        String values = "abc Cpdddsh q 4 5sss Dio OsfWw";
        System.out.println(result(values));
    }

    private static String result(String string) {
        StringBuilder sb = new StringBuilder(string.replaceAll(" ", "").toUpperCase());
        for (int i = 1; i < sb.length(); i++) {
            if (sb.charAt(i) == sb.charAt(i - 1)) {
                sb.deleteCharAt(i - 1);
                i--;
            }
        }
        return sb.toString();
    }
}
