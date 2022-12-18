package lr4;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк массива для заполнения: ");
        int a =in.nextInt();

        System.out.println("Введите количество столбцов массива для заполнения: ");
        int b = in.nextInt();

        int zmeyka[][] = new int[a][b];
        int c = 0;
        int d = 0;
        int e = 0;

        for (int i = 0 ; e <zmeyka.length ; e++) {
            for (int j = 0 ; j <(zmeyka[i].length - c); j++) {
                zmeyka[i][j] = d;
                d++;
            }
            i++;
            for (int k = i; k <zmeyka.length; k++) {
                zmeyka[k][zmeyka[i].length-1-c] = d;
                d++;
            }
            c++;
        }
        int z = 0;
        for (int i =0; i < zmeyka.length; i++){
            int count = i+1;
            System.out.print("Номер строки " + count + " : ");
            for (int j = 0; j <zmeyka[i].length; j++){
                System.out.print(zmeyka[i][j]+" ");
                z++;
            }
            System.out.println("Количество символов в строке " + z);
            z = 0;
        }

    }
}
//    Напишите программу, в которой создается двумерный числовой массив
//        и этот массив заполняется «змейкой»: сначала первая строка (слева направо),
//        затем последний столбец (снизу вверх), вторая строка (слева направо) и так
//        далее