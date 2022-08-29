public class Lesson1 {
    public static void main(String[] args){

        int[] mas = new int[15];
        for(int i = 0; i < mas.length; i++) {
            if(i==0) {
                mas[i] = 0;
            }else if (i == 1) {
                mas[i] = 1;
            }
            else  {
                mas[i] = mas[i-2] + mas [i - 1];
            }
            System.out.print(mas[i] + " ");
        }

    }
}
