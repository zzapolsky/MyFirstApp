package lr1;

import java.time.LocalDate;
import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите Ваш возраст: ");
        int age = in.nextInt();

        LocalDate today = LocalDate.now();

        int year = today.getYear();

        int b = year - age;
        System.out.println("Ваш год рождения - : " + b);

        in.close();
    }
}