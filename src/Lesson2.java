public class Lesson2 {
    public static void main(String[] args) {

        int am = 0, a0 = 0, a1 = 0;
        int[] mas = new int[5];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int)
                    (Math.random() * 3) - 1;
            System.out.print(mas[i] + " ");
            if (mas[i] < 0) am++;
            if (mas[i] == 0) a0++;
            if (mas[i] > 0) a1++;
            if (i == mas.length - 1) {
                if (am > a0 & am > a1)

                    System.out.println("\n Чаще всего встречается -1");
                if (a0 > am & a0 > a1)

                    System.out.println("\n Чаще всего встречается 0");
                if (a1 > am & a1 > a0)

                    System.out.println("\n Чаще всего встречается 1");

            }
        }
    }
}