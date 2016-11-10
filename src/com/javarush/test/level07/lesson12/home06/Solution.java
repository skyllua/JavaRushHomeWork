package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human fatherGFather = new Human("Poul", true, 75, null, null);
        Human fatherGMother = new Human("Jennifer", false, 69, null, null);
        Human motherGFather = new Human("Robert", true, 73, null, null);
        Human motherGMother = new Human("Ria", false, 71, null, null);

        Human father = new Human("Christofer", true, 53, fatherGFather, fatherGMother);
        Human mother = new Human("Mia", false, 47, motherGFather, motherGMother);

        Human son = new Human("Terry", true, 27, father, mother);
        Human son1 = new Human("Adam", true, 24, father, mother);
        Human daughter = new Human("Airis", false, 19, father, mother);

        System.out.println(fatherGFather.toString());
        System.out.println(fatherGMother.toString());
        System.out.println(motherGFather.toString());
        System.out.println(motherGMother.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(son.toString());
        System.out.println(son1.toString());
        System.out.println(daughter.toString());
    }

    public static class Human
    {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
