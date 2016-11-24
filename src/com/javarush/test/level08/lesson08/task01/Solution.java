package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        Set<String> set = new HashSet<>();

        set.add("Л1");
        set.add("Л12");
        set.add("Лf1");
        set.add("Л1ds");
        set.add("Л1fsdf");
        set.add("Л1sdf");
        set.add("Лrsw1");
        set.add("Л13fs1");
        set.add("Лfsdf31");
        set.add("Л4sdf1");
        set.add("Лzxc1");
        set.add("Л1gfdgc");
        set.add("Л1s32");
        set.add("Лffdd1");
        set.add("Л1sdf2");
        set.add("Л1sf11");
        set.add("Л1f4tg");
        set.add("Л1sdf1s");
        set.add("Л1sfd");
        set.add("Л1gfgx");

        return (HashSet<String>) set;
    }
}
