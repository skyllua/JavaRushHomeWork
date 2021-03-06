package com.javarush.test.level04.lesson04.task06;

/* День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название «понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
если введен номер больше или меньше 7 – вывести «такого дня недели не существует».
Пример для номера 5:
пятница
Пример для номера 10:
такого дня недели не существует
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(weeksIntToString(Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine())));
    }

    public static String weeksIntToString(int week) {
        String sWeek = "";
        switch (week) {
            case 1:
                sWeek = "понедельник";
                break;
            case 2:
                sWeek = "вторник";
                break;
            case 3:
                sWeek = "среда";
                break;
            case 4:
                sWeek = "четверг";
                break;
            case 5:
                sWeek = "пятница";
                break;
            case 6:
                sWeek = "суббота";
                break;
            case 7:
                sWeek = "воскресенье";
                break;
            default:
                sWeek = "такого дня недели не существует";
        }

        return sWeek;
    }

}