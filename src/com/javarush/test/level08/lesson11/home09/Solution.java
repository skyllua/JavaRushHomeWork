package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("JANUARY 1 2000"));
        System.out.println(isDateOdd("JANUARY 2 2020"));
        System.out.println(isDateOdd("DECEMBER 4 2016"));
    }

    public static boolean isDateOdd(String date) {
        Date ndate = new Date(date);
        Date startDate = new Date("JANUARY 1 1980");
        startDate.setYear(ndate.getYear());
        long msInDay = 1000*60*60*24;

        if (((ndate.getTime()-startDate.getTime()) / msInDay)%2 == 0) return true;
        else return false;
    }
}
