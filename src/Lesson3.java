public class Lesson3 {
    public static void main(String[] args) {

        int mass1[] = {3, 5, 9, 10, 11, 14};
        int sum = 0;
        int n = 0;

        for(int i = 0; i < mass1.length; i++)

        {
            System.out.print(mass1[i] + " ");
        }
        System.out.println("\n Нечетные элементы:");
        for(int i = 0; i < mass1.length; i++)
        {
            if(mass1[i] % 2 != 0)
            {
                ++n;
                sum += mass1[i];
                System.out.print(mass1[i] + " ");
            }
        }
        System.out.println("\n Всего нечетных элементов : " + n);
        System.out.println("\n Их сумма равна: " + sum);
    }
}
