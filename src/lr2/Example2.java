package lr2;

import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число для проверки удовлетворения условиям:");
        int a = in.nextInt();

        if (a% 5 == 2 && a% 7 == 1)  System.out.println("Число делится на 5 с остатком 2, и делится на 7 с остатком 1");
        else System.out.println("Число не удовлетворяет условиям");
    }
}

//2. Напишите программу, которая проверяет, удовлетворяет ли введенное
//        пользователем число следующим критериям: при делении на 5 в остатке
//        получается 2, а при делении на 7 в остатке получается 1.( Число для ответа = 22)