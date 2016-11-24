package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        s = UpperFirstCharacter(s);
        System.out.println(s);
    }

    private static String UpperFirstCharacter(String s) {
        String text = "";
        boolean findedWord = false;
        for (int i = 0; i < s.length(); i++) {
            String ch = s.substring(i, i+1);
            text += ch;
            if ((!ch.equals(" ")) && (!findedWord)) {
                findedWord = true;
                text = text.substring(0, text.length()-1);
                text += ch.toUpperCase();
            } else if (ch.equals(" ")) findedWord = false;
        }

        return text;
    }


}
