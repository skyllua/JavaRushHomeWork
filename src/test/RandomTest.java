package test;

public class RandomTest {

    public static void main(String[] args) {
        int countMax = 0;
        int lastRes = 0;

        while (true) {
            if ((int)(Math.random()+0.5) == 1) {
                countMax++;
            } else {
                if (lastRes < countMax) {
                    System.out.println(countMax);
                    lastRes = countMax;
                }
                countMax = 0;
            }
        }

    }

}
