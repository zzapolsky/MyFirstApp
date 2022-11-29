package lr2;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число для проверки условия: ");
        int a = in.nextInt();

        if (a>=5 && a<=10) System.out.println("Ваше число попадает в диапазон от 5 до 10");
        else System.out.println("Число не попадаетв диапазон от 5 до 10");


    }
}


//4. Напишите программу, которая проверяет, попадает ли введение
//        пользователем число в диапазон от 5 до 10 включительно.