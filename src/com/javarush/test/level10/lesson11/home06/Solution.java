package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        String name = "noname";
        int age = 0;
        int weight = 0;
        int height = 0;
        String sport = "null";
        String profession = "null";

        public Human(String name, int age, int weight, int height, String sport, String profession) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.height = height;
            this.sport = sport;
            this.profession = profession;
        }

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name, int age, String sport, String profession) {
            this.name = name;
            this.age = age;
            this.sport = sport;
            this.profession = profession;
        }

        public Human(String name, int weight, int height, String sport, String profession) {
            this.name = name;
            this.weight = weight;
            this.height = height;
            this.sport = sport;
            this.profession = profession;
        }

        public Human(String name, int age, int weight, int height) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.height = height;
        }


        public Human(String name, int weight, int height, String sport) {
            this.name = name;
            this.weight = weight;
            this.height = height;
            this.sport = sport;
        }

        public Human(String name, int age, String profession) {
            this.name = name;
            this.age = age;
            this.profession = profession;
        }

        public Human(String name, String profession) {
            this.name = name;
            this.profession = profession;
        }

        public Human(int age, int weight, int height, String sport, String profession) {
            this.age = age;
            this.weight = weight;
            this.height = height;
            this.sport = sport;
            this.profession = profession;
        }
    }
}
