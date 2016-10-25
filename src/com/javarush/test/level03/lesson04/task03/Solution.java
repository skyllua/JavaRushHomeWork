package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution {
    public static void main(String[] args) {
//        Zerg[] zergs = new Zerg[10];
//        Protos[] protoses = new Protos[5];
//        Terran[] terrans = new Terran[12];

//        for (int i = 0; i < zergs.length; i++)
//        {
//            zergs[i] = new Zerg();
//            zergs[i].name = "zerg" + i;
//        }
//
//        for (int i = 0; i < protoses.length; i++)
//        {
//            protoses[i] = new Protos();
//            protoses[i].name = "protos" + i;
//        }
//
//        for (int i = 0; i < terrans.length; i++)
//        {
//            terrans[i] = new Terran();
//            terrans[i].name = "terran" + i;
//        }

        Zerg zerg1 = new Zerg();
        zerg1.name = "Zerg1";
        Zerg zerg2 = new Zerg();
        zerg2.name = "Zerg2";
        Zerg zerg3 = new Zerg();
        zerg3.name = "Zerg3";
        Zerg zerg4 = new Zerg();
        zerg4.name = "Zerg4";
        Zerg zerg5 = new Zerg();
        zerg5.name = "Zerg5";
        Zerg zerg6 = new Zerg();
        zerg6.name = "Zerg6";
        Zerg zerg7 = new Zerg();
        zerg7.name = "Zerg7";
        Zerg zerg8 = new Zerg();
        zerg8.name = "Zerg8";
        Zerg zerg9 = new Zerg();
        zerg9.name = "Zerg9";
        Zerg zerg10 = new Zerg();
        zerg10.name = "Zerg10";

        new Protos().name = "Protos1";
        new Protos().name = "Protos2";
        new Protos().name = "Protos3";
        new Protos().name = "Protos4";
        new Protos().name = "Protos5";

        new Terran().name = "Terran1";
        new Terran().name = "Terran2";
        new Terran().name = "Terran3";
        new Terran().name = "Terran4";
        new Terran().name = "Terran5";
        new Terran().name = "Terran6";
        new Terran().name = "Terran7";
        new Terran().name = "Terran8";
        new Terran().name = "Terran9";
        new Terran().name = "Terran10";
        new Terran().name = "Terran11";
        new Terran().name = "Terran12";

    }


    public static class Zerg {
        public String name;
    }

    public static class Protos {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}