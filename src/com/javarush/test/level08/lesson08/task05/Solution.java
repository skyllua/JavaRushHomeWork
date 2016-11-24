package com.javarush.test.level08.lesson08.task05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution {

    public static void main(String[] args) {
        Map<String, String> map = createMap();

        //removeItemFromMapByValue((HashMap<String, String>) map, "Andrey");

        removeTheFirstNameDuplicates((HashMap<String, String>) map);

        for (Map.Entry<String, String> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }

    public static HashMap<String, String> createMap() {
        Map<String, String> map = new HashMap<>();

        map.put("Starzhinskiy", "Andrey");
        map.put("1Starzhinskiy", "Sergey");
        map.put("Starzhinskaya", "Elena");
        map.put("Makovey", "Anastasiya");
        map.put("Kamenskih", "Anastasiya");
        map.put("Buvalec", "Vlad");
        map.put("Suleymanova", "Raya");
        map.put("Suleymanov", "Ramis");
        map.put("Romanenko", "Andrey");
        map.put("1Romanenko", "Vlad");

        return (HashMap<String, String>) map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        List<String> nameList = new ArrayList<>();
        for (Map.Entry<String, String> pair : map.entrySet()) {
            int countDublicate = 0;
            for (String name : map.values()) {
                if (pair.getValue().equals(name)) countDublicate++;
            }
            if (countDublicate >= 2) nameList.add(pair.getValue());
        }

        for (int i = 0; i < nameList.size(); i++) {
            removeItemFromMapByValue(map, nameList.get(i));
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
