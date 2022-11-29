package lr2;

import java.util.Scanner;

public class Example3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число для проверки удовлетворения условиям:");
        int a = in.nextInt();

        if (a >= 10 && a% 4 == 0 ) System.out.println("Число больше 10 и при этом делится на 4");
        else System.out.println("Число не удовлетворяет условиям");

    }
}

//3. Напишите программу, которая проверяет, удовлетворяет ли введенное
//        пользователем число следующим критериям: число делится на 4, и при
//        этом оно не меньше 10.