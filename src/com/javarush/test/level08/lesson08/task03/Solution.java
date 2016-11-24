package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{

    public static void main(String[] args) {
        Map<String, String> map = createMap();

        for (Map.Entry<String, String> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }

    public static HashMap<String, String> createMap()
    {
        Map<String, String> map = new HashMap<>();

        map.put("Starzhinskiy", "Andrey");
        map.put("1Starzhinskiy", "Sergey");
        map.put("Starzhinskaya", "Elena");
        map.put("Makovey", "Anastasiya");
        map.put("Kamenskih", "Anastasiya");
        map.put("Buvalec", "Vlad");
        map.put("Suleymanova", "Raya");
        map.put("Suleymanov", "Ramis");
        map.put("Romanenko", "Anton");
        map.put("1Romanenko", "Vlad");

        return (HashMap<String, String>) map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getValue() .equals(name)) count++;
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getKey().equals(lastName)) count++;
        }
        return count;

    }
}
