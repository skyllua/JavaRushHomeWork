package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static HashSet<Integer> createSet()
    {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < 20; i++) {
            boolean isAbsent;
            int rnd;
            do {
                isAbsent = true;
                rnd = (int) (Math.random() * 100);
                for (Integer num : set) {
                    if (rnd == num)  {
                        isAbsent = false;
                        break;
                    }
                }
            } while(!isAbsent);
            set.add(rnd);
        }

        return (HashSet<Integer>) set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
//        Set<Integer> removeMore10Set = new HashSet<>();
//        for (Integer num : set) {
//            if (num > 10) {
//                removeMore10Set.add(num);
//            }
//        }
//
//        for (Integer num : removeMore10Set) {
//            set.remove(num);
//        }

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() > 10) iterator.remove();
        }

        return set;
    }
}
