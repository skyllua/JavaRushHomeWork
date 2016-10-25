package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[3];

        array[0] = Integer.parseInt(reader.readLine());
        array[1] = Integer.parseInt(reader.readLine());
        array[2] = Integer.parseInt(reader.readLine());

        int buff = 0;

        if (array[0] < array[1]) {
            buff = array[0];
            array[0] = array[1];
            array[1] = buff;
        }

        if (array[1] < array[2]) {
            buff = array[1];
            array[1] = array[2];
            array[2] = buff;
        }

        if (array[0] < array[1]) {
            buff = array[0];
            array[0] = array[1];
            array[1] = buff;
        }

        System.out.println(array[0] + " " + array[1] + " " + array[2]);

    }

}
