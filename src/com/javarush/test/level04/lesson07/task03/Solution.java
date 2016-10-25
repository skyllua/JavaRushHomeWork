package com.javarush.test.level04.lesson07.task03;

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
*/

import java.io.*;
import java.util.Arrays;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        final int len = 3;

        int[] arr = new int[len];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(reader.readLine());

            if (arr[i] > 0) num++;
        }
        System.out.println(num);
    }
}
