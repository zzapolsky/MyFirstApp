package lr4;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите высоту прямоугольника: ");
        int height = in.nextInt();
        char [][] mas = new char [height][];
        for (int i=0;i<mas.length;i++){
            int j = i+1;
            mas[i]=new char[j];
        }
        int a = 0;
        for (int i =0; i < height; i++){
            for (int j = 0; j <i+1; j++){
                mas[i][j] = '0';
            }
        }
        for (int i =0; i < height; i++){
            int count = i+1;
            System.out.print("номер строки " + count + " : ");
            for (int j = 0; j < mas[i].length; j++){
                System.out.print(mas[i][j]+" ");
                a++;
            }
            System.out.println(" Количество символов в строке " + a);
            a = 0;
        }
    }
}
//   Напишите программу, в которой создается двумерный массив, который
//    выводит прямоугольный треугольник;