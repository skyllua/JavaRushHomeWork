package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;
import java.util.List;

public class Solution
{
    public static void main(String[] args)
    {
        Human grandfather0 = new Human("Poll", true, 78);
        Human grandmother0 = new Human("Monica", false, 73);

        Human grandfather1 = new Human("David", true, 75);
        Human grandmother1 = new Human("Angela", false, 72);

        Human father = new Human("Robert", true, 51);
        Human mother = new Human("Kate", false, 47);
        grandfather0.addShildren(father);
        grandmother0.addShildren(father);
        grandfather1.addShildren(mother);
        grandmother1.addShildren(mother);

        Human child1 = new Human("Christian", true, 24);
        Human child2 = new Human("Liza", false, 19);
        Human child3 = new Human("Artur", true, 9);
        father.addShildren(child1, child2, child3);
        mother.addShildren(child1, child2, child3);

        System.out.println(grandfather0.toString());
        System.out.println(grandmother0.toString());
        System.out.println(grandfather1.toString());
        System.out.println(grandmother1.toString());

        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());

    }

    public static class Human
    {
        private String name;
        private boolean sex;
        private int age;
        private List<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public void addShildren(Human ... child) {
            for (int i = 0; i < child.length; i++) {
                children.add(child[i]);
            }
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
