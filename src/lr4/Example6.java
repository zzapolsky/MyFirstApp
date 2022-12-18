package lr4;

import java.util.Random;
import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {

        Random random = new Random(100);
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество строк массива: ");
        int a = in.nextInt();

        System.out.println("Введите количество столбцов массива: ");
        int b = in.nextInt();

        int array1[][] = new int[a][b];
        for (int i = 0 ; i <a; i++) {
            for (int j = 0 ; j <b; j++) {
                array1[i][j] = random.nextInt(100);
                System.out.println("i = "+i+"; j= "+j+"; value= "+array1[i][j]);
            }
        }
        System.out.println("-------------------------");

        int minusStroka = random.nextInt(a-1);
        int minusStolb = random.nextInt(b-1);

        System.out.println("Удаляем строку "+(minusStroka));
        System.out.println("Удаляем столбец "+(minusStolb));
        System.out.println("-------------------------");

        int array2[][] = new int[a-1][b-1];
        for (int i=0, s = 0; i<a-1; s++) {
            if (s!=minusStroka){
                for (int j =0, k = 0 ; j <b-1; k++) {
                    if (k != minusStolb) {
                        array2[i][j] = array1[s][k];
                        System.out.println("i = " + i + "; j= " + j + "; value= " + array2[i][j]);
                        j++;
                    }
                }
                i++;
            }
        }
    }
}
//    Напишите программу, в которой создается и инициализируется
//    двумерный числовой массив. Затем из этого массива удаляется строка и
//столбец (создается новый массив, в котором по сравнению с исходным
//                удалена одна строка и один столбец). Индекс удаляемой строки и индекс
//        удаляемого столбца определяется с помощью генератора случайных чисел.