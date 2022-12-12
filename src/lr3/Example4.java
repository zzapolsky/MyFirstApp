package lr3;

import java.util.Scanner;

public class Example4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое целое число");
        int a = in.nextInt();
        System.out.println("Введите второе целое число");
        int b = in.nextInt();

        Num.ForNum(a,b);
        Num.WhileNum(a,b);
    }
        static class Num {
        static void ForNum(int a,int b){

        int size = (b - a) + 1;
        int[] nums = new int[size];

        for (int i=0; i< nums.length; i++) {
            nums[i] = a;
            a++;
        }
       for (int i=0; i< nums.length; i++){
            System.out.println(nums[i]);
        }
       }
       static void WhileNum(int a,int b) {

           while (a < b + 1) {
               System.out.println("while " + a);
               a++;
           }
       }
    }
}
//    Напишите программу, в которой пользователем вводится два
 //   целых числа. Программа выводит все целые числа — начиная с наименьшего
//        (из двух введенных чисел) и заканчивая наибольшим (из двух введенных
//        чисел). Предложите разные версии программы (с использованием разных
//        операторов цикла).