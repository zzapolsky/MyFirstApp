package lr3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example5_1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел");
        int size = in.nextInt();

        if (size > 0) {
            Random random = new Random();
            int[] ints = new int[size];
            for (int i = 0; i < ints.length; i++) {
                int x = 0;
                if (x % 5 == 2 | x % 3 == 1) {
                    System.out.println(x);
                } else x++;
            }

        }


    }
}
//    Напишите программу, в которой вычисляется сумма чисел,
//    удовлетворяющих таким критериям: при делении числа на 5 в остатке получается 2, или при делении на 3 в остатке получается 1. Количество чисел в сумме
////        вводится пользователем. Программа отображает числа, которые
//        суммируются, и значение суммы. Предложите версии программы,
//        использующие разные операторы цикла.