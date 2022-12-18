package lr4;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Для рисования прямоугольника введите ширину: ");

        int width = in.nextInt();
        System.out.println("И высоту: ");

        int height = in.nextInt();
        int [][] graph = new int [height][width];
        int z = 0;
        for (int i =0; i < height; i++){
            for (int j = 0; j <width; j++){
                graph[i][j] = 2;
            }
        }
        for (int i =0; i < height; i++){
            int count = i+1;
            System.out.print("номер строки " + count + " : ");
            for (int j = 0; j <width; j++){
                System.out.print(graph[i][j]+" ");
                z++;
            }
            System.out.println(" Количество символов в строке " + z);
            z = 0;
        }
    }
}
//     Напишите программу, в которой создается двумерный массив, который
//    выводит прямоугольник из цифр 2;