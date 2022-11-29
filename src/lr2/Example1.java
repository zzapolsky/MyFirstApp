package lr2;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Деление числа на 3");
        System.out.println("Введите число для проверки:");

        int a = in.nextInt();

        if (a% 3 == 0) System.out.println("Число делится на 3");
        else System.out.println("Число не делится на 3");

    }
}

// 1. Напишите программу, которая проверяет, делится ли введенное
//        Пользователем число на 3.